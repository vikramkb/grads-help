package loops.forloop;

import java.util.Scanner;

public class PrimeNumber2 {
    public static void main(String[] args) {
        System.out.println("Enter positive number");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        int halfNumber = number/2;
        boolean isPrime = true;
        for(int i=2; i <= halfNumber; i++) {
            if(number % i == 0) {
                isPrime = false;
                break;
            }
        }
        if(isPrime) {
            System.out.println(number + " is prime");
        }else {
            System.out.println(number + " is not prime");
        }
    }
}
