package cp2406;

import java.util.Scanner;

public class EggCounter {

    public static void main(String[] args){

        Scanner stdin = new Scanner( System.in );   // create new Scanner

        int numberOfEggs;   // The number of eggs.
        int dozens;         // The number of dozens.
        int leftOvers;      // The nubmer of eggs left over.

        System.out.print("How many eggs do you have: ");
        numberOfEggs = stdin.nextInt();

        dozens = numberOfEggs / 12;
        leftOvers = numberOfEggs % 12;

        System.out.printf("You have %d dozens, with %d eggs left over.", dozens, leftOvers);


    }   // end of main()
}   // end of class
