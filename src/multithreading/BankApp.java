package multithreading;

class BankAccount {
    private int balance = 1000;

    // Synchronized withdrawal method to ensure thread safety
    synchronized void withdraw(int amount, String user) {
        if (balance >= amount) {
            System.out.println(user + " is withdrawing $" + amount);
            balance -= amount;
            System.out.println("Remaining Balance: $" + balance);
        } else {
            System.out.println(user + " tried to withdraw but insufficient funds.");
        }
    }
}

public class BankApp {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        Runnable user1 = () -> account.withdraw(700, "User1");
        Runnable user2 = () -> account.withdraw(500, "User2");

        new Thread(user1).start();
        new Thread(user2).start();
    }
}
