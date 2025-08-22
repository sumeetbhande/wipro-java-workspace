import model.*;
import payment.*;
import java.io.*;
import java.util.Arrays;
import java.util.List;

public class ECommerceApp {

    // Save order details to a file (simple serialization as text)
    public static void saveOrder(Order order, String filename) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(filename))) {
            writer.println("Order Details:");
            writer.println("Customer Name: " + order.customer.name);
            writer.println("Products:");
            for (Product p : order.products) {
                writer.println(p.name + " | Price: " + p.getPrice());
            }
            writer.println("Total Amount: " + order.getTotalAmount());
            writer.println("Order Cancelled? " + order.isCancelled());
            System.out.println("Order saved to " + filename);
        } catch (IOException e) {
            System.out.println("Error saving order: " + e.getMessage());
        }
    }

    // Simple method to demonstrate retrieving order info (for demo)
    public static void readOrder(String filename) {
        System.out.println("\n--- Reading order from file ---");
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while((line = reader.readLine()) != null){ 
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error reading order: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Product phone = new Electronics("P1001", "iPhone 15", 79999, 10, "Apple", 12);
        Product tshirt = new Clothing("C1002", "Polo T-shirt", 1499, 20, "L", "Cotton");
        Product book = new Books("B1003", "Java Programming", 799, 15, "John Doe", "Tech Press");
        Product sofa = new Furniture("F1004", "Luxury Sofa", 45000, 5, "Leather", "80x35x30");

        Customer customer = new Customer("Ravi Kumar", "ravi@example.com");

        List<Product> products = Arrays.asList(phone, tshirt, book, sofa);

        Order order = new Order(customer, products);

        // Lambda Expression for 10% Discount
        Discountable discount = price -> price * 0.9;

        // Payment Mode
        Payment payment = new UpiPayment(0, "ravi@upi");

        order.placeOrder(payment, discount);

        // Save order details to file
        String filename = "order1.txt";
        saveOrder(order, filename);

        // Read order back
        readOrder(filename);

        // Cancel order test
        order.cancelOrder();

        // Place order again with CashOnDelivery
        Payment codPayment = new CashOnDelivery(0);
        order.placeOrder(codPayment, discount);
    }
}
