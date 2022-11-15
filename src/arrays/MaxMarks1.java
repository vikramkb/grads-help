package arrays;

import java.util.Scanner;

public class MaxMarks1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of subjects");
        int size = scanner.nextInt();
        String[] subjects = new String[size];
        int[] marks = new int[size];

        System.out.println("Enter subject and marks in that subject");
        for(int i=0; i<size; i++) {
            subjects[i] = scanner.next();
            marks[i] = scanner.nextInt();
        }

        int maxMarks = 0;
        int maxMarksIndex = 0;

        for(int i=0; i < marks.length; i++) {
            if(maxMarks < marks[i]) {
                maxMarks = marks[i];
                maxMarksIndex = i;
            }
        }
        System.out.println("Maximum Marks = " + maxMarks);
        System.out.println("In subject = " + subjects[maxMarksIndex]);
    }
}
