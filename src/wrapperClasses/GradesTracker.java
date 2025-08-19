package wrapperClasses;

import java.util.ArrayList;
import java.util.Collections;

public class GradesTracker {
    public static void main(String[] args) {
        // Step 1: Create ArrayList<Integer>
        ArrayList<Integer> marks = new ArrayList<>();

        // Step 2: Add 5 student marks (autoboxing happens here)
        marks.add(85);  // int → Integer (autoboxing)
        marks.add(92);
        marks.add(76);
        marks.add(88);
        marks.add(69);

        System.out.println("Original marks: " + marks);

        // Step 3: Remove the lowest mark using Collections.min()
        int minMark = Collections.min(marks);
        marks.remove(Integer.valueOf(minMark));  // remove by value, not index

        System.out.println("After removing lowest mark: " + marks);

        // Step 4: Find max, min, and average
        int max = Collections.max(marks);
        int min = Collections.min(marks);
        double average = 0;

        int total = 0;
        for (int mark : marks) {
            total += mark;
        }
        average = (double) total / marks.size();

        // Step 5: Print results
        System.out.println("Highest mark: " + max);
        System.out.println("Lowest mark: " + min);
        System.out.println("Average mark: " + average);
    }
}
