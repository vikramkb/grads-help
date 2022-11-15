package arrays;

public class MaxMarks {
    public static void main(String[] args) {

        String[] subjects = {"Maths", "Science", "Social", "Telugu", "English", "Hindi"};
        int[] marks = {50, 40, 70, 78, 65, 45};

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
