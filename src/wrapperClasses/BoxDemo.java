package wrapperClasses;

//File: BoxDemo.java

public class BoxDemo {
 public static void main(String[] args) {

     // Box for Integer
     Box<Integer> intBox = new Box<>();
     intBox.setValue(100);  // Autoboxing: int → Integer
     System.out.println("Integer value: " + intBox.getValue());

     // Box for Double
     Box<Double> doubleBox = new Box<>();
     doubleBox.setValue(45.67);  // Autoboxing: double → Double
     System.out.println("Double value: " + doubleBox.getValue());
 }
}

//Generic class Box<T>
class Box<T> {
 private T value;

 // Setter method
 public void setValue(T value) {
     this.value = value;
 }

 // Getter method
 public T getValue() {
     return value;
 }
}
