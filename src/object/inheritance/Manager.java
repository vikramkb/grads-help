package classes.inheritance;

public class Manager extends Employee{

    private int teamSize = 0;
    public Manager(String name, String employeeId, float basicSalary, float hra, int teamSize) {
        super(name, employeeId, basicSalary, hra);
        this.teamSize = teamSize;
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

    public void printDetails() {
        super.printDetails();
        System.out.println("Team Size : " + teamSize);
    }
}
