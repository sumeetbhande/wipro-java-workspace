package javaFundamentals;

import java.util.Scanner;

public class Exercise9point4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;

        do {
            System.out.print("Enter a positive number (enter 1 to stop): ");
            number = sc.nextInt();

            if (number != 1) {
                if (number > 0) {
                    System.out.println("You entered: " + number);
                } else {
                    System.out.println("Please enter only positive numbers.");
                }
            }

        } while (number != 1);

        System.out.println("You entered 1. Program stopped.");
        sc.close();
    }
}
