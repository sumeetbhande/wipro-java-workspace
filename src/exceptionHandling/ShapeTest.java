package exceptionHandling;
//Abstract class Shape
abstract class Shape {
 // Abstract method
 abstract double area();

 // Non-abstract method
 void displayShapeType() {
     System.out.println("This is a shape.");
 }
}

//Circle class extending Shape
class Circle extends Shape {
 private double radius;

 Circle(double radius) {
     this.radius = radius;
 }

 @Override
 double area() {
     return Math.PI * radius * radius;
 }

 // Overriding non-abstract method (optional)
 @Override
 void displayShapeType() {
     System.out.println("This is a Circle.");
 }
}

//Rectangle class extending Shape
class Rectangle extends Shape {
 private double length;
 private double width;

 Rectangle(double length, double width) {
     this.length = length;
     this.width = width;
 }

 @Override
 double area() {
     return length * width;
 }

 // Overriding non-abstract method (optional)
 @Override
 void displayShapeType() {
     System.out.println("This is a Rectangle.");
 }
}

//Main class to test
public class ShapeTest {
 public static void main(String[] args) {
     Shape circle = new Circle(5.0);
     Shape rectangle = new Rectangle(4.0, 6.0);

     // Calling both abstract and non-abstract methods
     circle.displayShapeType();
     System.out.println("Area: " + circle.area());

     rectangle.displayShapeType();
     System.out.println("Area: " + rectangle.area());
 }
}
