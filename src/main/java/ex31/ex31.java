/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Taqyuldeen Alzubaidi
 */


package ex31;
import java.util.Scanner;


public class ex31
    {



        public static void main(String[] args)
        {
            int restingHR;
            int target_heart_rate;
            int age;


        Scanner reader = new Scanner (System.in);


        //will read inputs:
        while(true)
        {
            System.out.print("Enter Resting Pulse: ");
            String st = reader.next();

            //to check if input entered is a number..
            if (numeric(st ) )
                {
                    restingHR = Integer.parseInt(st);
                    break;
                }

                    else

                    {
                          System.out.println("Invalid Pulse");
                    }

        }


        while(true)
            {

               System.out.print("Enter Age: ");
               String st = reader.next();

            //to check if input is a number
            if(numeric (st) )
            {
                   age = Integer.parseInt(st);
                    break;
            }
               else
                {
                 System.out.println("Invalid Age");
                }

        }


        //now use this formula for calculations..
        System.out.println("Intensity\tRate");
        System.out.println("---------\t------");

            for(int intensity = 55 ; intensity <= 95 ; intensity += 5)
            {
               target_heart_rate = ( (220-age - restingHR ) * intensity / 100) + restingHR ;
               System.out.println ( intensity+"%\t\t"+target_heart_rate+" bpm") ;
         }

        reader.close();
    }

    //to catch if input is a string?
    public static boolean numeric (String input)
        {

        try
            {
                Integer.parseInt(input);
            }
                catch(Exception e)
                  {
                     return false;
                  }
        return true;

       }
}