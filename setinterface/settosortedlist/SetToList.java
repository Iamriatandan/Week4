package setinterface.settosortedlist;
import java.util.*;
public class SetToList {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>(Arrays.asList(5, 3, 9, 1));

        List<Integer> sortedList = convertToSortedList(set);

        System.out.println(sortedList);
    }

    //method to sort list from set

    public static List<Integer> convertToSortedList(Set<Integer> set) {
        // Create a list from the set
        List<Integer> list = new ArrayList<>(set);

        // Simple bubble sort to sort the list in ascending order
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size() - 1 - i; j++) {
                if (list.get(j) > list.get(j + 1)) {
                    // Swap the elements
                    int temp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, temp);
                }
            }
        }

        return list;
    }
}
