package loops;

import java.util.Scanner;

public class SumNumbers {
    //sum first 1000 numbers - 1 + 2 + 3 + 4 + 5 + ..... + 1000
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number to sum from 1 to number");
        int number = scanner.nextInt();

        int sum1 = 0;
        int i = 0;
        while (i <= number) {
            sum1 = sum1 + i;
            i = i + 1;
        }

        System.out.println("Sum = " + sum1);
    }
}
