package taskSIX;

import java.util.Scanner;

public class Account {
     double balance;
     String accountHolder;

    public Account() {
        try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Enter account holder name: ");
			accountHolder = sc.nextLine();
			System.out.print("Enter initial balance: ");
			balance = sc.nextDouble();
		}
    }

    public Account(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient funds or invalid amount.");
        }
    }

    public void checkBalance() {
        System.out.println("Current Balance: " + balance);
    }

    public static void main(String[] args) {
        Account acc1 = new Account();
        acc1.deposit(500);
        acc1.withdraw(200);
        acc1.checkBalance();

        Account acc2 = new Account("Leema", 1000);
        System.out.println("With parameter constructor");
        acc2.deposit(300);
        acc2.withdraw(500);
        acc2.checkBalance();
    }
}
