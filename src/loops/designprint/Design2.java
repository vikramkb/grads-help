package loops.designprint;

import java.util.Scanner;

public class Design2 {
    public static void main(String[] args) {
        System.out.println("Enter number");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        for(int i = number; i >= 1; i--) {
            for(int j=0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
