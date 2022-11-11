package loops;

import java.util.Scanner;

public class Power1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Base");
        int base = scanner.nextInt();

        System.out.println("Enter power");
        int power = scanner.nextInt();

        float result = 1;
        if(power >= 0) {
            int i = 0;
            while (i < power) {
                result = result * base;
                i = i + 1;
            }
        } else {
            power = -power;
            int i = 0;
            while (i < power) {
                result = result * base;
                i = i + 1;
            }

            result = 1 / result;
        }
        System.out.println("Result = " + result);

    }
}
