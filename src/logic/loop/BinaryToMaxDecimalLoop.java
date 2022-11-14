package logic.loop;

import java.util.Scanner;

public class BinaryToMaxDecimalLoop {
    public static void main(String[] args) {
        System.out.println("Enter digits");
        Scanner scanner = new Scanner(System.in);
        int digits = scanner.nextInt();

        int maxNumber = 0;
        for(int product = 1, i = 0; i < digits; i++, product *= 2) {
            maxNumber += product;
        }
        System.out.println("Max Decimal Number with " + digits + " binary digits is " + maxNumber);
    }
}
