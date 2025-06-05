import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Calculator {
    int firstNo;
    int secondNo;

    int add(){
        return firstNo + secondNo;
    }
    int subtract(){
        return firstNo - secondNo;
    }
    int multiply(){
        return firstNo * secondNo;
    }
    float divide(){
        return (float) firstNo / secondNo;
    }
    void readNumbersFromFile() throws FileNotFoundException {
        Scanner fileScanner = new Scanner(new File("src/numbers.txt"));
        this.firstNo = fileScanner.nextInt();
        this.secondNo = fileScanner.nextInt();
        fileScanner.close();
    }
}
