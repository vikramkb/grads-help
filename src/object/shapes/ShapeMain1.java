package classes.inheritance.shapes;

public class ShapeMain1 {
    public static void main(String[] args) {
        Shape s1 = new Circle(10);
        s1.area(); //overriding
        s1.perimeter(); //overriding
        s1.printShape();

        //no overriding
        Shape s2 = new Shape();
        s2.perimeter();
        s2.area();
        s2.printShape();

        //no overriding
        Circle c1 = new Circle(10);
        c1.area();
        c1.perimeter();
        c1.printShape();
    }
}
