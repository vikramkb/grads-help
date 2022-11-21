package scope;

public class ScopeExample {
    public static void main(String[] args) {
        int a = 10;
        System.out.println("main : " + a);
        method1();
        System.out.println("main : " + a);
    }

    public static void method1() {
        int b = 20;
        System.out.println("method1 : " + b);
        method2();
        System.out.println("method1 : " + b);
    }

    public static void method2() {
        int c = 30;
        System.out.println("method2 : " + c);
        method3();
        System.out.println("method2 : " + c);
    }

    public static void method3() {
        int d = 40;
        System.out.println("method3 : " + d);
    }

}
