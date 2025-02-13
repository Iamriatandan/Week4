package setinterface.symmetricdifference;
import java.util.ArrayList;
import java.util.Set;
import java.util.List;
import java.util.Arrays;
import java.util.HashSet;

public class SymmetricDifference {
    public static void main(String[] args) {

        Set<Integer> s1 = new HashSet<>(Arrays.asList(1,2,3));
        Set<Integer> s2 = new HashSet<>(Arrays.asList(3,4,5));

        List<Integer> result = differentElements(s1,s2);
        System.out.println(result);
    }

    //Method to find different elements
    public static List<Integer> differentElements(Set<Integer>s1,Set<Integer>s2){
        List<Integer> result = new ArrayList<>();

        //adding elements from both set that are not present in either set
        for(Integer i:s1){
            if(!s2.contains(i)){
                result.add(i);
            }
        }

        for(Integer i : s2){
            if(!s1.contains(i)){
                result.add(i);
            }
        }
        return result;
    }
}
