package setinterface.setsubsetcheck;
import java.util.*;
public class SetSubsetCheck {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>(Arrays.asList(2, 3));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(1, 2, 3, 4));

        boolean isSubset = isSubset(set1, set2);
        System.out.println(isSubset);

    }

    //Method to check subset
    public static boolean isSubset(Set<Integer> set1, Set<Integer> set2) {
        // Iterate through each element of set1
        for (Integer num : set1) {
            // If any element is not found in set2, set1 is not a subset
            if (!set2.contains(num)) {
                return false;
            }
        }
        // If all elements are found in set2, then set1 is a subset
        return true;
    }
}
