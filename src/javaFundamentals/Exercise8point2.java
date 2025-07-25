package javaFundamentals;

public class Exercise8point2 {
    public static void main(String[] args) {

        // 1. Pre/Post Increment
        int a = 5;
        System.out.println("Original a: " + a);
        System.out.println("Post-increment (a++): " + a++); // prints 5, then a becomes 6
        System.out.println("After post-increment, a: " + a);
        System.out.println("Pre-increment (++a): " + ++a); // a becomes 7, then prints 7
        System.out.println("After pre-increment, a: " + a);

        System.out.println("\n------------------------");

        // 2. Bitwise Shift Operators
        int num = 8; // binary: 1000
        System.out.println("Original num: " + num);
        System.out.println("Left shift (num << 1): " + (num << 1));   // 8 * 2 = 16
        System.out.println("Right shift (num >> 1): " + (num >> 1)); // 8 / 2 = 4

        System.out.println("\n------------------------");

        // 3. Logical AND (&&) vs Bitwise AND (&)

        int x = 10, y = 5, z = 0;

        // Logical AND: if first is false, second is not evaluated (short-circuit)
        if (x < y && ++z < 100) {
            // not executed
        }
        System.out.println("After logical AND, z: " + z); // z remains 0

        // Bitwise AND: both sides are always evaluated
        if (x < y & ++z < 100) {
            // not executed, but z is incremented
        }
        System.out.println("After bitwise AND, z: " + z); // z becomes 1
    }
}

