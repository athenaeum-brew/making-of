import java.io.FileOutputStream;
import java.io.IOException;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.Vertx;
import io.vertx.core.http.HttpServer;
import io.vertx.core.http.HttpMethod;

public class SimpleHttpServer extends AbstractVerticle {

    @Override
    public void start() throws Exception {
        System.out.println("Entering start...");
        HttpServer server = vertx.createHttpServer();

        System.out.println("vertx server created...");
        server.requestHandler(request -> {
            if (request.method() == HttpMethod.POST) {
                request.handler(data -> {
                    // Specify the file path where you want to save the video
                    String filePath = "received_video.mp4";
                    try (FileOutputStream outputStream = new FileOutputStream(filePath)) {
                        // Write the received video data to the file
                        outputStream.write(data.getBytes());
                    } catch (IOException e) {
                        e.printStackTrace();
                        request.response().setStatusCode(500).end("Error saving video");
                        return;
                    }
                    request.response().setStatusCode(200).end("Video saved successfully");
                });
            } else {
                request.response().setStatusCode(405).end();
            }
        });

        System.out.println("About to start server ...");
        server.listen(8000, "localhost", res -> {
            if (res.succeeded()) {
                System.out.println("Server is running and listening on port 8000");
            } else {
                System.err.println("Failed to start server: " + res.cause());
            }
        });
    }

    public static void main(String[] args) {
        System.out.println("Entering main...");
        Vertx vertx = Vertx.vertx();
        vertx.deployVerticle(new SimpleHttpServer());
    }
}
