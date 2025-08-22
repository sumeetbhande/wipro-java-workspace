package javaoops.inheritance;

class A3{
	String shape;
	
}

class B3 extends A3{
	void Circle() {
		shape = "Circle";
		System.out.println(shape);
	}
}

class C3 extends A3{
	void Square() {
		shape = "Square";
		System.out.println(shape);
	}
}

class D3 extends A3{
	void Triangle() {
		shape = "Triangle";
		System.out.println(shape);
	}
}

public class Sample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B3 obj1 = new B3();
		C3 obj2 = new C3();
		D3 obj3 = new D3();
		
		obj1.Circle();
		obj2.Square();
		obj3.Triangle();
	}

}
