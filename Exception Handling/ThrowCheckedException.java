import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowCheckedException {
    public static void main(String [] args){
       try {
           m2();
       }catch (FileNotFoundException e){
           System.out.println("File Not Found: " + e.getMessage());
       }
    }
    private static void m2() throws FileNotFoundException{
        m1();
    }
    private static void m1() throws FileNotFoundException{
       try {
           FileInputStream fileInputStream = new FileInputStream("src/test.txt");
       }catch (FileNotFoundException e){
           throw e;
       }
    }
}
