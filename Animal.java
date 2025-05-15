public interface Animal {
    default void eat() {
        System.out.println("the animal is eating");
    }

    default void sleep(){
        System.out.println("the animal is eating");
    }
}
