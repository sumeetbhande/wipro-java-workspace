package collections;

import java.util.ArrayList;
import java.util.Collections;

public class SortIntegerList {
    public static void main(String[] args) {
        // Step 1: Create and populate a list of integers
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(50);
        numbers.add(10);
        numbers.add(40);
        numbers.add(30);
        numbers.add(20);

        // Step 2: Sort in ascending order
        Collections.sort(numbers);
        System.out.println("Ascending Order: " + numbers);

        // Step 3: Sort in descending order
        Collections.sort(numbers, Collections.reverseOrder());
        System.out.println("Descending Order: " + numbers);
    }
}
