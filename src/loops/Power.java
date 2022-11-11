package loops;

import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Base");
        int base = scanner.nextInt();

        System.out.println("Enter power");
        int power = scanner.nextInt();

        int result = 1;
        int i = 0;
        while (i < power) {
            result = result * base;
            i = i + 1;
        }
        System.out.println("Result = " + result);

    }
}
