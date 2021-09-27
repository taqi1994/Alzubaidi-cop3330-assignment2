/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Taqyuldeen Alzubaidi
 */


package ex33;

import java.util.Random;
import java.util.Scanner;

public class ex33 {
public static void main(String[] args)
    {
        int rand_answer;

        //creating an array for possible answers
        String[] answer = {"Yes","No","Maybe","Ask again later"};

        //a random object is created ..
        Random rand = new Random();

        //a scanner to read input from user:
        Scanner in = new Scanner(System.in);
        System.out.println("What's your question?");

        //this string is to receive the question from user:
        String ques = in.nextLine();

        rand_answer = rand.nextInt (answer.length);
        String response = answer [rand_answer ];

        //displaying the answer to user:
        System.out.println();
        System.out.println(response);

        System.out.println();

    }


}