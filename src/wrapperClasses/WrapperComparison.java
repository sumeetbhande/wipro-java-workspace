package wrapperClasses;

public class WrapperComparison {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer a = 100;
		Integer b = 100;
		
		Integer c = new Integer(100);
		Integer d = new Integer (200);
		
		System.out.println("a = b " + (a==b));
		System.out.println("c = d " + (c==d));
		
		System.out.println("a.euqals(b) " + a.equals(b));
		System.out.println("c.equals(d) " + c.equals(d));

	}

}
