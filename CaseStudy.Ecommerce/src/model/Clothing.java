
package model;

public class Clothing extends Product {
    private String size;
    private String fabric;

    public Clothing(String id, String name, double price, int stockQuantity, String size, String fabric) {
        super(id, name, price, stockQuantity);
        this.size = size;
        this.fabric = fabric;
    }

    @Override
    public void displayDetails() {
        System.out.println("Clothing: " + name + " | Size: " + size + 
                           " | Fabric: " + fabric + " | Price: " + price + 
                           " | Stock: " + stockQuantity);
    }
}
