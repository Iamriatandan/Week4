package dyanamiconlinemarketplace;

public class DiscountManager {
    public static <T extends ProductCategory> void applyDiscount(Product<T> product, double percentage) {
        if (percentage < 0 || percentage > 100) {
            System.out.println("Invalid discount percentage!");
            return;
        }

        double discountAmount = (product.getPrice() * percentage) / 100;
        double newPrice = product.getPrice() - discountAmount;

        // Ensure the price does not go below the category's minimum price
        if (newPrice < product.getCategory().getMinPrice()) {
            System.out.println("Discount too high! Cannot reduce price below minimum.");
            return;
        }

        product.setPrice(newPrice);
        System.out.println("Discount applied! New price of " + product.getProductName() + ": $" + newPrice);
    }
}
