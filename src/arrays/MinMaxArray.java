package arrays;

import java.util.Scanner;

public class MinMaxArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size of the array");
        int size = scanner.nextInt();

        int[] numbers = new int[size];
        System.out.println("Enter " + size + " numbers");
        for (int i=0; i < size; i++){
            numbers[i] = scanner.nextInt();
        }

        int minimumValue = Integer.MAX_VALUE;
        int maximumValue = Integer.MIN_VALUE;

        for(int i=0; i < numbers.length; i++) {
            if(minimumValue > numbers[i]) {
                minimumValue = numbers[i];
            }
            if(maximumValue < numbers[i]) {
                maximumValue = numbers[i];
            }
        }
        System.out.println("Minimum Number = " + minimumValue);
        System.out.println("Maximum Number = " + maximumValue);
    }
}
