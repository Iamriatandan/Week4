package customexception;
import java.util.Scanner;
class InvalidAgeException extends Exception{
    public InvalidAgeException(String message){
        super(message);
    }
}
public class CustomExceptionDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Enter age by user
        System.out.println("Enter Age");
        int age = sc.nextInt();

        validateAge(age);
    }
    //Method to check Custom Exceptions
    public static void validateAge(int age){
        if(age<18){
            try{
                throw new InvalidAgeException(" Age must be 18 or above");
            }
            catch (InvalidAgeException e){
                System.out.println("Exception " + e.getMessage());
            }
        }
        else{
            System.out.println(" Access granted!");
        }
    }
}
