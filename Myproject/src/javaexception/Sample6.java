package javaexception;

public class Sample6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			String name = null;
			System.out.println(name.length());
		}catch(NullPointerException ex) {
			System.out.println(ex.getMessage());
		}catch(ArithmeticException ex ) {
			System.out.println(ex.getMessage());
		}catch(Exception ex) {
			System.out.println(ex.getMessage());
		}

	}

}
