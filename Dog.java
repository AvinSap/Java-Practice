public class Dog implements AnimalSub {

    public void eat() {
        System.out.println("the Dog is eating");
    }
    @Override
    public void sleep() {
        System.out.println("the Dog is sleeping");
    }

    @Override
    public void countSteps() {
        System.out.println("The dog walked 50 steps today.");
    }
}
