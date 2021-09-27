/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Taqyuldeen Alzubaidi
 */


package ex34;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ex34
    {
    public static void main(String[] args)
        {

        //an array to store employees' :
        ArrayList<String> emp_names = new ArrayList<String>(Arrays.asList ("John Smith","Jackie Jackson","Chris Jones","Amanda Cullen","Jeremy Goodwin")  );

        //displays names:
        emp_display ( emp_names );

        Scanner reader = new Scanner(System.in);

        System.out.println();
        System.out.print("Enter an employee name to remove: ");

        //get the name wanted to remove..
        String name_remove = reader.nextLine();

        //opens array and removes it from the list..
        emp_names.remove(name_remove );


        System.out.println();

        //prints out the new list of names:
        emp_display (emp_names );
    }

    //a func for name removal:
    public static void emp_display(ArrayList<String> employee)
    {
        System.out.println("There are "+employee.size()+" employees: ");
           for(String empl:employee )
             {
                 System.out.println( empl );
             }

    }


}