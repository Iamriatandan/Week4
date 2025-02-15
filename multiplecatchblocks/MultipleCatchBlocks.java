package multiplecatchblocks;

import java.util.Arrays;
import java.util.Scanner;

public class MultipleCatchBlocks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Enter array size
        System.out.println("Enter size of array");
        int size = sc.nextInt();

        int[] numbers = new int[size];
        System.out.println("Enter elements in array ");
        for(int i =0;i<size;i++){
            numbers[i] = sc.nextInt();
        }

        System.out.println("enter index value");
        int index =sc.nextInt();

     System.out.println(Arrays.toString(numbers));

        valueAtIndex(numbers,index);
    }

    //Method to print value at Index
    public static void valueAtIndex(int [] numbers,int index){
        try{
            System.out.println("Element at index : " + index + " is " + numbers[index]);
        }
        catch (IndexOutOfBoundsException e){
            System.out.println("Invalid Index" + e.getMessage());
        }
        catch (NullPointerException e){
            System.out.println("Array not initialized" + e.getMessage());
        }

    }
}
