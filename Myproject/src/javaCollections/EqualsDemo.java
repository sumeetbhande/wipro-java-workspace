package javaCollections;

import java.util.Objects;

class Employee {
    String emp_name;
    int emp_id;

    public Employee(String emp_name, int emp_id) {
        super();
        this.emp_name = emp_name;
        this.emp_id = emp_id;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null || obj.getClass() != this.getClass())
            return false;

        Employee employee = (Employee) obj;
        return (employee.emp_name == this.emp_name && employee.emp_id == this.emp_id);
    }

    @Override
    public int hashCode() {
        return this.emp_id;
    }
}

public class EqualsDemo {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Alex", 101);
        Employee emp2 = new Employee("Shruu", 102); 

        if (emp1.hashCode() == emp2.hashCode()) {
            if (emp1.equals(emp2)) {
                System.out.println("Both objects are equal");
            } else {
                System.out.println("Both are not equal");
            }
        } else {
            System.out.println("Both objects are not equal");
        }
    }
}