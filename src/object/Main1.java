package object;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Account account1 = new Account("Lucky", "001", 10000);
        Account account2 = new Account("Gopi", "002", 5000);

        account1.deposit(5000);
        account2.withdraw(3000);

        account1.printAccountDetails();
        account2.printAccountDetails();

    }
}
