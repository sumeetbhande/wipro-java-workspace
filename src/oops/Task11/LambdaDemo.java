package oops.Task11;

public class LambdaDemo {
    public static void main(String[] args) {
        // Lambda for Addition
        MathOperation add = (a, b) -> a + b;

        // Lambda for Subtraction
        MathOperation subtract = (a, b) -> a - b;

        // Lambda for Multiplication
        MathOperation multiply = (a, b) -> a * b;

        // Call and display results
        System.out.println("Addition       : " + add.operate(10, 5));
        System.out.println("Subtraction    : " + subtract.operate(10, 5));
        System.out.println("Multiplication : " + multiply.operate(10, 5));
    }
}
