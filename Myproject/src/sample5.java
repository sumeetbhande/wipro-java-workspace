import java.util.*;
public class sample5 {
	
	static int addition(int x, int y ) {
		int res = x + y;
		return res;
	}
	
		public static void main(String args[]) {
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter the first number : ");
			int num1 = sc.nextInt();
			
			System.out.println("Enter the first number : ");
			int num2 = sc.nextInt();
			
			int result = addition(num1, num2);
			
			System.out.println("The sum of two number is : " +result);
			
			sc.close();
		}
}
