import java.util.Scanner;

public class Player {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int innerLoop = 1;
        int outerLoop = 1;
        int userChoice = 1;
        do {
            switch (artistsChoiceMenu(keyboard)) {
                case 1:
                    Drake drizzy = new Drake();
                    System.out.println("The Artist that you selected is" + drizzy.getNameOfArtist());
                    System.out.println();

                    userChoice = artistsDetailsManipulationMenu(keyboard, drizzy);
                    switch (userChoice) {
                        case 1:
                            System.out.println("Display Songs:");
                            int displaySongs = keyboard.nextInt();
                        case 2:
                        case 3:
                        case 4:
                    }
                    innerLoop = keyboard.nextInt();

            }



        }while (innerLoop == 1) ;


    }

    private static int artistsChoiceMenu(Scanner keyboard) {
        int choiceGivenByUser;

        System.out.println("----------------- WELCOME TO SPOTIFY MEDIA PLAYER -----------------");
        System.out.println("PLEASE CHOOSE AN ARTIST TO PLAY:");
        System.out.println("1.DRAKE");
        System.out.println("2.CHRIS BROWN");
        System.out.println("3.SUMMER WALKER");
        System.out.println("4.EXIT");
        System.out.println("--------------------------------------------------------------------");
        System.out.println("Please Select A Number Between (1-4)........");
        choiceGivenByUser = keyboard.nextInt();
        return choiceGivenByUser;
    }

    private static int artistsDetailsManipulationMenu(Scanner keyboard, Artists artists) {
        int choiceGivenByUser;

        System.out.println("******* ANIMAL details menu for: " + artists.getNameOfArtist() + " ******");
        System.out.println("1. Display Artist's Songs");
        System.out.println("2. Display Artist's Profile");
        System.out.println("3. Display Artist's Stats");
        System.out.println("4. Share Artist ");

        System.out.println("Enter choice (1-4):");
        choiceGivenByUser = keyboard.nextInt();
        return choiceGivenByUser;

    }


}