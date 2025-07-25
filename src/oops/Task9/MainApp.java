package oops.Task9;

import oops.Task9.model.Student;
import oops.Task9.service.StudentService;

public class MainApp {
    public static void main(String[] args) {
        // Create Student object
        Student s1 = new Student(101, "Sumeet");

        // Create service and handle student
        StudentService service = new StudentService();
        service.saveStudent(s1);
        service.printStudent();
    }
}

