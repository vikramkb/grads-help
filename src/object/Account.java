package object;

public class Account {
    private String name;
    private String accountNumber;
    private float balance;

    public Account(String name, String accountNumber, float balance){
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void withdraw(float amount) {
        balance = balance - amount;
    }

    public void deposit(float amount) {
        balance = balance + amount;
    }

    public void printAccountDetails() {
        System.out.println("Name : " + name);
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Balance : " + balance);
    }
}
