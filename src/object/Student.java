package object;

public class Student {
    private String name;
    private String rollNumber;
    private int abscentDays = 0;
    private int presentDays = 0;
    private int totalWorkingDays = 200;
    private int[] marks = new int[6];

    public Student(String n, String rN) {
        name = n;
        rollNumber = rN;
    }

    public String getName() {
        return name;
    }

    public String getRollNumber() {
        return rollNumber;
    }

    public void presented() {
        presentDays++;
    }
    public void presented(int days) {
        presentDays += days;
    }
    public float attendencePercentage() {
        return percentage(presentDays, totalWorkingDays);
    }

    public void setMarks(int[] marks) {
        this.marks = marks;
    }

    public int getTotalMarks() {
        int total = 0;
        for(int i=0; i < marks.length; i++) {
            total += marks[i];
        }
        return total;
    }

    public float getMarksPercentage() {
        int total = getTotalMarks();
        int highTotalMarks = marks.length * 100;
        return percentage(total, highTotalMarks);
    }

    private float percentage(float number1, float number2) {
        return (number1/number2)*100;
    }
}
