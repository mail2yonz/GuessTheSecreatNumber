/*
 Yonatan Mengesha
 october 11
 Guessing a secreat number
 */




package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Creating a random number
        Random random= new Random();

        int randNumber =1 + random.nextInt (10);
        //Creating a scanner object
        Scanner scan= new Scanner (System.in);
        String var;

      //do while loop to ask the user for a yes or no question
        do{
            System.out.println ("Enter a number:" );

            int number= scan.nextInt ();

           //if the Guessed number is less than,greater than or equal to the number the random number
            if(number<randNumber)

            {
                var="You guessed too low" ;
            }else if(number>randNumber)
            {
                 var="You guessed too high" ;
            } else{
                var ="You guessed it Right";
            }


            System.out.println ( var +",Try again?(yes/No)");

        }while(scan.next().equalsIgnoreCase ( "yes" ));
    }
}



















/*


import java.util.Random;
import java.util.Scanner;

//This code guesses a random number and lets you know if your guess is equal or not
public class RandomGuessing {
    public static void main(String[] args)
    {
        Random rand= new Random();

        int randInt =1+ rand.nextInt (100);
        System.out.println(randInt);



        Scanner scan = new Scanner (System.in);

         do  {

             output("Guess a number between 1 and a 100:");
             int guessedNum= scan.nextInt ();




               if( randInt>guessedNum) {
                   output("The number is Too low,Do you want to try again yes/no");
               } else if (randInt< guessedNum)
               {
                   output ( "The number is Too high,Do you want to try again yes/no" );

               } else if(randInt==guessedNum)
               {
                   output ( "Guessed Right!" );
                    break;
               }

             output("Do you want to continue Yes or No");



           }while (scan.next().equalsIgnoreCase("yes"));



    }
    private static void output(String outString)
    {
         System.out.println(outString);
    }
}
 */