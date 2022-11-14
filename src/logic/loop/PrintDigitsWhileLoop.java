package logic.loop;

public class PrintDigitsWhileLoop {
    public static void main(String[] args) {
        int number = 8734123;
        while(number != 0){
            int digit = number % 10;
            System.out.println(digit);
            number = number / 10;
        }
    }
}
