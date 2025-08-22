package payment;

public class CardPayment extends Payment {
    private String cardNumber;

    public CardPayment(double amount, String cardNumber) {
        super(amount);
        this.cardNumber = cardNumber;
    }

    @Override
    public void processPayment() {
        System.out.println("Paid ₹" + amount + " using Card ending with: " + 
                            cardNumber.substring(cardNumber.length() - 4));
    }
}
