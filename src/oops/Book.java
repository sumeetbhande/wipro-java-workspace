package oops;

//Book.java
public class Book {
 // Fields
 String title;
 String author;
 double price;

 // Constructor
 public Book(String title, String author, double price) {
     this.title = title;
     this.author = author;
     this.price = price;
 }

 // Method to display book details
 public void displayDetails() {
     System.out.println("Title : " + title);
     System.out.println("Author: " + author);
     System.out.println("Price : ₹" + price);
     System.out.println("------------------------");
 }

 // main method
 public static void main(String[] args) {
     // Create first book object
     Book book1 = new Book("THE FRIENDS", "Sumeet Bhande", 297.0);

     // Create second book object
     Book book2 = new Book("The Cooking Lady", "Veeresh Bhande", 358.0);

     // Print details of books
     System.out.println("Book 1 Details:");
     book1.displayDetails();

     System.out.println("Book 2 Details:");
     book2.displayDetails();
 }
}
