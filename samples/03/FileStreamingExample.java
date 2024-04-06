import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
import java.net.URLStreamHandler;
import java.nio.ByteBuffer;
import java.nio.channels.AsynchronousFileChannel;
import java.nio.channels.CompletionHandler;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.concurrent.CountDownLatch;

public class FileStreamingExample {
    public static void main(String[] args) throws Exception {
        String videoFilePath = "video.mp4";
        URI uri = URI.create("http://example.com/upload");
        URL serverUrl = uri.toURL();
        HttpURLConnection connection = (HttpURLConnection) serverUrl.openConnection();
        connection.setRequestMethod("POST");
        connection.setDoOutput(true);
        connection.setRequestProperty("Content-Type", "video/mp4");

        AsynchronousFileChannel fileChannel = AsynchronousFileChannel.open(Paths.get(videoFilePath),
                StandardOpenOption.READ);
        ByteBuffer buffer = ByteBuffer.allocate(8192); // Adjust buffer size as needed
        CountDownLatch latch = new CountDownLatch(1);

        fileChannel.read(buffer, 0, buffer, new CompletionHandler<Integer, ByteBuffer>() {
            @Override
            public void completed(Integer result, ByteBuffer attachment) {
                attachment.flip();
                try {
                    OutputStream outputStream = connection.getOutputStream();
                    while (attachment.hasRemaining()) {
                        outputStream.write(attachment.get());
                    }
                    outputStream.flush();
                    outputStream.close(); // Close the output stream after writing the chunk
                } catch (Exception e) {
                    e.printStackTrace();
                }
                if (result != -1) { // Continue reading next chunk if not end of file
                    attachment.clear();
                    fileChannel.read(attachment, result, attachment, this);
                } else {
                    try {
                        fileChannel.close();
                        connection.disconnect();
                        latch.countDown(); // Signal completion
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }

            @Override
            public void failed(Throwable exc, ByteBuffer attachment) {
                exc.printStackTrace();
                try {
                    fileChannel.close();
                    connection.disconnect();
                    latch.countDown(); // Signal completion
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

        latch.await(); // Wait for completion
    }
}
