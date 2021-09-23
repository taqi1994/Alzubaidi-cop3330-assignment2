/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Taqyuldeen Alzubaidi
 */


import java.io.*;
import java.util.*;

class code {
    public static void passwordValidator (String pass)
    {
//this will check if input has a lower
        int i = pass.length();
        boolean lower_included = false,
                upper_included = false,
                digit_included = false,
                specialchar_included = false;

        Set<Character> setup = new HashSet<Character> ( Arrays.asList('!', '@', '#', '$', '%', '^', '&',
                        '*', '(', ')', '-', '+') ) ;

        for (char x : pass.toCharArray())
             {
                 if (Character.isLowerCase(x))
                     lower_included = true;
                 if (Character.isUpperCase(x))
                upper_included = true;
                 if (Character.isDigit(x) )
                digit_included = true;
                 if ( setup.contains(x) )
                specialchar_included = true;
        }


        if (digit_included && lower_included || upper_included && specialchar_included
                && ( i >= 8 ) )
            System.out.print("is a very strong password.");
        else if ((lower_included || upper_included || specialchar_included)
                && (i >= 8))
            System.out.print("is a strong password.");
        else if(lower_included || upper_included && (i < 8))
            System.out.print("is a weak password.");
        else
            System.out.print("is a very weak password.");

    }

    public static void main (String [] args)
    {
        String input;
        Scanner reader = new Scanner (System.in);
        System.out.print("The Password: ");

        input = reader.nextLine();
        passwordValidator (input);
    }


}