package scope;

public class MethodChain1 {
    public static void main(String[] args) {
        method1();
        method2();
    }
    public static void method1() {
        System.out.println("Method 1");
        method3();
    }
    public static void method2() {
        System.out.println("Method 2");
        method4();
    }

    public static void method3() {
        System.out.println("Method 3");
    }

    public static void method4() {
        System.out.println("Method 4");
    }

}
