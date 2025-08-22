package javaoops.polymorphism;

class Calculation{
	void Addition(int x, int y) {
		int result;
		result = x + y;
		System.out.println(result);
	}
	
	void Addition(int x, int y, int z) {
		int result;
		result = x + y + z;
		System.out.println(result);
	}
}

public class Sample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculation obj1 = new Calculation();
		obj1.Addition(10, 20);
		obj1.Addition(10, 20, 30);
		
	}

}
