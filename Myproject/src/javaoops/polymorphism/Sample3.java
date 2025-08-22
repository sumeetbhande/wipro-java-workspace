package javaoops.polymorphism;

class A1{
	void Addition(int a, int b ) {
		int result;
		result = a + b;
		System.out.println(result);
	}
}

class B1 extends A1{
	void Mul(int a, int b ) {
		int result;
		result = a * b;
		System.out.println(result);
	}
}
public class Sample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B1 obj = new B1();  // Upcasting
        obj.Mul(5, 10);
	}

}
