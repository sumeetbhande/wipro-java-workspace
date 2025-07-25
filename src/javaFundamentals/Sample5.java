package javaFundamentals;

//a java program to add two numbers passed via command-line

public class Sample5 {
    public static void main(String[] args) {
        // Check if exactly two arguments are passed
        if (args.length != 2) {
            System.out.println("Please provide exactly two numbers.");
            return;
        }

        // Convert command-line arguments from String to int
        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);

        // Add the numbers
        int sum = num1 + num2;

        // Display the result
        System.out.println("Sum: " + sum);
        
        //Steps of execution
        //Compile: javac Sample5.java
        //Run with two numbers : java AddNumbers 10 20
    }
}

