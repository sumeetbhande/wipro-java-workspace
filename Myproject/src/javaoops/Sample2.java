package javaoops;
// 24/07/2025 Practice on Object, Class, "" Default Constructor".

class Student{
	int id ;
	String name;
	
	// Default Constructor
	Student(){
		id = 101;
		name = "Joe";
		System.out.println("Default Constructor gets executed ");
	}
	
	void info() {
		System.out.println(id + " " + name);
	}
}

public class Sample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student obj = new Student();
		obj.info();
	}

}
