package javaFundamentals;
import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input two numbers
        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        int result;

        // Arithmetic operations
        result = a + b;
        System.out.println("Addition: " + result);

        result = a - b;
        System.out.println("Subtraction: " + result);

        result = a * b;
        System.out.println("Multiplication: " + result);

        if (b != 0) {
            result = a / b;
            System.out.println("Division: " + result);

            result = a % b;
            System.out.println("Modulus: " + result);
        } else {
            System.out.println("Cannot divide by zero!");
        }

        // Assignment operations
        int x = a; // Start with value of a
        x += b;
        System.out.println("After x += b: " + x);

        x -= b;
        System.out.println("After x -= b: " + x);

        x *= b;
        System.out.println("After x *= b: " + x);

        if (b != 0) {
            x /= b;
            System.out.println("After x /= b: " + x);

            x %= b;
            System.out.println("After x %= b: " + x);
        }

        sc.close();
    }
}
