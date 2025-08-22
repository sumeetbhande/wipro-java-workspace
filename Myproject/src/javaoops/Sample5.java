package javaoops;

//Static

class Counter{
	static int count = 0;
	
	Counter(){
		count++;
		System.out.println(count);
	}
	
	
}

public class Sample5 {
    
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Counter obj1 = new Counter();
		Counter obj2 = new Counter();
		Counter obj3 = new Counter();
		
	}

}
