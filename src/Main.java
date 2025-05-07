import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        User user1 = new User( "Avin Sapkota","avinsapkota212@gmail.com", "Asian","California","Nepali");
        User user2 = new User("Drake","drake6@gmail.com","Mix-Black","Toronto","Canadian");

        int name;
        do{
            System.out.println("Select a User (1-2)...");
            while (!keyboard.hasNextLine()) {
                keyboard.nextLine();
            }
            name = keyboard.nextInt();
            if (name == 1) {
                System.out.println("Welcome Avin");
                user1.getUserDetails();
            } else if (name == 2) {
                System.out.println("Welcome Drake");
                user2.getUserDetails();
            } else {
                System.out.println("Sorry type 1 or 2...");
            }
        }while (name != 0 );
    }

}
