package dyanamiconlinemarketplace;

public class Product <T extends ProductCategory>{
    private String productName; // Product name
    private T category; // Product category
    private double price; // Product price

    public Product(String productName, T category, double price) {
        this.productName = productName;
        this.category = category;
        this.price = price;
    }

    public String getProductName() {
        return productName;
    }

    public T getCategory() {
        return category;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double newPrice) {
        this.price = newPrice;
    }

    public void displayProductDetails() {
        System.out.println("Product: " + productName + ", Category: " + category.getName() + ", Price: $" + price);
    }
}
