public class AddNumbers {
    public static void main(String[] args) {
        int result = 1 + 2 + 3 + 4 + 5;
        System.out.println(result);

        int result1 = 0;
        for(int i=1; i <= 5; i++) {
            result1 = result1 + i;
        }
        System.out.println(result1);
    }
}
