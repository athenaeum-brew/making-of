import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("example-read.txt");
        int data;
        while ((data = fileReader.read()) != -1) {
            System.out.print((char) data);
        }
        System.out.println();
        fileReader.close();
    }
}