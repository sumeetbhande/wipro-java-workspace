package collections;

import java.util.ArrayList;
import java.util.ListIterator;

public class BiDirectionalTraversal {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        names.add("David");

        // Create a ListIterator
        ListIterator<String> listItr = names.listIterator();

        System.out.println("Forward Traversal:");
        // Traverse forward
        while (listItr.hasNext()) {
            System.out.println(listItr.next());
        }

        System.out.println("Backward Traversal:");
        // Traverse backward
        while (listItr.hasPrevious()) {
            System.out.println(listItr.previous());
        }
    }
}
