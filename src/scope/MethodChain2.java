package scope;

public class MethodChain2 {
    public static void main(String[] args) {
        method1();
        method3();
        method4();
        method2();
    }
    public static void method1() {
        System.out.println("Method 1");
    }
    public static void method2() {
        System.out.println("Method 2");
    }

    public static void method3() {
        System.out.println("Method 3");
    }

    public static void method4() {
        System.out.println("Method 4");
    }

}
