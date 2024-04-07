import java.io.*;
import java.net.*;
import java.nio.ByteBuffer;
import java.nio.channels.*;
import java.nio.file.*;
import java.util.Random;

public class VideoStreamingServerNIO {
    public static void main(String[] args) {
        final String videoFilePath = "video-1280x544.mp4"; // "video-640x272.mp4"; // Path to your video file
        final int maxSleepMillis = 200; // Maximum sleep time in milliseconds

        try {
            // Open the video file
            FileChannel fileChannel = FileChannel.open(Paths.get(videoFilePath), StandardOpenOption.READ);

            // Create a server socket channel
            ServerSocketChannel serverSocketChannel = ServerSocketChannel.open();
            serverSocketChannel.bind(new InetSocketAddress(12345)); // Port number to stream on
            serverSocketChannel.configureBlocking(true);

            System.out.println("Waiting for VLC to connect...");

            // Accept a connection from VLC
            SocketChannel clientSocketChannel = serverSocketChannel.accept();
            System.out.println("VLC connected!");

            // Get the file channel's size
            long fileSize = fileChannel.size();

            // Allocate a buffer for reading from the file
            ByteBuffer buffer = ByteBuffer.allocate(32768); // Adjust buffer size as needed

            // Write the file data to the client
            long totalBytesRead = 0;
            int bytesRead;
            Random random = new Random();
            while ((bytesRead = fileChannel.read(buffer)) != -1) {
                buffer.flip();
                while (buffer.hasRemaining()) {
                    int bytesWritten = clientSocketChannel.write(buffer);
                    totalBytesRead += bytesWritten;
                    System.out.println(" bytes read from file: " + bytesRead + " / " + bytesWritten + " | "
                            + totalBytesRead + " / " + fileSize);
                }
                buffer.clear();

                // Introduce random sleep to simulate disk read latency
                int sleepMillis = random.nextInt(maxSleepMillis);
                System.out.println("sleep " + sleepMillis + " millisecs");
                Thread.sleep(sleepMillis);
            }

            System.out.println("Total bytes read from file: " + totalBytesRead);

            // Close channels
            fileChannel.close();
            clientSocketChannel.close();
            serverSocketChannel.close();

            System.out.println("Streaming completed.");
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
