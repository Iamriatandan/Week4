package smartwarehousemanagementsystem;
import java.util.*;
public class Storage<T extends WareHouseItem>{

    private List<T> items; // List to store items

    public Storage() {
        items = new ArrayList<>();
    }

    // Method to add an item to storage and remove
    public void addItem(T item) {
        items.add(item);
    }

    public void removeItem(T item) {
        items.remove(item);
    }

   // displaying items
    public void displayItems() {
        for (T item : items) {
            item.displayDetails();
        }
    }

    public List<T> getItems() { // Method to retrieve the list of stored items
        return items;
    }
}
