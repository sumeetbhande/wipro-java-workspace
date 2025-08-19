package collections;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {
    public static void main(String[] args) {
        // Step 1: Create a HashSet of Strings
        Set<String> languages = new HashSet<>();

        // Step 2: Add elements including duplicates
        languages.add("Java");
        languages.add("Python");
        languages.add("C++");
        languages.add("Java");    // Duplicate
        languages.add("Python"); // Duplicate

        // Step 3: Print the HashSet
        System.out.println("Languages in HashSet: " + languages);
    }
}

