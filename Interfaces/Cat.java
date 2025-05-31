public class Cat implements AnimalSub  {
    @Override
    public void eat() {
        System.out.println("the cat is eating");
    }

    @Override
    public void sleep() {
        System.out.println("the cat is sleeping");
    }

    @Override
    public void countSteps() {
        System.out.println("The cat walked 50 steps today.");
    }
}
