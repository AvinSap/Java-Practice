public class Vehicle {
    //ATTRIBUTES:
    String make;
    String model;
    String color;
    int speed;

    //Parameterized CONSTRUCTOR
    public Vehicle(String make, String model, String color){
        this.make = make;
        this.model = model;
        this.color = color;
        this.speed = 0;
    }
    //METHODS:(ACTIONS)
    public void accelerator(){
        System.out.println("The Car is Accelerating....");
        speed += 10;
    }
    public void brake(){
        System.out.println("The Car is Slowing Down....");
        speed -= 10;
    }
    public void turn(String direction){
        System.out.println("The Car is Turning: " + direction);
    }
    int getSpeed(){
        return speed;
    }
}
