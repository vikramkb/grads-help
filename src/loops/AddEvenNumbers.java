package loops;

import java.util.Scanner;

public class AddEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number");
        int number = scanner.nextInt();

        int i = 0;
        int total = 0;
        while( i <= number) {
            total = total + i;
            i = i + 2;
        }
        System.out.println("Total = " + total);
    }
}
