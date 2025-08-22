package javaoops;
//24/07/2025 Practice on Object, Class, ""Parameterized Constructor".

class Employee{
	int id;
	String name;
	
	//Default Constructor
	Employee(){
		System.out.println("This Default Constructor gets executed");
	}
	
	Employee(int id, String name){
		this.id = id;
		this.name = name;
	}
	
	void getinfo() {
		System.out.println(id + " " + name);
	}
}

public class Sample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee obj1 = new Employee(1, "Joe");
		Employee obj2 = new Employee(2, "Zira");
		
		obj1.getinfo();
		obj2.getinfo();
	}

}
