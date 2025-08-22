package javaoops.encapsulation;

// POJO class: Plain Old Java Object
public class Employee {

    private int emp_id;
    private String emp_name;
    private String emp_email;

    // Setter for emp_id
    public void setEmpId(int emp_id) {
        this.emp_id = emp_id;
    }

    // Getter for emp_id
    public int getEmpId() {
        return this.emp_id;
    }

    // Setter for emp_name
    public void setEmpName(String emp_name) {
        this.emp_name = emp_name;
    }

    // Getter for emp_name
    public String getEmpName() {
        return this.emp_name;
    }

    // Setter for emp_email
    public void setEmpEmail(String emp_email) {
        this.emp_email = emp_email;
    }

    // Getter for emp_email
    public String getEmpEmail() {
        return this.emp_email;
    }

    // Override toString() for meaningful object print
    @Override
    public String toString() {
        return emp_id + " " + emp_name + " " + emp_email;
    }
}
