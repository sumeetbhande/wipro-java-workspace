package javaexception;

//NullPointerException

public class Sample4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = null;
		
		try {
			System.out.println(name.length());
		}catch(NullPointerException ex) {
		     System.out.println("Exception Arised!!!");
		}

	}

}
