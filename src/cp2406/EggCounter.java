package cp2406;

import java.util.Scanner;

public class EggCounter {

    public static void main(String[] args){

        Scanner stdin = new Scanner( System.in );   // create new Scanner

        int numberOfEggs;   // The number of eggs.
        int gross;          // The number of gross.
        int dozens;         // The number of dozens.
        int leftOvers;      // The number of eggs left over.

        System.out.print("How many eggs do you have: ");
        numberOfEggs = stdin.nextInt();

        gross = numberOfEggs / 144;
        dozens = (numberOfEggs % 144) / 12;
        leftOvers = (numberOfEggs % 144) % 12;

        System.out.printf(""" 
    Your number of eggs is %d gross, %d dozens, and %d.""",
                gross, dozens, leftOvers);

    }   // end of main()
}   // end of class
