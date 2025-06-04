public class Rectangle extends Quadrangle {
    float width;
    float height;

    Rectangle(float w, float h){
        this.width = w;
        this.height = h;
    }

    @Override
    void perimeter() {
      float perimeter = this.width + this.width + this.height + this.height;
      System.out.println("Perimeter of Rectangle: " + perimeter);
    }

    @Override
    void area() {
        float area = this.width * this.height;
        System.out.println("Area of Rectangle: " + area);
    }
}

