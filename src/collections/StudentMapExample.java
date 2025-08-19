package collections;

import java.util.HashMap;
import java.util.Map;

public class StudentMapExample {
    public static void main(String[] args) {
        // Create a HashMap with roll numbers as keys and names as values
        HashMap<Integer, String> studentMap = new HashMap<>();

        // Add 5 entries
        studentMap.put(101, "Alice");
        studentMap.put(102, "Bob");
        studentMap.put(103, "Charlie");
        studentMap.put(104, "Diana");
        studentMap.put(105, "Ethan");

        // Remove one entry (e.g., roll number 103)
        studentMap.remove(103);

        // Iterate using entrySet()
        System.out.println("Student Records:");
        for (Map.Entry<Integer, String> entry : studentMap.entrySet()) {
            System.out.println("Roll No: " + entry.getKey() + ", Name: " + entry.getValue());
        }
    }
}
