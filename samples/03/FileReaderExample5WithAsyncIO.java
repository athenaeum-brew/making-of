import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.AsynchronousFileChannel;
import java.nio.channels.CompletionHandler;
import java.nio.file.Paths;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.concurrent.CountDownLatch;

public class FileReaderExample5WithAsyncIO {
    public static void main(String[] args) throws IOException, InterruptedException {
        Path path = Paths.get("example-read.txt");
        AsynchronousFileChannel fileChannel = AsynchronousFileChannel.open(path, StandardOpenOption.READ);
        ByteBuffer buffer = ByteBuffer.allocate(1024);
        CountDownLatch latch = new CountDownLatch(1);

        fileChannel.read(buffer, 0, buffer, new CompletionHandler<Integer, ByteBuffer>() {
            @Override
            public void completed(Integer result, ByteBuffer attachment) {
                System.out.println("...file read!");
                attachment.flip();
                byte[] data = new byte[attachment.limit()];
                attachment.get(data);
                System.out.println(new String(data));
                latch.countDown(); // Signal that operation is complete
            }

            @Override
            public void failed(Throwable exc, ByteBuffer attachment) {
                exc.printStackTrace();
                latch.countDown(); // Signal that operation is complete even if failed
            }
        });
        System.out.println("reading file ...");

        latch.await(); // Wait for the operation to complete

        // Close the file channel (optional)
        fileChannel.close();
    }
}
