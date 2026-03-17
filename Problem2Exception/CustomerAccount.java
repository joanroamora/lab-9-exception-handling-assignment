package Problem2Exception;

public class CustomerAccount {
    private String cusName;
    private String accNo;
    private double balance;

    public CustomerAccount(String cusName, String accNo, double balance) {
        this.cusName = cusName;
        this.accNo = accNo;
        this.balance = balance;
    }

    public boolean deposit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Amount needed as a positive int.");
        }
        balance += amount;
        return true;
    }

    public boolean withdraw(double amount) {
        if (amount > balance) {
            throw new AccountException("No funds... Put money on your account and retry");
        }
        if (balance - amount < 100) {
            throw new AccountException("Low balance, take care about ir.");
        }

        balance -= amount;
        return true;
    }

    public double getBalance() {
        return balance;
    }
}