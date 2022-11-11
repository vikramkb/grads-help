package loops;

import java.util.Scanner;

public class SumSquares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number to sum from 1 to number");
        int number = scanner.nextInt();
        int i=1;
        int total = 0;
        while (i <= number){
            System.out.println(i);
            total = total + i * i;
            i = i + 1;
        }
        System.out.println("Total = " + total);
    }
}
