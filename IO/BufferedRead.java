import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;

public class BufferedRead {
    public static void main(String[] args) {
        File myTest = new File("src/file.txt");
        try (BufferedReader inputStream = new BufferedReader(new FileReader(myTest))) {
            int character;
            while ((character = inputStream.read()) != -1) {
                System.out.print((char) character);
            }
        } catch (FileNotFoundException fileNotFoundException) {
            System.err.println("File Not Found!");
        } catch (IOException ioException) {
            System.err.println(ioException.getMessage());
        }
    }

}
