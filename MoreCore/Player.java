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
                    RapArtist rapArtist = new RapArtist();
                    System.out.println("The Artist that you selected is" + rapArtist.getNameOfArtist());
                    System.out.println();

                    userChoice = artistsDetailsManipulationMenu(keyboard, rapArtist);
                    switch (userChoice) {
                        case 1:
                            System.out.println("--------------------- TOP 5 RAPPERS --------------------- ");
                            System.out.println("1.DRAKE");
                            System.out.println("2.Eminem");
                            System.out.println("3.J-Cole");
                            System.out.println("4.Gunna");
                            System.out.println("5.FUTURE");

                            System.out.println("ENTER NUMBERS (1-4) to pick an artist.....");
                            int displayRapArtists = keyboard.nextInt();
                            keyboard.nextLine();

                            switch (displayRapArtists){
                                case 1:
                                    System.out.println("Enter Name of the Artist");
                                    rapArtist.setNameOfArtist(keyboard.nextLine());
                                    System.out.println("Enter the album you wanna listen to");
                                    rapArtist.setAlbumName(keyboard.nextLine());
                                    System.out.println("Enter the album you wanna listen to");
                                    rapArtist.setSongName(keyboard.nextLine());
                                    System.out.println("Enter the Rank");
                                    rapArtist.setRank(keyboard.nextInt());
                                    System.out.println("Enter Monthly listener");
                                    rapArtist.setRank(keyboard.nextInt());
                                    System.out.println("Enter Followers in round figure");
                                    rapArtist.setFollowers(keyboard.nextInt());



                                    System.out.println();
                                    rapArtist.shuffle();
                                    rapArtist.play();

                                    break;
                                case 2:
                                    rapArtist.shuffle();
                                    rapArtist.play();
                                    break;
                                case 3, 4, 5:
                                    rapArtist.play();
                                    break;
                                default:
                                    throw new IllegalStateException("Unexpected value: " + displayRapArtists);
                            }
                           break;
                        case 2:
                            System.out.println("--------------------- TOP 5 RAP SONGS --------------------- ");
                            System.out.println("1.POUND CAKE");
                            System.out.println("2.MOCKING BIRD");
                            System.out.println("3.MIDDLE CHILD");
                            System.out.println("4.OH OKAY");
                            System.out.println("5.TOO COMFORTABLE");

                        case 3:
                            rapArtist.reviewComment();
                            System.out.println("No Of HIts");

                        case 4:


                        default:
                    }
                    break;

                        case 2:
                            PopArtist popArtist = new PopArtist();
                            System.out.println("The Artist that you selected is" + popArtist.getNameOfArtist());
                            System.out.println();
                            userChoice = artistsDetailsManipulationMenu(keyboard, popArtist);
                            switch (userChoice) {
                                case 1:
                                    System.out.println("--------------------- TOP 5 POP ARTISTS --------------------- ");
                                    System.out.println("1.Chris Brown");
                                    System.out.println("2.Tory Lanez");
                                    System.out.println("3.Sajjan Raj Vaidhya");
                                    System.out.println("4.Bryson Tiller");
                                    System.out.println("5.Kid Laroi");
                                    int displayPopArtists = keyboard.nextInt();
                                    break;
                                case 2:
                                    System.out.println("--------------------- TOP 5 POP SONGS --------------------- ");
                                    System.out.println("1.DRAKE");
                                    System.out.println("2.Eminem");
                                    System.out.println("3.J-Cole");
                                    System.out.println("4.Gunna");
                                    System.out.println("5.FUTURE");
                                case 3:
                                case 4:
                                default:
                            }
                            break;


                            case 3:
                                System.out.println("Sorry Not Available Yet");
                                break;
                        case 4:
                            System.out.println("Thank You for Using Spotify");
                default:
                    System.out.println("Sorry Please Enter Valid Number....");
                    }
                    innerLoop = keyboard.nextInt();
        }while (innerLoop == 1) ;


    }

    private static int artistsChoiceMenu(Scanner keyboard) {
        int choiceGivenByUser;

        System.out.println("----------------- WELCOME TO SPOTIFY MEDIA PLAYER -----------------");
        System.out.println("PLEASE CHOOSE AN ARTIST TO PLAY:");
        System.out.println("1.RAP ARTIST");
        System.out.println("2.POP ARTIST");
        System.out.println("3.HOUSE ARTIST");
        System.out.println("4.EXIT");
        System.out.println("--------------------------------------------------------------------");
        System.out.println("Please Select A Number Between (1-4)........");
        choiceGivenByUser = keyboard.nextInt();
        return choiceGivenByUser;
    }

    private static int artistsDetailsManipulationMenu(Scanner keyboard, Artist artist) {
        int choiceGivenByUser;

        System.out.println("******* ANIMAL details menu for: " + artist.getNameOfArtist() + " ******");
        System.out.println("1. Display Artists");
        System.out.println("2. Display Songs");
        System.out.println("3. Display Stats");
        System.out.println("4. Share Artist ");

        System.out.println("Enter choice (1-4):");
        choiceGivenByUser = keyboard.nextInt();
        return choiceGivenByUser;

    }


}