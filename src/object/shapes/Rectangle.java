package classes.inheritance.shapes;

public class Rectangle extends Shape {
    private int length = 0;
    private int bredth = 0;

    public Rectangle(int length, int bredth) {
        this.length = length;
        this.bredth = bredth;
    }

    public float area() {
        return length * bredth;
    }

    public float perimeter() {
        return 2*(length + bredth);
    }

    public void test() {
        System.out.println("test");
    }

}
