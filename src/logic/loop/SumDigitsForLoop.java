package logic.loop;

import java.util.Scanner;

public class SumDigitsForLoop {
    public static void main(String[] args) {
        System.out.println("Enter any number");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
// 342 = 2 + 4 + 3 = 9
        int sum = 0;
        for (; number != 0; number /= 10) {
            int digit = number % 10;
            sum = sum + digit;
        }
        if(sum < 0) {
            sum = -sum;
        }
        System.out.println("Sum = " + sum);
    }
}
