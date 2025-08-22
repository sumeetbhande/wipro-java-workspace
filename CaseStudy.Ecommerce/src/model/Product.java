package model;

public abstract class Product {
 protected String id;
 protected String name;
 protected double price;
 protected int stockQuantity;

 public Product(String id, String name, double price, int stockQuantity) {
     this.id = id;
     this.name = name;
     this.price = price;
     this.stockQuantity = stockQuantity;
 }

 public abstract void displayDetails();

 public double getPrice() {
     return price;
 }

 public int getStockQuantity() {
     return stockQuantity;
 }

 public void updateStock(int amount) {
     this.stockQuantity += amount;
 }

 public boolean reduceStock(int quantity) {
     if (stockQuantity >= quantity) {
         stockQuantity -= quantity;
         return true;
     }
     return false;
 }
}
