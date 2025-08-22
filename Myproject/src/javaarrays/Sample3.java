package javaarrays;

public class Sample3 {
	
	
	static void sum(int[] arr) {
		int result = 0;
		for(int i = 0; i < arr.length; i ++) {
			result = result + arr[i];
		}
		
		System.out.println(result);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int arr[]= {10, 20, 30, 40};
      sum(arr);
	}

}
