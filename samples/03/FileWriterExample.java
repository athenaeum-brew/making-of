import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {
    public static void main(String[] args) throws IOException {
        FileWriter fileWriter = new FileWriter("example-write.txt");
        fileWriter.write("Hello, File I/O!");
        fileWriter.close();
    }
}