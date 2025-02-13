package listinterface.nthelementfromend;
import java.util.List;
import java.util.Arrays;
import java.util.LinkedList;

public class NthElementFromEnd {
    public static void main(String[] args) {
        List <String> list = new LinkedList<>(Arrays.asList("A","B","C","D","E"));
        int n =2;

        String result = findElement(list,n);
        System.out.println(result);
    }


    //method to find nh element from end
    public static String findElement(List<String>list, int n ){

        //using two pointer approach
        int first =0, second =0;

        //Moving first and second pointer n steps and until first reaches end
        for(int i =0;i<n;i++){
            if(first>= list.size()) return null;
            first++;
        }

        while(first< list.size()){
            first++;
            second++;
        }
        return list.get(second);
    }
}


