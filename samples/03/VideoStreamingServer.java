import java.io.*;
import java.net.*;

public class VideoStreamingServer {
    public static void main(String[] args) {
        final String videoFilePath = "video-640x272.mp4"; // "video-1280x544"; // Path to your video file

        try {
            // Open the video file
            File videoFile = new File(videoFilePath);
            FileInputStream fis = new FileInputStream(videoFile);

            // Create a server socket
            ServerSocket serverSocket = new ServerSocket(12345); // Port number to stream on

            // Wait for a client to connect
            System.out.println("Waiting for VLC to connect...");
            Socket clientSocket = serverSocket.accept();
            System.out.println("VLC connected!");

            // Get the output stream of the client socket
            OutputStream out = clientSocket.getOutputStream();

            // Write the video data to the client
            byte[] buffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = fis.read(buffer)) != -1) {
                out.write(buffer, 0, bytesRead);
            }

            // Close streams and sockets
            fis.close();
            out.close();
            clientSocket.close();
            serverSocket.close();

            System.out.println("Streaming completed.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
