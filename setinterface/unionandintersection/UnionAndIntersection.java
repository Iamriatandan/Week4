package setinterface.unionandintersection;
import java.util.*;

public class UnionAndIntersection {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1,2,3));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(3,4,5));

        List<Integer> union = union(set1,set2);
        List<Integer> intersection = intersection(set1,set2);

        System.out.println(union);
        System.out.println("--------------------");
        System.out.println(intersection);
    }

    //Method to find Union
    public static List<Integer> union (Set<Integer>set1,Set<Integer>set2){
        List<Integer> unionn = new ArrayList<>();

        //adding elements from set1 and set2 in list
        unionn.addAll(set1);

        for (Integer i : set2){
            if(!unionn.contains(i)){
                unionn.add(i);
            }
        }
        return unionn;
    }

    //Method to find intersection
    public static List<Integer> intersection(Set<Integer>set1,Set<Integer>set2){
        List<Integer> intersectionn = new ArrayList<>();

        //adding elements from set1 that are in set2
        for(Integer i: set1){
            if(set2.contains(i)){
                intersectionn.add(i);
            }
        }
        return intersectionn;
    }
}
