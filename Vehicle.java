public abstract class Vehicle {
    String registrationNo;
    Engine engine; // object of Engine Class

    Vehicle(String regNo, Engine engine){
        this.registrationNo = regNo;
        this.engine = engine;
    }

    public abstract void startEngine();
}
