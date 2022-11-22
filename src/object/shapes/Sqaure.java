package classes.inheritance.shapes;

public class Sqaure extends Shape {
    private int side = 0;

    public Sqaure(int side) {
        this.side = side;
    }

    public float area() {
        return side * side;
    }

    public float perimeter() {
        return 4 * side;
    }

    public void test() {
        System.out.println("test");
    }
}
