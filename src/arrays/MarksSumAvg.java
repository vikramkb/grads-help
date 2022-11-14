package arrays;

import java.util.Scanner;

public class MarksSumAvg {
    public static void main(String[] args) {
        System.out.println("Enter number of subjects");
        Scanner scanner = new Scanner(System.in);
        int subjects = scanner.nextInt();
        int[] marks = new int[subjects];
        System.out.println("Enter " + subjects + " subject marks");
        for(int i=0; i < marks.length; i++) {
            int subjectMarks = scanner.nextInt();
            marks[i] = subjectMarks;
        }

        int totalMarks = 0;
        for(int i=0; i < marks.length; i++) {
            totalMarks = totalMarks + marks[i];
        }
        System.out.println("Total Marks = " + totalMarks);
        System.out.println("Average Marks = " + totalMarks/marks.length);
    }
}
