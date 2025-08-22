package javaoops.interfce;

interface I1{
	void personalLoan();
	void educationLoan();
}
class SBI implements I1{
	public void personalLoan() {
		System.out.println("Rate of Interest : 11%");
	}
	public void educationLoan() {
		System.out.println("Rate of Interest : 7 % ");
	}
}
public class Sample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SBI obj = new SBI();
		obj.personalLoan();
		obj.educationLoan();

	}

}
