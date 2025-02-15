package throwandthrows;

import java.util.Scanner;

public class ThrowAndThrows {
    public static void main(String[] args) throws IllegalArgumentException {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter amount : ");
        double amount = sc.nextDouble();

        System.out.println("Enter rate : " );
        double rate = sc.nextDouble();

        System.out.println("Enter years");
        int years = sc.nextInt();

        double intrest = calculateInterest(amount,rate,years);
        System.out.println("Interest on amount : " + amount + "rate" + " year " + years + "is : " + intrest);


    }

    //Method to calculate interest
    public static double  calculateInterest(double amount, double rate, int years){

            if (amount < 0 || rate < 0) {
                throw new IllegalArgumentException("Amount or rate cannot be negative"); // Explicitly throwing exception
            }
            double intrest = (amount*rate*years)/100;
            return intrest;
    }

}
