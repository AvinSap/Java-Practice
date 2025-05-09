public class RunTheRobo {
    public static void main(String[] args) {

        Cupid sideKickObj = new Cupid();

        System.out.println("Mode of operation is: " + sideKickObj.getModeOfOperation());
        sideKickObj.setChoice();
        sideKickObj.setModeOfOperation(1);
        sideKickObj.takeAction();
        sideKickObj.setChoice();
        sideKickObj.setModeOfOperation(2);
        sideKickObj.takeAction();
        sideKickObj.setChoice();
        sideKickObj.setModeOfOperation(3);
        sideKickObj.takeAction();
    }
}