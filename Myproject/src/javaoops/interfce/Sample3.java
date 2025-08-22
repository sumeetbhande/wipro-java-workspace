package javaoops.interfce;

interface I2{
	void addition();
}
interface I3{
	void substraction();
}


public class Sample3 implements I2, I3{
	public void addition() {
		System.out.println("Addition Function");
	}
	public void substraction() {
		System.out.println("Substraction Function");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sample3 obj = new Sample3();
		obj.addition();
		obj.substraction();
	}

}
