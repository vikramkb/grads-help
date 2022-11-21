package classes.inheritance;

public class ManagerMain {
    public static void main(String[] args) {
        Manager gopi = new Manager("Gopi", "E3", 5000, 2000, 4);
        Manager lucky = new Manager("Lucky", "E4", 10000, 2000, 5);

        System.out.println("Gopi Salary = " + gopi.getTotalSalary());
        gopi.approveLeave();
        gopi.addTeamMembers();

        lucky.removeTeamMembers();
        lucky.rejectLeave();
        lucky.printDetails();
    }
}
