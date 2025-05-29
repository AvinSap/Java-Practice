public class Sedan extends Car{
 int doors;

    Sedan(String regNo, Engine engine) {
        super(regNo, engine);
    }

    @Override
    public String getMake() {
        return this.make;
    }

    @Override
    public String getModel() {
        return this.model;
    }

    @Override
    public String getColor() {
        return this.color;
    }

    @Override
    public void startEngine() {
        System.out.println("The Sedan with : " + this.getDetails() + " started its Engine");

    }
}
