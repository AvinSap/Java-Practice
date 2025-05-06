public class Main {
    public static void main(String[] args){

        //CREATING A NEW OBJECT
        SportCar lambo = new SportCar("Lamborghini", "SVJ", "Black");

        //APPLYING METHODS:
        lambo.activateTurboBoost();
        System.out.println(lambo.make + " is Moving at the spped of"+ lambo.getSpeed() + " MPH");
        //Calling the basic actions
        lambo.accelerator();
        lambo.brake();

    }

}
