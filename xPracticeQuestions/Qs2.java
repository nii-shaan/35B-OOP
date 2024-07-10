package xPracticeQuestions;
/*
 * Create a BankAccount class to simulate a bank account. 
 * The class should have the following attributes: account number, account holder name, and balance.
 * include methods to deposit(), withdraw(), and checkBalane()
 * Implement functionality to:
 * -Create new accounts
 * -Deposits money into the accounts
 * -Withdraw money
 * -Check the account balance
 */

public class Qs2 {
    public static void main(String[] args) {
        BankAccount b1 = new BankAccount(1, "Nishan", 10000);
        b1.checkBalance();

    }
}

class BankAccount {
    int accountNumber;
    String accountHolderName;
    double balance;

    BankAccount(int accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
        System.out.println("Account created sucessfully!");
    }

    void deposit(double amountToAdd) {
        if (amountToAdd < 0) {
            System.out.println("cannot deposit negative amount");
        } else {
            this.balance += amountToAdd;
            System.out.println("Amount deposited! New Balance: " + this.balance);
        }
    }

    void wihtdraw(double amountToWithdraw) {
        if (balance - amountToWithdraw < 0) {
            System.out.println("Insuficient balance");
        } else {
            this.balance -= amountToWithdraw;
            System.out.println("Amount withdrawn! New balance: " + this.balance);
        }
    }

    void checkBalance() {
        System.out.println("Your current balance is: " + this.balance);
    }
}