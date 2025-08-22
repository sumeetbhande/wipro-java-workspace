package javaCollections;

import java.util.*;
public class DqDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayDeque<Integer> ad = new ArrayDeque<Integer>();
		ad.add(10);
		ad.add(20);
		ad.add(30);
		ad.add(40);
		ad.add(50);
		
		System.out.println(ad);
		
		ad.clear();
		
		System.out.println(ad);
		
		ad.addFirst(70);
		ad.addFirst(60);
		
		ad.addLast(80);
		ad.addLast(90);
		
		System.out.println(ad);
		

	}

}
