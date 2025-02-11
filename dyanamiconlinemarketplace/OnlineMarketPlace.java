package dyanamiconlinemarketplace;

public class OnlineMarketPlace {
    public static void main(String[] args) {
        // Creating different product categories
        BookCategory bookCategory = new BookCategory();
        ClothingCategory clothingCategory = new ClothingCategory();
        GadgetCategory gadgetCategory = new GadgetCategory();

        // Creating product objects
        Product<BookCategory> book1 = new Product<>("The Alchemist", bookCategory, 250.0);
        Product<ClothingCategory> shirt = new Product<>("Casual Shirt", clothingCategory, 1500.0);
        Product<GadgetCategory> phone = new Product<>("Smartphone", gadgetCategory, 30000.0);

        // Creating a catalog for each product type
        ProductCatalog<BookCategory> bookCatalog = new ProductCatalog<>();
        ProductCatalog<ClothingCategory> clothingCatalog = new ProductCatalog<>();
        ProductCatalog<GadgetCategory> gadgetCatalog = new ProductCatalog<>();

        // Adding products to their respective catalogs
        bookCatalog.addProduct(book1);
        clothingCatalog.addProduct(shirt);
        gadgetCatalog.addProduct(phone);

        // Displaying catalogs
        System.out.println("Book Catalog:");
        bookCatalog.displayCatalog();

        System.out.println("\nClothing Catalog:");
        clothingCatalog.displayCatalog();

        System.out.println("\nGadget Catalog:");
        gadgetCatalog.displayCatalog();

        // Applying discounts
        System.out.println("\nApplying discounts:");
        DiscountManager.applyDiscount(book1, 10);
        DiscountManager.applyDiscount(shirt, 20);
        DiscountManager.applyDiscount(phone, 5);

        // Displaying catalogs after discounts
        System.out.println("\nUpdated Book Catalog:");
        bookCatalog.displayCatalog();

        System.out.println("\nUpdated Clothing Catalog:");
        clothingCatalog.displayCatalog();

        System.out.println("\nUpdated Gadget Catalog:");
        gadgetCatalog.displayCatalog();
    }
}
