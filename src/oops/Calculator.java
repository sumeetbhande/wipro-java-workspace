package oops;

//Calculator.java
public class Calculator {

 // Add two integers
 public int add(int a, int b) {
     return a + b;
 }

 // Add two doubles
 public double add(double a, double b) {
     return a + b;
 }

 // Concatenate two strings
 public String add(String a, String b) {
     return a + b;
 }

 // Main method to test overloading
 public static void main(String[] args) {
     Calculator calc = new Calculator();

     // Test int addition
     int sumInt = calc.add(10, 20);
     System.out.println("Sum of integers: " + sumInt);

     // Test double addition
     double sumDouble = calc.add(5.5, 6.7);
     System.out.println("Sum of doubles : " + sumDouble);

     // Test string concatenation
     String sumString = calc.add("Hello, ", "World!");
     System.out.println("Concatenated string: " + sumString);
 }
}
