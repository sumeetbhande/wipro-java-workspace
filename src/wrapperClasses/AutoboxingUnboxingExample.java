package wrapperClasses;
import java.util.*;
public class AutoboxingUnboxingExample {
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    List <Double> db = new ArrayList<>();
    db.add(44.5);
    db.add(55.3);
    db.add(12.55);
    
    double sum = 0;
    
    for (double value : db) {
    	sum = sum + value;
    }
    
    double divide = sum/db.size();
    
    System.out.println(sum);
    System.out.println(divide);
    
	}

}
