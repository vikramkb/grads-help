package object;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name");
        String name = scanner.next();
        System.out.println("Enter account number");
        String accountNumber = scanner.next();
        System.out.println("Enter balance");
        float balance = scanner.nextFloat();

        Account account1 = new Account(name, accountNumber, balance);

        System.out.println("Enter name");
        String name1 = scanner.next();
        System.out.println("Enter account number");
        String accountNumber1 = scanner.next();
        System.out.println("Enter balance");
        float balance1 = scanner.nextFloat();

        Account account2 = new Account(name1, accountNumber1, balance1);

        account1.deposit(5000);
        account2.withdraw(3000);

        account1.printAccountDetails();
        account2.printAccountDetails();


    }
}
