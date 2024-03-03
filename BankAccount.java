import java.util.Scanner;
class BankAccount {
    private double balance;

    public BankAccount(double initialBal) {
        this.balance = initialBal;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public boolean withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient Balance,Withdrawal failed.");
            return false;
        }
        else {
            balance -= amount;
            return true;
        }
    }
}
