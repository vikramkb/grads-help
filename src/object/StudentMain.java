package object;

public class StudentMain {
    public static void main(String[] args) {
        Student lucky = new Student("Lucky", "R001");
        System.out.println(lucky.getName());
        System.out.println(lucky.getRollNumber());
        lucky.presented(100);
        lucky.presented();
        lucky.presented();
        lucky.presented();
        lucky.presented();
        lucky.presented(6);
        System.out.println("Attendence Percentage = " + lucky.attendencePercentage());

        lucky.setMarks(new int[]{80, 60, 70, 50, 30, 50});
        System.out.println(lucky.getTotalMarks());
        System.out.println(lucky.getMarksPercentage());

    }
}
