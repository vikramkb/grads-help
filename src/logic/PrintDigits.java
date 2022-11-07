package logic;

public class PrintDigits {
    public static void main(String[] args) {
        int number = 8734;
        int digit = 0;
        System.out.println("number = " + number);
        digit = number % 10;
        System.out.println("digit = " + digit);
        number = number / 10;

        System.out.println("number = " + number);
        digit = number % 10;
        System.out.println("digit = " + digit);
        number = number / 10;

        System.out.println("number = " + number);
        digit = number % 10;
        System.out.println("digit = " + digit);
        number = number / 10;

        System.out.println("number = " + number);
        digit = number % 10;
        System.out.println("digit = " + digit);
        number = number / 10;

        System.out.println("number = " + number);

    }
}
