package oops;

//Shape.java
abstract class Shape {
 // Abstract method
 abstract double area();
}

//Circle.java
class Circle extends Shape {
 double radius;

 // Constructor
 public Circle(double radius) {
     this.radius = radius;
 }

 // Override area() method
 public double area() {
     return Math.PI * radius * radius;
 }
}

//Rectangle.java
class Rectangle extends Shape {
 double length, width;

 // Constructor
 public Rectangle(double length, double width) {
     this.length = length;
     this.width = width;
 }

 // Override area() method
 public double area() {
     return length * width;
 }
}

//Main class
public class ShapeTest {
 public static void main(String[] args) {
     // Create objects
     Shape circle = new Circle(5.0);
     Shape rectangle = new Rectangle(4.0, 6.0);

     // Print areas
     System.out.println("Area of Circle   : " + circle.area());
     System.out.println("Area of Rectangle: " + rectangle.area());
 }
}
