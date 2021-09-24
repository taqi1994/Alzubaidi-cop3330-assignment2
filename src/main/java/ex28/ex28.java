package ex28;
import java.util.Scanner;

public class ex28

{
    public static void main(String[] args)
    {
        int total , i;

        Scanner read = new Scanner(System.in) ;
        total = 0;
            for ( i = 0; i < 5; i++ )
                {
                      System.out.print ("Enter a number: ");
                      total = total + read.nextInt() ;
                }
        System.out.println("The total is " + total + ".");
    }

}