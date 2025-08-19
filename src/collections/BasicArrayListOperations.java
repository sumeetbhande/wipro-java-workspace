package collections;

import java.util.ArrayList;

public class BasicArrayListOperations {
    public static void main(String[] args) {
        // Step 1: Create an ArrayList of Strings
        ArrayList<String> languages = new ArrayList<>();

        // Step 2: Add 5 elements
        languages.add("Java");
        languages.add("C");
        languages.add("C++");
        languages.add("Ruby");
        languages.add("Python");

        // Step 3: Remove the 2nd element (index 1 → "C")
        languages.remove(1);

        // Step 4: Print all elements
        System.out.println(languages);
    }
}
