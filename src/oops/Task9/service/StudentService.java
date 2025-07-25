package oops.Task9.service;

import oops.Task9.model.Student;

public class StudentService {
    private Student student;

    // Save student
    public void saveStudent(Student s) {
        this.student = s;
        System.out.println("Student saved successfully.");
    }

    // Print student info
    public void printStudent() {
        if (student != null) {
            System.out.println("Student Details:");
            System.out.println("ID   : " + student.getId());
            System.out.println("Name : " + student.getName());
        } else {
            System.out.println("No student data available.");
        }
    }
}
