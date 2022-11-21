package classes.inheritance;

public class ManagerMain1 {
    public static void main(String[] args) {
        Employee gopi = new Manager("Gopi", "E3", 5000, 2000, 4);
        System.out.println(gopi.getTotalSalary());
        gopi.printDetails();
    }
}
