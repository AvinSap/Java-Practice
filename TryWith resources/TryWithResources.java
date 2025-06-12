import java.io.FileInputStream;
import java.io.IOException;

public class TryWithResources {
    public static void main(String[] args){
        try(FileInputStream file =
                    new FileInputStream("src/test.txt")){
             int content;
             while ((content = file.read()) != -1){
                System.out.print((char) content);
            }
        }catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }
    }

}
