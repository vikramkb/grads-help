package classes.inheritance.shapes;

public class ShapeMain {
    public static void main(String[] args) {
        Circle c1 = new Circle(10);
        Circle c2 = new Circle(5);
        Sqaure s1 = new Sqaure(10);
        Sqaure s2 = new Sqaure(5);
        Rectangle r1 = new Rectangle(10, 5);
        Rectangle r2 = new Rectangle(15, 10);

        c1.test();
        s1.test();
        r1.test();

        Shape[] shapes = {c1, c2, s1, s2, r1, r2};
        for(int i=0; i < shapes.length; i++) {
            Shape shape = shapes[i];
            System.out.println(shape.area());
            System.out.println(shape.perimeter());
            shape.printShape();
        }

    }
}
