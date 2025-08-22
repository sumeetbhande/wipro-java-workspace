import model.*;
import payment.*;
import util.Discountable;

import java.util.*;

public class ECommerceApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Enter customer info
        System.out.print("Enter Customer Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Customer Email: ");
        String email = sc.nextLine();
        Customer customer = new Customer(name, email);

        // Step 2: Product selection
        List<Product> cart = new ArrayList<>();
        productSelection:
        	while (true) {
        	    System.out.println("\n--- Product Menu ---");
        	    System.out.println("1. iPhone 15 - ₹79999");
        	    System.out.println("2. Polo T-shirt - ₹1499");
        	    System.out.println("3. Exit Product Selection");
        	    System.out.print("Choose an option: ");
        	    int choice = sc.nextInt();
        	    sc.nextLine(); // consume newline

        	    switch (choice) {
        	        case 1:
        	            cart.add(new Electronics("P1001", "iPhone 15", 79999, "Apple", 12));
        	            System.out.println("Added iPhone 15 to cart.");
        	            break;
        	        case 2:
        	            cart.add(new Clothing("C1002", "Polo T-shirt", 1499, "L", "Cotton"));
        	            System.out.println("Added Polo T-shirt to cart.");
        	            break;
        	        case 3:
        	            if (cart.isEmpty()) {
        	                System.out.println("You must select at least one product before exiting.");
        	            } else {
        	                System.out.println("Product selection completed.");
        	                break productSelection; // break the while loop
        	            }
        	            break;
        	        default:
        	            System.out.println("Invalid option. Try again.");
        	    }
        	}

}}
