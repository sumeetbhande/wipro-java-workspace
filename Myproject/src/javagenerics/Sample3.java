package javagenerics;
import java.util.*;

public class Sample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> al= new ArrayList<>();
		
		al.add("Sumeet");
		al.add("Bhande");
//		al.add(23);
		
		String s1 = (String) al.get(0);
		String s2 = (String) al.get(1);
//		String s3 = (String) al.get(2);
		
		System.out.println(s1);
		
		

	}

}
