package model;

public class Furniture extends Product {
    private String material;
    private String dimensions;

    public Furniture(String id, String name, double price, int stockQuantity, String material, String dimensions) {
        super(id, name, price, stockQuantity);
        this.material = material;
        this.dimensions = dimensions;
    }

    @Override
    public void displayDetails() {
        System.out.println("Furniture: " + name + " | Material: " + material + 
                           " | Dimensions: " + dimensions + " | Price: " + price + 
                           " | Stock: " + stockQuantity);
    }
}
