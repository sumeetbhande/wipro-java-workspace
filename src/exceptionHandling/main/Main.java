package exceptionHandling.main;

// Import class and static members
import exceptionHandling.com.school.student.Student;
import static exceptionHandling.com.school.student.Student.staticGreeting;
import static exceptionHandling.com.school.student.Student.SCHOOL_NAME;

public class Main {
    public static void main(String[] args) {
        Student s = new Student("Sumeet", 101);
        s.displayInfo();

        // Using static method and variable via static import
        staticGreeting();
        System.out.println("School: " + SCHOOL_NAME);
    }
}
