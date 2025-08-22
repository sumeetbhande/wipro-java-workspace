package javaoops.inheritance;
//Hybrid inheritance

class A4{
	double pi = 3.14;
}

class B4 extends A4 {
	
	void area_of_circle() {
		double res;
		
		res = 2 * pi *5;
		System.out.println("The are of the Circle is : " +res);
	}
}

class C4 extends A4{
	void area_of_sphere() {
		double res;
		res = 4 * pi * 5;
		System.out.println("The are of the Sphere is : " +res);
	}
}
class D4 extends C4{
}


public class Sample4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		B4 objb = new B4();
	    C4 objc = new C4();
//	    D4 objd = new D4();
	    
	    objb.area_of_circle();
	    objc.area_of_sphere();

	}

}
