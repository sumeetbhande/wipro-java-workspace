package javaCollections;

import java.util.ArrayList;
import java.util.Collections;

public class SortingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> st = new ArrayList<String>();
        st.add("Zebra");
        st.add("Cat");
        st.add("Ant");
        st.add("Lion");
        
        Collections.sort(st);
        System.out.println(st);
        
        Collections.sort(st, Collections.reverseOrder());
        System.out.println(st);
	}

}
