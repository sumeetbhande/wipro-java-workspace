package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class RemoveElementsWithA {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Andrew");
        names.add("Charlie");
        names.add("Angela");
        names.add("David");

        // Use an Iterator to safely remove elements while iterating
        Iterator<String> itr = names.iterator();
        while (itr.hasNext()) {
            String name = itr.next();
            if (name.startsWith("A")) {
                itr.remove();
            }
        }

        // Print remaining elements
        System.out.println("Names after removal: " + names);
    }
}
