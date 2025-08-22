package javaexception;

public class Sample7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int b = 1;
		
		try {
			int result = a / b;
			System.out.println(result);
		}catch(Exception ex) {
			System.out.println("Exception occured");
		}finally {
			System.out.println("Final block executed");
		}

	}

}
