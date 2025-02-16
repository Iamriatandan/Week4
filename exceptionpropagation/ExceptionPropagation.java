package exceptionpropagation;

public class ExceptionPropagation {
    public static void main(String[] args) {
        try{
            method2();
        }
        catch (ArithmeticException e){
            System.out.println("Handled exception in main " + e.getMessage());
        }
    }

    //Method 1
    static void method1(){
        int a = 20/0;
    }

    //Method 2
    static void method2(){
        method1();
    }
}
