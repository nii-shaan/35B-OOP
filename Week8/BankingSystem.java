package Week8;

public class BankingSystem {
    public static void main(String[] args) {

        BankAccount userOne = new BankAccount("Nishan");
        System.out.println("User: "+ userOne.getName());
        System.out.println("Account Number: "+ userOne.getAccountNumber());
        // userOne.deposit(20000);
        userOne.withdraw(2000);
        userOne.viewBalance();

    }
}

/*
 * You are building a banking applicatoiin that has a BankAccount Class
 * Implement the BankAccount Class with encapsulation principles in mind
 * Include private instance varicables for the
 * account number, account holder name, and account balance
 * Provide public methods to allow clients to deposit and withdraw funds,
 * as well as access the account balance
 * Ensure that the account balance cannot be accessed or modified directly
 * Ensure that user cannot withdraw balance if it can go to negative
 * Note make constuctor to fill the attribute on account opening
 * Make getter for account number and account holder name
 */

class BankAccount {

    private double accountNumber = (Math.ceil(Math.random() * 1000000));
    private String name;
    private double balance = 0;

    BankAccount(String name) {
        this.name = name;
    }

    void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
            System.out.println(amount + "Amount deposited");
        } else {
            System.out.println("Cannot deposite negetive");
        }
    }

    void withdraw(double amount) {
        if (this.balance > amount) {
            this.balance -= amount;
            System.out.println(amount + "Amount withdrawl");
        } else {
            System.out.println("Insuficient Balance to withdraw");
        }
    }

    void viewBalance() {
        System.out.println("Balance: " + this.balance);
    }

    public double getAccountNumber() {
        return accountNumber;
    }

    public String getName() {
        return name;
    }

}