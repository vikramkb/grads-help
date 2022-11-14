package logic.loop;

import java.util.Scanner;

public class PrintDigitsForLoop {
    public static void main(String[] args) {
        System.out.println("Enter any number");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        for (; number != 0; number /= 10) {
            int digit = number % 10;
            System.out.println(digit);
        }
    }
}
