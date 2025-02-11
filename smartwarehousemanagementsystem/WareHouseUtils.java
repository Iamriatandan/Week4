package smartwarehousemanagementsystem;
import java.util.*;
public class WareHouseUtils {
    public static void displayAllItems(List<? extends WareHouseItem> items) {
        for (WareHouseItem item : items) {
            item.displayDetails();
        }
    }
}
