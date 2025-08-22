package payment;

public class CashOnDelivery extends Payment {

    public CashOnDelivery(double amount) {
        super(amount);
    }

    @Override
    public void processPayment() {
        System.out.println("Payment of ₹" + amount + " will be collected on delivery (Cash on Delivery).");
    }
}
