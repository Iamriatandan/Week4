package smartwarehousemanagementsystem;

public class SmartWareHouse {
    public static void main(String[] args) {
        // Creating storage objects for each item type
        Storage<Electronics> electronicsStorage = new Storage<>();
        Storage<Groceries> groceriesStorage = new Storage<>();
        Storage<Furniture> furnitureStorage = new Storage<>();

        // Adding items to each storage
        electronicsStorage.addItem(new Electronics("Laptop", 24));
        electronicsStorage.addItem(new Electronics("Smartphone", 12));

        groceriesStorage.addItem(new Groceries("Milk", "2025-02-28"));
        groceriesStorage.addItem(new Groceries("Bread", "2025-02-15"));

        furnitureStorage.addItem(new Furniture("Table", "Wood"));
        furnitureStorage.addItem(new Furniture("Sofa", "Leather"));

        // Displaying items in each storage category
        System.out.println("Electronics Storage:");
        electronicsStorage.displayItems();

        System.out.println("\nGroceries Storage:");
        groceriesStorage.displayItems();

        System.out.println("\nFurniture Storage:");
        furnitureStorage.displayItems();

        // Using wildcard method to display all items
        System.out.println("\nDisplaying all items using wildcard method:");
        WareHouseUtils.displayAllItems(electronicsStorage.getItems());
        WareHouseUtils.displayAllItems(groceriesStorage.getItems());
        WareHouseUtils.displayAllItems(furnitureStorage.getItems());
    }
}
