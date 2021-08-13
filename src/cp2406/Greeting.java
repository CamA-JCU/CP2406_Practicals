package cp2406;

import java.util.Scanner;

public class Greeting {

    public static void main(String[] args){

        Scanner stdin = new Scanner( System.in );   // Create the Scanner.

        String name;   // The user's name.

        System.out.print("Enter your name: ");
        name = stdin.next();

        System.out.printf("Hello, %s, nice to meet you!", name.toUpperCase());


    } // end of main()
} // end of class
