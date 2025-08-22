package javaCollections;

import java.util.*;

class Student{
	int rollNo;
	String name;
	
	Student(int rollNo, String name){
		this.rollNo = rollNo;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return rollNo + " " + name;
	}
}

class SortByRoll implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return Integer.compare(s1.rollNo, s2.rollNo);
    }
}

public class ComparatorInterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> sObj = new ArrayList<>();
		sObj.add(new Student(111, "Maya"));
		sObj.add(new Student(131, "Alex"));
		sObj.add(new Student(110, "Clare"));
		sObj.add(new Student(101, "Jack"));
		
		Collections.sort(sObj, new SortByRoll ());
		System.out.println("Sorted by Roll Number :");
		
		Iterator<Student> itr = sObj.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
