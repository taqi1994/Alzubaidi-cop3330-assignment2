/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Taqyuldeen Alzubaidi
 */


package ex32;

import java.util.*;

class ex32
{
 public static void main(String[] args)
    {
    int num;
    int user_guess;
    int total = 0 ;
    int data;
    char st;

        //introduction message..
        System.out.println("Let's play Guess the Number!");

        num = (int) (Math.random() * 999 + 1);

        Scanner reader = new Scanner(System.in);

        while(true)
           {


            // ask the user for game difficulty...
            System.out.print("Enter the difficulty level(1, 2, or  3): ");

            data = reader .nextInt() ;

           //if 1 is entered.. range is 1-10
            if( data  == 1 )
                num = (int) (Math.random() * 10 + 1);

            //if 2 is entered.. rage is 1-100
            else if( data == 2 )

                num = (int) (Math.random() * 100 + 1);

            //otherwise 1-1000
            else
                num = (int) (Math.random() * 1000 + 1);


            System.out.print("I have my number. What's your guess? ");

            do
            {
                user_guess = reader.nextInt(); //reads user's input..

                total++;

                /* if it guessed correctly, gives them a pass output,
                   if number guessed was higher or lower, it warns them
                 */
                if ( user_guess == num)
                {
                    System.out.println("You got it in "+total+"  guesses!");
                }

                else if ( user_guess < num )
                    System.out.println("Too low. Guess again: ");

                else if ( user_guess > num )
                    System.out.println("Too high. Guess again: ");
            }

            //ask if user wishes to play again; input accepted in small or capital letters:
            while ( user_guess != num) ;
            System.out.print("\nDo you wish to play again (Y/N)?  ");

            st = reader.next().charAt(0);
            if( st == 'N' || st == 'n')
                break;
        }
    }

}
