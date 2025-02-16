package finallyblockexecution;
import java.util.*;
public class Division {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number 1 ");
        int num1 = sc.nextInt();

        System.out.println("Enter Number 2");
        int num2 = sc.nextInt();

        divison(num1,num2);

    }

    //Method to ensure finally block is executed
    public static void divison(int num1,int num2){
        try{
            int result = num1/num2;
            System.out.println("Divison of number1 by number 2 is : " + result);
        }
        catch(ArithmeticException e){
            System.out.println("Error divison by 0 " + e.getMessage());
        }
        finally {
            System.out.println("Operation Completed");
        }
    }
}
