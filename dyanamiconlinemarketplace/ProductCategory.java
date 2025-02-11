package dyanamiconlinemarketplace;
import java.util.ArrayList;
import java.util.List;

// Step 1: Abstract class representing a general product category
abstract class ProductCategory {
    private String name; // Name of the category
    private double minPrice; // Minimum price in this category
    private double maxPrice; // Maximum price in this category

    public ProductCategory(String name, double minPrice, double maxPrice) {
        this.name = name;
        this.minPrice = minPrice;
        this.maxPrice = maxPrice;
    }

    public String getName() {
        return name;
    }

    public double getMinPrice() {
        return minPrice;
    }

    public double getMaxPrice() {
        return maxPrice;
    }
}
