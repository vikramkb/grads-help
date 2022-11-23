public class StudentStatic {
    private String name;
    private String rollNumber;
    private int numberOfStudents1;
    private static int numberOfStudents;
    public StudentStatic(String name, String rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
        numberOfStudents++;
        numberOfStudents1++;
    }

    public void printStudents(){
        System.out.println(numberOfStudents);
        System.out.println(numberOfStudents1);
        System.out.println("-------------");
    }

    public static void main(String[] args) {
        StudentStatic s1 = new StudentStatic("Gopi1", "R1");
        s1.printStudents();
        StudentStatic s2 = new StudentStatic("Gopi2", "R2");
        s2.printStudents();
        StudentStatic s3 = new StudentStatic("Gopi3", "R3");
        s3.printStudents();
        StudentStatic s4 = new StudentStatic("Gopi4", "R4");
        s4.printStudents();
    }
}
