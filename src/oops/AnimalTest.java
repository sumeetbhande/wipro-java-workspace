package oops;
//Base class
class Animal {
 // Method to be overridden
 public void sound() {
     System.out.println("Animal makes a sound");
 }
}

//Subclass Dog
class Dog extends Animal {
 @Override
 public void sound() {
     System.out.println("Dog barks: Woof!");
 }
}

//Subclass Cat
class Cat extends Animal {
 @Override
 public void sound() {
     System.out.println("Cat meows: Meow!");
 }
}

//Subclass Cow
class Cow extends Animal {
 @Override
 public void sound() {
     System.out.println("Cow moos: Moo!");
 }
}

//Main class
public class AnimalTest {
 public static void main(String[] args) {
     // Dynamic method dispatch: reference of base class points to subclass object
     Animal a;

     a = new Dog();  // base class ref to Dog object
     a.sound();      // calls Dog's sound()

     a = new Cat();  // base class ref to Cat object
     a.sound();      // calls Cat's sound()

     a = new Cow();  // base class ref to Cow object
     a.sound();      // calls Cow's sound()
 }
}
