package nestedtrycatch;

import java.util.Arrays;
import java.util.Scanner;

public class NestedTryCatch {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //taking inter array size
        System.out.println("Enter size of array");
        int size = sc.nextInt();

        System.out.println("Enter elements in array");
        int [] arr = new int[size];
        for(int i : arr){
            i = sc.nextInt();
        }
        System.out.println( "Enter index");
        int index = sc.nextInt();

        System.out.println("Enter divisor");
        int divisor = sc.nextInt();

        System.out.println(Arrays.toString(arr));

        division(arr,index,divisor);
    }

    //Method to do divison
    public static void division(int[]arr, int index,int divisor){
        try{
            int value = arr[index];
            try{
                int result = value/divisor;
                System.out.println("Result is : " + result);
            }
            catch(ArithmeticException e){
                System.out.println("Cannot Divide by zero");
            }
        }
        catch (IndexOutOfBoundsException e){
            System.out.println("Invalid index value");
        }
    }
}
