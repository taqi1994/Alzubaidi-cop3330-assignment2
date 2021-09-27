/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Taqyuldeen Alzubaidi
 */

package ex37;
import java.util.*;

public class ex37
{
     public static void main(String[] args)
        {
            int length, spec_char, num ;

            //ask user for an input of how many is min length wanted?
            Scanner reader = new Scanner(System.in);
            System.out.print("What's the minimum length? ");

            length = Integer.parseInt(reader.nextLine());

            //asks for how many special char wanted?
            System.out.print("How many special characters? ");
            spec_char = Integer.parseInt( reader.nextLine());

            //asks for how many numbers wanted?
            System.out.print("How many numbers? ");
            num = Integer.parseInt( reader.nextLine());

            //func is called and displays results..
            System.out.println("Your password is " + password_given( length , spec_char , num ) );
        }

        public static String password_given (int size,  int spec_char , int numbers )
        {

            //letters are stored in a string:
            String letter_declare = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";

            //specia characteres are stored in a string:
            String special_char_declare = "!@#$%^&*()_+-=";

            //numbers are stored in a string:
            String numbers_declare = "0123456789";

            Random rand = new Random();
            ArrayList<Character> array = new ArrayList<>();

            for(int i = 0; i < spec_char ; i++ )
            {
                //a random special char is added to the given generated pass..
                array.add(special_char_declare.charAt( rand.nextInt (special_char_declare.length() ) ) );
            }

            //a random number is added to the given generated pass..
            for(int i = 0 ; i < numbers ; i++ )
            {
                // find random numeral and add it to the list
                array.add(numbers_declare.charAt(rand.nextInt(numbers_declare.length())));
            }

            for(int i = array.size()-1; i < size ; i++){
                //a random letter is added to the given generated pass..
                array.add(letter_declare.charAt(rand.nextInt(letter_declare.length())));
            }

            //the given password result will be shuffled..
            Collections.shuffle(array);
            String pass = "";
            for(Character x : array)
            {
                pass += Character.toString(x);
            }
            return pass; //displays the final result to user:

        }


}