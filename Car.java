public abstract class Car extends Vehicle {
    String make;
    String model;
    String color;
    int yearManufactured;
    Car (String regNo, Engine engine){
        super(regNo, engine);
    }

    public abstract String getMake();


    public abstract String getModel();

    public void getYearManufactured(int yearManufactured) {
        this.yearManufactured = yearManufactured;
    }

    public abstract String getColor();

    public String getDetails(){
        return "Registration: "+ this.registrationNo + " and Manufactured year: " + this.yearManufactured;
    }
}
