package setinterface.equalsets;
import java.util.Set;
import java.util.Arrays;
import java.util.HashSet;

public class TwoEqualSets {
    public static void main(String[] args) {

        //Two sets
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1,2,3));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(3,2,1));

        boolean result = checkSets(set1,set2);
        System.out.println(result);
    }

    //Method to check if sets are equal
    public static boolean checkSets(Set<Integer>set1,Set<Integer>set2){

        //check if size of both is equal
        if(set1.size()!= set2.size()){
            return false;
        }

        //Traverse in set and check element
        for(Integer i : set1){
            boolean found = false;
            for(Integer j : set2){
                if(i.equals(j)){
                    found = true;
                    break;
                }
            }

            if(!found){
                return false;
            }
        }
        return true;
    }
}
