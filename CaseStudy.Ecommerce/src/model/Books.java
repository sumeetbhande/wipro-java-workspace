package model;

public class Books extends Product {
    private String author;
    private String publisher;

    public Books(String id, String name, double price, int stockQuantity, String author, String publisher) {
        super(id, name, price, stockQuantity);
        this.author = author;
        this.publisher = publisher;
    }

    @Override
    public void displayDetails() {
        System.out.println("Book: " + name + " | Author: " + author + 
                           " | Publisher: " + publisher + " | Price: " + price + 
                           " | Stock: " + stockQuantity);
    }
}
