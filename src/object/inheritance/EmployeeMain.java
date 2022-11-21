package classes.inheritance;

public class EmployeeMain {
    public static void main(String[] args) {
        Employee manohar = new Employee("Manohar", "E1", 10000, 5000);
        Employee anusha = new Employee("Anusha", "E2", 20000, 6000);
        manohar.printDetails();
        anusha.printDetails();

        System.out.println("Manohar Salary = " + manohar.getTotalSalary());
        System.out.println("Anusha Salary = " + anusha.getTotalSalary());
    }
}
