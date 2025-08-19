package wrapperClasses;

public class BankAccount {
    private String accountNumber;
    private Double balance;  // Wrapper class (can be null)

    // Constructor
    public BankAccount(String accountNumber, Double balance) {
        this.accountNumber = accountNumber;
        // Handle null balance
        if (balance == null) {
            this.balance = 0.0;
        } else {
            this.balance = balance;
        }
    }

    // Deposit method
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;  // auto-unboxing and re-boxing
            System.out.println("Deposited: ₹" + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Withdraw method
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: ₹" + amount);
        } else {
            System.out.println("Invalid or insufficient balance.");
        }
    }

    // Show balance method
    public void showBalance() {
        System.out.println("Account: " + accountNumber);
        System.out.println("Current Balance: ₹" + balance);
    }

    // Main method to test
    public static void main(String[] args) {
        // Create a bank account with null balance
        BankAccount account = new BankAccount("ACC123456", null);
        account.showBalance();  // Should show ₹0.0

        // Deposit and withdraw
        account.deposit(5000);
        account.withdraw(1500);
        account.showBalance();
    }
}
