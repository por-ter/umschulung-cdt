package practiceexercises;

import java.util.Random;

public class Dice {
    
    public static int rollDice4() {
        Random die = new Random();
        int roll;
        roll = die.nextInt(4) + 1;

        return roll;

    }

    public static int rollDice6() {
        Random die = new Random();
        int roll;
        roll = die.nextInt(6) + 1;

        return roll;

    }
    
    public static int rollDice8() {
        Random die = new Random();
        int roll;
        roll = die.nextInt(8) + 1;

        return roll;

    }
    
    public static int rollDice10() {
        Random die = new Random();
        int roll;
        roll = die.nextInt(10) + 1;

        return roll;

    }
    
    public static int rollDice12() {
        Random die = new Random();
        int roll;
        roll = die.nextInt(12) + 1;

        return roll;

    }
    
    public static int rollDice20() {
        Random die = new Random();
        int roll;
        roll = die.nextInt(20) + 1;

        return roll;

    }

}
