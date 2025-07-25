package oops;

//Employee.java
public class Employee {
 // Static variable to track the number of employees
 static int count = 0;

 // Instance variables
 String name;
 int id;

 // Constructor
 public Employee(String name, int id) {
     this.name = name;
     this.id = id;
     count++; // Increment count whenever a new Employee is created
 }

 // Display employee details
 public void displayEmployee() {
     System.out.println("Employee ID: " + id);
     System.out.println("Name       : " + name);
     System.out.println("------------------------");
 }

 // Main method
 public static void main(String[] args) {
     // Creating employee objects
     Employee e1 = new Employee("Sumeet", 1);
     Employee e2 = new Employee("Neha", 2);
     Employee e3 = new Employee("Deepa", 3);

     // Display employee details
     e1.displayEmployee();
     e2.displayEmployee();
     e3.displayEmployee();

     // Display total employee count
     System.out.println("Total number of employees: " + Employee.count);
 }
}
