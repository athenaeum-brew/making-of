import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileReaderExampleWithNIO {
    public static void main(String[] args) {
        Path path = Paths.get("example-read.txt");
        try {
            byte[] data = Files.readAllBytes(path);
            System.out.println(new String(data));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
