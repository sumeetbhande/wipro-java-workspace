package javaoops.inheritance;

// Multi level inheritance 
class One{
	int a = 10;
}

class Two extends One{
	int b = 20;
}

class Three extends Two {
	int c = 30;
	
	void add() {
		int result = a + b + c;
		System.out.println("The result is :" +result);
	}}

public class Sample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Three obj1 = new Three();
    obj1.add();
	}

}
