package listinterface.frequencyofelements;

import java.util.*;

public class Frequency {
    public static void main(String[] args) {
        //list of strings
        List<String> list = Arrays.asList("Apple", "Banana","Apple","Orange");

        Map<String,Integer>frequency = countFrequency(list);
        System.out.println(frequency);
    }

    // method convert string into map and count frequency

    public static Map<String,Integer> countFrequency(List<String> list){
        Map <String,Integer> map = new HashMap<>();
        for(String element : list){
            if(map.containsKey(element)){
                map.put(element, map.get(element) +1);
            }
            else{
                map.put(element,1);
            }
        }
        return map;
    }
}
