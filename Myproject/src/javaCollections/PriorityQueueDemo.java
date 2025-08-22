package javaCollections;
import java.util.*;
public class PriorityQueueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PriorityQueue<Integer> pQ = new PriorityQueue<Integer>();
		pQ.add(10);
		pQ.add(20);
		pQ.add(30);
		
		System.out.println(pQ.peek());
		
		System.out.println(pQ.poll());
		
		System.out.println(pQ.peek());

	}

}
