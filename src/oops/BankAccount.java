package oops;

//BankAccount.java
public class BankAccount {
 // Fields
 private String accountNumber; // Publicly accessible
 private double balance;       // Private field (encapsulated)

 // Constructor
 public BankAccount(String accountNumber, double initialBalance) {
     this.accountNumber = accountNumber;
     if (initialBalance >= 0)
         this.balance = initialBalance;
     else
         this.balance = 0;
 }

 // Method to deposit money
 public void deposit(double amount) {
     if (amount > 0) {
         balance += amount;
         System.out.println("₹" + amount + " deposited successfully.");
     } else {
         System.out.println("Invalid deposit amount.");
     }
 }

 // Method to withdraw money
 public void withdraw(double amount) {
     if (amount > 0 && amount <= balance) {
         balance -= amount;
         System.out.println("₹" + amount + " withdrawn successfully.");
     } else {
         System.out.println("Insufficient balance or invalid amount.");
     }
 }

 // Method to get current balance
 public double getBalance() {
     return balance;
 }

 // Method to display account details
 public void displayAccountDetails() {
     System.out.println("Account Number: " + accountNumber);
     System.out.println("Balance       : ₹" + getBalance());
     System.out.println("-----------------------------");
 }

 // main method
 public static void main(String[] args) {
     // Create BankAccount object
     BankAccount acc1 = new BankAccount("7411112098", 5000.0);

     // Perform operations
     acc1.displayAccountDetails();
     acc1.deposit(1500.0);
     acc1.withdraw(2000.0);
     acc1.displayAccountDetails();
 }
}
