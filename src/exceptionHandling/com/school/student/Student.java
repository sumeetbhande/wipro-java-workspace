package exceptionHandling.com.school.student;

public class Student {
    public String name;
    public int rollNumber;

    public Student(String name, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
    }

    public void displayInfo() {
        System.out.println("Name: " + name + ", Roll Number: " + rollNumber);
    }

    public static void staticGreeting() {
        System.out.println("Welcome, student!");
    }

    public static final String SCHOOL_NAME = "ABC High School";
}