package classes.hyderabad;

public class Neibhour {
    public void test() {
        Parent p1 = new Parent();
        System.out.println(p1.number2);
        System.out.println(p1.number3);
        System.out.println(p1.number4);
        p1.method2();
        p1.method3();
        p1.method4();

        Parent.testMe();
    }
}
