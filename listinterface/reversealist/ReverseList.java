package listinterface.reversealist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ReverseList {

    //method to reverse an integer list
    public static void reverseList(List<Integer> l){
        int left =0 , right = l.size()-1;
        while (left<right){
            //swapping elements
            int temp = l.get(left);
            l.set(left,l.get(right));
            l.set(right,temp);
            left++;
            right--;
        }
    }

    public static void main(String[] args) {

        //for arrayList
        List<Integer> al = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        System.out.println("Original array list : " + al);
        reverseList(al);
        System.out.println("Reverse Arraylist : " + al);

        //for linkedlist
        List<Integer> ll = new LinkedList<>(Arrays.asList(1,2,3,4,5));
        System.out.println("Original linked list : " + ll);
        reverseList(ll);
        System.out.println("Reverse linked list : " + ll);
    }
}


