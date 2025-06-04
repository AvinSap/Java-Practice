public class Square extends Quadrangle {
    public float side;

    Square(float s){
        this.side = s;
    }
    @Override
    void perimeter() {
        float perimeter = 4 * side;
        System.out.println("Square perimeter: " + perimeter);
    }

    @Override
    void area() {
        float area = side * side;
        System.out.println("Square area: " + area);

    }
    void diagonal() {
        double diagonal = side * Math.sqrt(2);
        System.out.println("Square diagonal: " + diagonal);
    }
}
