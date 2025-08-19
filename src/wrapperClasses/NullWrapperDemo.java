package wrapperClasses;

import java.util.Optional;

public class NullWrapperDemo {
    public static void main(String[] args) {
        // Step 1: Declare a Double object and set it to null
        Double balance = null;

        // Step 2: Try unboxing to double and catch exception
        try {
            double amount = balance;  // ⚠️ Unboxing null → NullPointerException
            System.out.println("Balance: ₹" + amount);
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException while unboxing null Double!");
        }

        // Step 3a: Fix using default value strategy
        double safeAmount = (balance != null) ? balance : 0.0;
        System.out.println("Balance with default (if null): ₹" + safeAmount);

        // Step 3b: Fix using Optional
        Optional<Double> optionalBalance = Optional.ofNullable(balance);
        double optionalSafe = optionalBalance.orElse(0.0);
        System.out.println("Balance using Optional: ₹" + optionalSafe);
    }
}
