package logic.loop;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        System.out.println("Enter any number");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        int reverse = 0;
        for(;number != 0; number /= 10) {
            int digit = number % 10;
            reverse = reverse * 10 + digit;
        }
        System.out.println("Reverse = " + reverse);
    }
}
