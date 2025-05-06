public class SportCar extends Car {
    int turboBoost;

    public SportCar(String make, String model, String color){
        super(make, model, color);
        this.turboBoost = 0; //default with no active boost
        System.out.println("Sports Car Created");
    }
    public void activateTurboBoost(){
        super.accelerator();
        System.out.println("The Boost is Activated...");
    }

}