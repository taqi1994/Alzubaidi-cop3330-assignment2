package ex29;
import java.util.*;

public class ex29
{
    public static void main(String args[])
    {
        int ret;
        Scanner reader = new Scanner (System.in);

        boolean check = false;

        while(true)
        {
            try
            {
                //will ask for the rate of return:
                System.out.print("What is the rate of return? ");
                ret = Integer.parseInt(reader .next());

                System.out.println("It will take "+( 72 / ret )+" years to double your initial investment.");
                check =true;
            }

              catch (NumberFormatException i) //to check for an invalid input..
                   {
                   System.out.println("Sorry. That's not a valid input.");
                    }

            catch(ArithmeticException i) //to check for an invalid input..
                      {
                          System.out.println("Sorry. That's not a valid input.");
                      }

            if(check )
              {
                break;

               }

        }

    }


}