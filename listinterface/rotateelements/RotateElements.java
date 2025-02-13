package listinterface.rotateelements;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class RotateElements {
    public static void main(String[] args) {
        List <Integer> list = new ArrayList<>(Arrays.asList(10,20,30,40,50));
        int position = 2; // rotate by 2 positions

        rotateList(list,position);
        System.out.println(list);
    }

    //method to rotate list by given no of positions
    public static void rotateList(List<Integer>list, int position){
        int n = list.size();

        //temporary list to store rotated values
        List<Integer>temp = new ArrayList<>();

        //adding rotated and remaining part to list
        for(int i =position;i<n;i++){
            temp.add(list.get(i));
        }
        for(int i =0;i<position;i++){
            temp.add(list.get(i));
        }

        for(int i =0;i<n;i++){
            list.set(i,temp.get(i));
        }
    }
}
