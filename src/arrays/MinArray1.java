package arrays;

import java.util.Scanner;

public class MinArray1 {
    public static void main(String[] args) {

        int[] numbers = {20, 5, 30, 2, 21, 100};

        int minimumValue = Integer.MAX_VALUE;

        for(int i=0; i < numbers.length; i++) {
            if(minimumValue > numbers[i]) {
                minimumValue = numbers[i];
            }
        }
        System.out.println("Minimum Number = " + minimumValue);
    }
}
