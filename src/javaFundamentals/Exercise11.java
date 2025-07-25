package javaFundamentals;

import java.util.Scanner;

public class Exercise11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input string
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Length of the string
        System.out.println("Length: " + input.length());

        // Uppercase and lowercase
        System.out.println("Uppercase: " + input.toUpperCase());
        System.out.println("Lowercase: " + input.toLowerCase());

        // Substring
        if (input.length() >= 5) {
            System.out.println("Substring (0 to 4): " + input.substring(0, 5)); // first 5 characters
        } else {
            System.out.println("Substring not possible (string too short).");
        }

        // Index of a character
        System.out.print("Enter a character to find its index: ");
        char ch = sc.next().charAt(0);
        int index = input.indexOf(ch);

        if (index != -1) {
            System.out.println("Index of '" + ch + "': " + index);
        } else {
            System.out.println("Character '" + ch + "' not found in the string.");
        }

        sc.close();
    }
}
