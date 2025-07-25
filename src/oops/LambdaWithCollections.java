package oops;

import java.util.*;
import java.util.stream.Collectors;

public class LambdaWithCollections {
    public static void main(String[] args) {
        // Step 1: Create a list of names
        List<String> names = Arrays.asList("Sumeet", "Ankit", "Ravi", "Sumaa", "Verruuu", "Bhandii");

        // Step 2: Print all names using lambda
        System.out.println("All Names:");
        names.forEach(name -> System.out.println(name));

        // Step 3: Filter names starting with "A"
        System.out.println("\nNames starting with 'B':");
        names.stream()
             .filter(name -> name.startsWith("A"))
             .forEach(name -> System.out.println(name));

        // Step 4: Sort names alphabetically using lambda
        System.out.println("\nNames sorted alphabetically:");
        List<String> sortedNames = names.stream()
                                        .sorted((s1, s2) -> s1.compareToIgnoreCase(s2))
                                        .collect(Collectors.toList());
        sortedNames.forEach(System.out::println);
    }
}
