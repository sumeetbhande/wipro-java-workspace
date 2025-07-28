package javaFundamentals;

public class Exercise5point2 {
    public static void main(String[] args) {
        // Check if an argument is provided
        if (args.length == 0) {
            System.out.println("Please provide a string to reverse.");
            return;
        }

        String input = args[0];  // Get the first argument
        String reversed = "";

        // Reverse the string using a loop
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i);
        }

        // Display the reversed string
        System.out.println("Original: " + input);
        System.out.println("Reversed: " + reversed);
    }
}
//Compile : javac ReverseString.java
//Run : java ReverseString Hello

