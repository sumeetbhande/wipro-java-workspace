package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Student implements Comparable<Student> {
    private String name;
    private int marks;

    public Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public int getMarks() {
        return marks;
    }

    // Override compareTo to sort by marks in ascending order
    @Override
    public int compareTo(Student other) {
        return Integer.compare(this.marks, other.marks);
    }

    @Override
    public String toString() {
        return name + ": " + marks;
    }
}

public class StudentSortingExample {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        // Add some Student objects
        students.add(new Student("Alice", 85));
        students.add(new Student("Bob", 90));
        students.add(new Student("Charlie", 78));
        students.add(new Student("Diana", 92));
        students.add(new Student("Ethan", 88));

        // Sort students by marks in ascending order
        Collections.sort(students);

        // Print sorted students
        System.out.println("Students sorted by marks (ascending):");
        for (Student s : students) {
            System.out.println(s);
        }
    }
}
