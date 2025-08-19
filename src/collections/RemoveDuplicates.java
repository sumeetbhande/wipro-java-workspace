package collections;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicates {
    public static void main(String[] args) {
        // Step 1: Create a list with duplicates
        List<String> languages = new ArrayList<>();
        languages.add("Java");
        languages.add("C");
        languages.add("Java");
        languages.add("Python");

        System.out.println("Original List: " + languages);

        // Step 2: Use LinkedHashSet to remove duplicates and maintain order
        Set<String> uniqueLanguages = new LinkedHashSet<>(languages);

        // Step 3: Convert back to list (optional)
        List<String> resultList = new ArrayList<>(uniqueLanguages);

        // Step 4: Print result
        System.out.println("List after removing duplicates: " + resultList);
    }
}
