package classes.inheritance.shapes;

public class Circle extends Shape{
    private int radius = 0;
    public Circle(int radius) {
        this.radius = radius;
    }

    public float area() {
        return (22f/7)*radius*radius;
    }

    public float perimeter() {
        return 2 * (22f/7) * radius;
    }

    public void test() {
        System.out.println("test");
    }
}
