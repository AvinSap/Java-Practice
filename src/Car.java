public class Car extends Vehicle {
    int seatPosition;

    public Car(String make, String model, String color) {
        super(make, model, color);
        this.seatPosition = 0;
        System.out.println("Sports Car Created");
    }

    public void adjustSeat(int adjustment) {
        seatPosition += adjustment;
        if (adjustment > 0) {
            System.out.println("The seat moves Forward.");
        } else if (adjustment < 0) {
            System.out.println("The seat moves Backward");
        } else {
            System.out.println("The Seat Stays Constant");
        }
    }
}