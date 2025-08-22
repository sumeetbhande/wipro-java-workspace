package javaexception;

public class Sample5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {1,2,3,4,5,6};
		
		try {
			System.out.println(arr[6]);
		}catch(ArrayIndexOutOfBoundsException ex) {
			System.out.println("Exception Occurred !!!");
		}

	}

}
