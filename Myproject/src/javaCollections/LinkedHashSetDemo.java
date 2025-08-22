package javaCollections;
import java.util.*;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet<String> lh = new LinkedHashSet<>();
		lh.add("Alex");
		lh.add("Bob");
		lh.add("Clary");
		lh.add("Alex");
		lh.add("Daniel");
		
		Iterator<String> itr = lh.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
