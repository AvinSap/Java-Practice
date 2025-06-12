public class UsePlayers {
    public static void main (String [] args){
        Player pl = null;
        printPlayer(pl); //testing the null handling

        //CREATING PLAYER OBJECT:
        Player[ ] players = new Player[5];
        Player pl1 = new Player("Cristiano Ronaldo",40);
        Player pl2 = new Player("Leonel Messi",38);
        Player pl3 = new Player("David Beckham", 45);
        Player pl4 = new Player("Karim Benzema", 40);
        Player pl5 = new Player("Marcelo", 40);

        //ASSIGNING ARRAY INDICES ( 0-4 )
        players[0] = pl1;
        players[1] = pl2;
        players[2] = pl3;
        players[3] = pl4;
        players[4] = pl5;
        listPlayers(players); // displays all players

        salaryOfPlayer();

    }
    private static void printPlayer(Player player) {
        try {
            System.out.println("Name Of the Player: " + player.getName());
        }catch (NullPointerException e){
            System.out.println(e.getMessage());
        }
    }

    private static void listPlayers(Player[] players){
        try {
            for (int i = 0; i <= players.length; i++){
                System.out.println(players[i].getName() + ", " + "Age: " + players[i].getAge());
            }
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
    }

    private static void salaryOfPlayer(){
        try {
            int amount = 20000000;
            int tax = 0;
            System.out.println("Total Salary: " + (amount/ tax));
        }catch (ArithmeticException e){
            System.out.println("/ by zero so will not print a result");
        }
    }
}
