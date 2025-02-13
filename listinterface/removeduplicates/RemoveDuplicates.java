package listinterface.removeduplicates;

import java.util.*;

public class RemoveDuplicates {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(3,1,2,2,3,4);
        List<Integer> answer = duplicates(list);
        System.out.println(answer);

    }

    //method to remove duplicates by preserving order
    public static List<Integer> duplicates (List<Integer>list){

        // new list to store value and hashset to store unique value
        Set hs = new HashSet<>();
        List<Integer> result = new ArrayList<>();

        for(int i : list){
            if(!hs.contains(i)){
                hs.add(i);
                result.add(i);
            }
        }
        return result;
    }
}
