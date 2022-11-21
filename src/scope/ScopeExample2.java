package scope;

public class ScopeExample2 {
    public static void main(String[] args) {
        int a1 = 10;
        int a2 = 20;
        System.out.println(a1);
        {
            int b1 = 30;
            int b2 = 40;
            System.out.println(b1);
            System.out.println(b2);
        }
        System.out.println(a1);
        System.out.println(a2);
    }
}
