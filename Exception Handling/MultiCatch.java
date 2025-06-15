public class MultiCatch {
    public static void main(String [] args){
        try{
            int myInt = Integer.parseInt("exception");
        }
        catch(NumberFormatException | NullPointerException e){
            System.out.println("Sorry exception occurred");
        }finally {
            System.out.println("In the finally block");
        }
        System.out.println("ThankYou");
    }

}
