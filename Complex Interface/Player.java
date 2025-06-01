import java.util.Scanner;

public class Player {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int choice = 1;
        while (choice != 6) {
            MediaPlayer player = new MediaPlayer();
            System.out.println("Welcome to Avin's Media Player :");
            System.out.println("1.Play");
            System.out.println("2.Pause");
            System.out.println("3.Stop");
            System.out.println("4.Increase Volume");
            System.out.println("5.Decrease Volume");
            System.out.println("5.Decrease Volume");
            System.out.println("6.Exit");
            System.out.println("Select an Option......");
            System.out.println(" ");

            if (keyboard.hasNextInt()) {
                choice = keyboard.nextInt();


                switch (choice) {
                    case 1:
                        player.play();
                        break;
                    case 2:
                        player.pause();
                        break;
                    case 3:
                        player.stop();
                        break;
                    case 4:
                        player.increase(10);
                        break;
                    case 5:
                        player.decrease(10);
                        break;
                    case 6:
                        System.out.println("Thank you....");
                        break;
                    default:
                        System.out.println("Pick between 1-6");
                }
            } else {
                System.out.println("Invalid input. Please enter a number between 1 and 6.");
                keyboard.next();  // clear invalid input
            }
        }

        keyboard.close();
    }
}
