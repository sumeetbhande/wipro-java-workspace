package javaCollections;
import java.util.*;
public class HashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> hs = new HashSet<String>();
		hs.add("Sumeet");
		hs.add("Neha");
		hs.add("Veeru");
		hs.add("Sumeet");
		
		Iterator<String> itr = hs.iterator();
		 while (itr.hasNext()) {
			 System.out.println(itr.next());
		 }
		
	}

}
