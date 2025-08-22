package javaoops.encapsulation;

public class Sample1 {

    public static void main(String[] args) {
        Employee empObj = new Employee();

        empObj.setEmpId(101);
        empObj.setEmpName("Alex");
        empObj.setEmpEmail("alex@gmail.com");

        System.out.println(empObj.getEmpId() + " " +
                           empObj.getEmpName() + " " +
                           empObj.getEmpEmail());

        System.out.println(empObj);  // Uses toString()
    }
}
