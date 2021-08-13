package cp2406;

public class DiceRoll {

    public static void main(String[] args) {
        int dieRoll1;  // The number on the first die roll.
        int dieRoll2;  // The number on the second die roll.
        int totalRoll;  // The total of both die rolls.

        dieRoll1 = (int)(Math.random()*6) + 1;
        dieRoll2 = (int)(Math.random()*6) + 1;
        totalRoll = dieRoll1 + dieRoll2;

        System.out.println("The first die comes up " + dieRoll1);
        System.out.println("The second die comes up " + dieRoll2);
        System.out.println("Your total roll is " + totalRoll);

    } // end main()
} // end class

