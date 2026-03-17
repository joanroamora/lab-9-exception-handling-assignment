package Problem2Exception;

public class TestAccount {
    public static void main(String[] args) {
        CustomerAccount account = new CustomerAccount("Joan Ricardo", "12345", 500.0);

        // 1. Depósito negativo -> IllegalArgumentException
        try {
            account.deposit(-50);
        } catch (IllegalArgumentException e) {
            System.out.println("Test 1: " + e.getMessage());
        }

        // 2. Retiro mayor al saldo -> AccountException (Insufficient funds)
        try {
            account.withdraw(600);
        } catch (AccountException e) {
            System.out.println("Test 2: " + e.getMessage());
        }

        // 3. Retiro que deja menos de $100 -> AccountException (Low balance)
        try {
            account.withdraw(450);
        } catch (AccountException e) {
            System.out.println("Test 3: " + e.getMessage());
        }

        // 4. Depósito y Retiro exitosos
        try {
            account.deposit(100);
            account.withdraw(50);
            System.out.println("Test 4:Current balance: $" + account.getBalance());
        } catch (Exception e) {
            System.out.println("Test 4 failed: " + e.getMessage());
        }
    }
}