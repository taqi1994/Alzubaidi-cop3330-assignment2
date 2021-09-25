package ex26;

import java.util.Scanner;

public class ex26
{
    public static int calculate ( double balance, double apr, double monthlypayment )
    {

        //give it this value:
        apr = apr/365;
        return (int)Math.ceil( (-1 / 30.0)*Math.log ( 1+balance/monthlypayment * ( 1 - Math.pow (1+apr,30) )  ) / Math.log(1 +apr)  );

    }

    public static void main(String[] args)
    {
        Scanner reader = new Scanner (System.in);
        int month;
        double balance;
        double apr;
        double monthlypayment;

        System.out.print("What is your balance? ") ;
        balance=reader.nextDouble() ;

        System.out.print("What is the APR on the card (as a percent)? ") ;
        apr = reader.nextDouble();
        apr = apr/100;

        System.out.print("What is the monthly payment you can make? ");
        monthlypayment = reader.nextDouble();

        month = calculate ( balance, apr, monthlypayment );
        System.out.println("It will take " + month + " months to pay off this card.");
    }
}