package shoppingcartsystem;
import java.util.*;
public class ShoppingCart {
    public static void main(String[] args) {
        Map<String, Double> productPrices = new HashMap<>();
        Map<String, Double> cartItems = new LinkedHashMap<>();
        Map<String, Double> sortedCartItems = new TreeMap<>(Comparator.comparingDouble(cartItems::get));

        // Adding items to cart
        productPrices.put("Laptop", 1000.00);
        productPrices.put("Headphones", 50.00);
        productPrices.put("Keyboard", 25.00);

        addItemToCart(cartItems, sortedCartItems, "Laptop", productPrices.get("Laptop"));
        addItemToCart(cartItems, sortedCartItems, "Headphones", productPrices.get("Headphones"));

        // Display sorted cart items by price
        System.out.println("Sorted Cart Items: " + sortedCartItems);
    }

    public static void addItemToCart(Map<String, Double> cartItems, Map<String, Double> sortedCartItems, String item, Double price) {
        cartItems.put(item, price);
        sortedCartItems.clear();
        sortedCartItems.putAll(cartItems);
    }
}
