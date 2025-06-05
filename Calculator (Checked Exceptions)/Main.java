import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        try {
            calc.readNumbersFromFile();
            int result = calc.add();
            System.out.println("Sum: " + result);
            int result1 = calc.subtract();
            System.out.println("Difference: " + result1);
            int result2 = calc.multiply();
            System.out.println("Multiplication: " + result2);
            float result3 = calc.divide();
            System.out.println("Division: " + result3);
        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found!");
            e.printStackTrace();
        }
    }
}