package payment;

public abstract class Payment {
    public double amount;

    public Payment(double amount) {
        this.amount = amount;
    }

    public abstract void processPayment();
}
