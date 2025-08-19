package wrapperClasses;

import java.util.Arrays;

public class WrapperSorting {
    public static void main(String[] args) {
        // Step 1: Create an array of Integer objects (wrapper class)
        Integer[] numbers = {45, 32, 67, 89, 12, 67};

        // Step 2: Sort the array using Arrays.sort()
        Arrays.sort(numbers);  // Ascending order

        System.out.println("Sorted array: " + Arrays.toString(numbers));

        // Step 3: Find the 2nd highest value
        // Start from end and skip duplicates
        int n = numbers.length;
        int highest = numbers[n - 1];
        Integer secondHighest = null;

        for (int i = n - 2; i >= 0; i--) {
            if (!numbers[i].equals(highest)) {
                secondHighest = numbers[i];
                break;
            }
        }

        // Step 4: Print result
        if (secondHighest != null) {
            System.out.println("Second highest value: " + secondHighest);
        } else {
            System.out.println("No distinct second highest value found.");
        }
    }
}
