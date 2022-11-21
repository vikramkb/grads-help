package classes.inheritance;

public class Employee {
    private String name;
    private String employeeId;
    private float basicSalary;
    private float hra;

    public Employee(String name, String employeeId, float basicSalary, float hra) {
        this.name = name;
        this.employeeId = employeeId;
        this.basicSalary = basicSalary;
        this.hra = hra;
    }

    public float getTotalSalary() {
        return basicSalary + hra;
    }

    public void printDetails() {
        System.out.println(name);
        System.out.println(employeeId);
        System.out.println(basicSalary);
        System.out.println(hra);
    }
}
