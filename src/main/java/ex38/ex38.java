/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Taqyuldeen Alzubaidi
 */


package ex38;
import java.util.*;

public class ex38  {
    public static void main(String[] args)
    {
        Scanner reader = new Scanner(System.in);

        // prompt user to enter a string containing numbers separated by space
        System.out.print("Enter a list of numbers, separated by spaces: ");
        String inputs = reader.nextLine();

        //to split the inputted list by user..
        String array[] = inputs.split("");

        // make a function call that will return the Integer array of even numbers
        Integer even_nums[] = filterEvenNumbers(array );

        // display the filtered even number as per the given format
        System.out.print("The even numbers are ");
        for(int i=0; i<even_nums.length; i++){
            if(i < even_nums.length-1){
                System.out.print(even_nums[i] + " ");
            }
            else
            {
                System.out.print(even_nums[i] + ".");
            }
        }
    }

    // this method takes array of string integers as input parameter
    // and then returns the Integer array of even numbers
    public static Integer[] filterEvenNumbers(String array[]) {

        // declare an empty array list of Integer
        ArrayList<Integer> newList = new ArrayList<>();

        // now, loop to iterate over input array
        for(int i=0; i<array.length; i++){

            // convert string number to integer number
            int num = Integer.parseInt(array[i]);

            // check if number is divisible by 2 (means it is even)
            if(num % 2 == 0){

                // add number to the list
                newList.add(num);
            }
        }

        // now, convert the array list to integer array
        Integer[] arr = new Integer[newList.size()];
        arr = newList.toArray(arr);

        // return Integer array
        return arr;
    }
}