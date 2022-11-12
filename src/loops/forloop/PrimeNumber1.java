package loops.forloop;

import java.util.Scanner;

public class PrimeNumber1 {
    // find prime number from 2 to 100
    public static void main(String[] args) {

        for (long number = 2; number <= 9908908098098988l; number++) {
            int count = 0;
            for(long i=1; i <= number; i++){
                if(number % i == 0) {
                    count++;
                }
            }
            if(count == 2) {
                System.out.print(number + " ");
            }else {
               // System.out.println(number + " is not a prime number");
            }
        }

    }
}
