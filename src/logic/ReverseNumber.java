package logic;

public class ReverseNumber {
    public static void main(String[] args) {
        int number = 8734;
        int digit = 0;
        int reverse = 0;
        System.out.println("number = " + number);
        digit = number % 10;
        System.out.println("digit = " + digit);
        number = number / 10;
        reverse = reverse*10 + digit;
        System.out.println("Reverse Number = " + reverse);
        System.out.println("-----------------------");

        System.out.println("number = " + number);
        digit = number % 10;
        System.out.println("digit = " + digit);
        number = number / 10;
        reverse = reverse*10 + digit;
        System.out.println("Reverse Number = " + reverse);
        System.out.println("-----------------------");

        System.out.println("number = " + number);
        digit = number % 10;
        System.out.println("digit = " + digit);
        number = number / 10;
        reverse = reverse*10 + digit;
        System.out.println("Reverse Number = " + reverse);
        System.out.println("-----------------------");


        System.out.println("number = " + number);
        digit = number % 10;
        System.out.println("digit = " + digit);
        number = number / 10;
        reverse = reverse*10 + digit;

        System.out.println("number = " + number);
        System.out.println("Reverse Number = " + reverse);

    }
}
