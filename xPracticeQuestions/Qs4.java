package xPracticeQuestions;
/*
 * Question Design and implement a java program that simulates a financial transaction system
 * Your system should be capable of processing different types of transaction,
 * such as deposits and withdrawls, and alerting if any transaction exceed certain limits.
 * Use interfaces to define common behaviours for transaction and implement these 
 * behaviours in different transaction classes.
 * 
 * Create an interface named Transaction with atleast two methods:
 * - getAmount() which returns the amount of the transaction as double
 * - isValid() which returns a boolean indicating if the transaction is valid based on certain citeria
 * 
 * Implement the Transaction interface in at least three seperate classes, DepositeTransaction and WithdrawalTransaction.
 * Each class should have a constructor that sets a limit for transaction and specific logic to determine if the transaction is valid
 */

public class Qs4 {
    public static void main(String[] args) {

        DepositTransaction dt1 = new DepositTransaction(10000, 2000, 2000);
        System.out.println(dt1.getAmount());

        WithdrawalTransaction w1 = new WithdrawalTransaction(10000, 2000, 2000);
        System.out.println(w1.getAmount());

    }
}

interface Transaction {
    public double getAmount();

    public boolean isValid();
}

class DepositTransaction implements Transaction {
    private double transactionLimit;
    private double balance = 0;
    private double amountToDeposit;

    DepositTransaction(double transactionLimit, double currentBalance, double amountToDeposit) {
        this.transactionLimit = transactionLimit;
        this.balance = currentBalance;
        this.amountToDeposit = amountToDeposit;
        deposit(amountToDeposit);
    }

    private void deposit(double amount) {
        if (isValid()) {
            this.balance += amount;
            System.out.println(amount + " Deposited");
        }
    }

    @Override
    public boolean isValid() {
        if (this.amountToDeposit > transactionLimit || this.amountToDeposit <= 0) {
            System.out.println("Invalid amount to deposite: " + this.amountToDeposit);
            return false;
        }
        return true;
    }

    @Override
    public double getAmount() {
        return this.balance;
    }

}

class WithdrawalTransaction implements Transaction {
    double transactionLimit;
    double balance = 0;
    double amountToWithDrawal;

    WithdrawalTransaction(double transactionLimit, double currentBalance, double amountToWithDrawal) {
        this.transactionLimit = transactionLimit;
        this.balance = currentBalance;
        this.amountToWithDrawal = amountToWithDrawal;
        withdraw(amountToWithDrawal);
    }

    public void withdraw(double amount) {
        if (isValid()) {
            this.balance -= amount;
            System.out.println(amount + " Withdrawed");
        }
    }

    @Override
    public boolean isValid() {
        if (this.amountToWithDrawal > transactionLimit || this.amountToWithDrawal <= 0
                || this.balance - this.amountToWithDrawal < 0) {
            System.out.println("Invalid amount to withdraw: " + this.amountToWithDrawal);
            return false;
        }
        return true;
    }

    @Override
    public double getAmount() {
        return this.balance;
    }
}