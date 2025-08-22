package model;

import java.util.List;
import payment.Payment;
import Discountable;  // make sure Discountable is in your package or import fully qualified name

public class Order {

    public Customer customer;
    public List<Product> products;
    private double totalAmount;
    private boolean isCancelled = false;

    public Order(Customer customer, List<Product> products) {
        this.customer = customer;
        this.products = products;
        this.totalAmount = calculateTotal();
    }

    private double calculateTotal() {
        return products.stream().mapToDouble(Product::getPrice).sum();
    }

    public void placeOrder(Payment payment, Discountable discountable) {
        if (isCancelled) {
            System.out.println("Order is cancelled. Cannot place order.");
            return;
        }

        // First check stock for each product
        for (Product p : products) {
            if (p.getStockQuantity() <= 0) {
                System.out.println("Product " + p.name + " is out of stock! Cannot place order.");
                return;
            }
        }

        customer.displayCustomer();
        products.forEach(Product::displayDetails);

        double discounted = discountable.applyDiscount(totalAmount);
        System.out.println("Total after discount: ₹" + discounted);

        payment.amount = discounted;
        payment.processPayment();

        // Deduct stock quantity by 1 for simplicity
        products.forEach(p -> p.reduceStock(1));

        System.out.println("Order placed successfully.");
    }

    public void cancelOrder() {
        if (isCancelled) {
            System.out.println("Order is already cancelled.");
            return;
        }
        this.isCancelled = true;
        // Restock products when order is cancelled
        products.forEach(p -> p.updateStock(1));
        System.out.println("Order cancelled and products restocked.");
    }

    public boolean isCancelled() {
        return isCancelled;
    }

    public double getTotalAmount() {
        return totalAmount;
    }
}
