package collections;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        // Step 1: Create a TreeSet of integers
        Set<Integer> numbers = new TreeSet<>();

        // Step 2: Add integers (unsorted, with some duplicates)
        numbers.add(50);
        numbers.add(20);
        numbers.add(40);
        numbers.add(10);
        numbers.add(30);
        numbers.add(20);  // duplicate

        // Step 3: Print the TreeSet
        System.out.println("Sorted numbers: " + numbers);
    }
}
