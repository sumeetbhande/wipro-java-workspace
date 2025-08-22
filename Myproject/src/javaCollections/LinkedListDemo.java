package javaCollections;
import java.util.*;


public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     LinkedList<Integer> l1 = new LinkedList <Integer>();
	 for(int i = 1; i <= 5; i ++) 
		 l1.add(i);
		 System.out.println(l1);
		 
		 l1.remove(3);
		 
		 System.out.println(l1);
		 
		 for(int i = 0; i <l1.size(); i++) {
			System.out.println(l1.get(i) + " "); 
		 }
	 }
	}

