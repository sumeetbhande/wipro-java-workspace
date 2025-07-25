package javaFundamentals;

//a Java program that uses at least 15 different keywords

import java.util.Scanner; // keyword: import

public class Sample4point2{ // keyword: public, class
    public static void main(String[] args) { // keyword: static, void, String
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int limit = scanner.nextInt(); // keyword: int

        if (limit < 2) { // keyword: if
            System.out.println("No prime numbers in this range.");
        } else {
            System.out.println("Prime numbers up to " + limit + ":");
            for (int i = 2; i <= limit; i++) { // keyword: for
                boolean isPrime = true; // keyword: boolean
                for (int j = 2; j <= i / 2; j++) {
                    if (i % j == 0) {
                        isPrime = false;
                        break; // keyword: break
                    }
                }
                if (isPrime) {
                    System.out.println(i);
                }
            }
        }

        scanner.close(); // keyword: close
    }
}
