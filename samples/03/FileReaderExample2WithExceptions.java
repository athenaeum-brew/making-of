import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample2WithExceptions {
    public static void main(String[] args) {
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader("example--read.txt"));
            int data;
            while ((data = reader.read()) != -1) {
                System.out.print((char) data);
            }
            System.out.println();
        } catch (IOException e) {
            // e.printStackTrace();
            System.out.println("Here I MUST handle the exception !");
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
