package javaFundamentals;

public class Exercise9point3 {
    public static void main(String[] args) {
        int count = 0;     // Number of primes found
        int number = 2;    // Start checking from 2

        System.out.println("First 10 Prime Numbers:");

        for (; count < 10; number++) {
            if (isPrime(number)) {
                System.out.print(number + " ");
                count++;
            }
        }
    }

    // Helper method to check if a number is prime
    public static boolean isPrime(int n) {
        if (n <= 1) return false;

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }

        return true;
    }
}
