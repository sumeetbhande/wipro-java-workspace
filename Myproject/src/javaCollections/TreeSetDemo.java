package javaCollections;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> ts = new TreeSet<>();
		
		ts.add("Alex");
		ts.add("Dobbly");
		ts.add("Bob");
		ts.add("Classy");
		
		Iterator<String> itr = ts.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
