package loops.designprint;

import java.util.Scanner;

public class Design4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        for(int i = number - 1, stars = 1; i >= 0; i--, stars += 2) {
            for(int j=0; j < i; j++) {
                System.out.print(" ");
            }
            for(int k=0; k < stars; k++) {
                System.out.print(".");
            }
            System.out.println();
        }
    }
}
