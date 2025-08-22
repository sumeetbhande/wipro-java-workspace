package javaexception;

public class Sample1 {

	public static void main(String[] args) {
		// Exception Handling 
		System.out.println(10);
		System.out.println(20);
		System.out.println(30);
		System.out.println(40);
		//try catch block
		try {
			System.out.println(50);
		}catch (Exception ex) {
			System.out.println(ex.getMessage());
			System.out.println(50/(0+1));
		}
		
		System.out.println(60);
		System.out.println(70);
	}

}
