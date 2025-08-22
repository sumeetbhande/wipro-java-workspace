package javaoops.polymorphism;

class Calculations{
	void Addition(int x, int y) {
		int result ;
		result = x + y;
		System.out.println(result);
	}
	
	void Addition( double x, double y) {
		double result;
		result = x + y;
		System.out.println(result);
	}
}

public class Sample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculations obj = new Calculations();
		obj.Addition(20.5, 44.5);
	}

}
