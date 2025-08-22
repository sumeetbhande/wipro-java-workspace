package javaoops;
//24/07/2025 Practice on Object, Class.

class Person{
	int id = 1;
	String name = "Sumeet";
	void getinfo() {
		System.out.println(id +" "+ name);
	}
	
	}


public class Sample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person obj = new Person();
		obj.getinfo();
	}

}
