package classes.inheritance;

public class ManagerWithoutInheritance {
    private String name;
    private String employeeId;
    private float basicSalary;
    private float hra;

    public ManagerWithoutInheritance(String name, String employeeId, float basicSalary, float hra) {
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

    public void addTeamMembers() {
        System.out.println("Adding team member");
    }

    public void removeTeamMembers() {
        System.out.println("Remove team member");
    }

    public void approveLeave() {
        System.out.println("Leave approved ");
    }

    public void rejectLeave() {
        System.out.println("Reject Leave");
    }
}
