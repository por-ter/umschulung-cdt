package practiceexercises;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class DiceSimulator {
    
    public int rollDice(int roll){
        Random die = new Random();
        
        roll = die.nextInt(6)+1;
        
        return roll;
        
    }

    public static void main(String[] args) {
        Random die = new Random();
        ArrayList<Integer> diceRolls = new ArrayList<>();

        int tmp;
        int count = 0;                
        while(count < 3000){
            tmp = die.nextInt(6)+1;
            diceRolls.add(tmp);
            
            count++;
        }              
        count = 0;
        
        int[] rollCounter;
        rollCounter = new int[6];

        rollCounter[0] = 0; rollCounter[1] = 0; rollCounter[2] = 0;
        rollCounter[3] = 0; rollCounter[4] = 0; rollCounter[5] = 0;
        
        while(count < diceRolls.size()){
            
            switch(diceRolls.get(count)){
                case 1:
                    rollCounter[0]++;
                    break;
                    
                case 2:
                    rollCounter[1]++;
                    break;
                    
                case 3:
                    rollCounter[2]++;
                    break;
                    
                case 4:
                    rollCounter[3]++;
                    break;
                    
                case 5:
                    rollCounter[4]++;
                    break;
                    
                case 6:
                    rollCounter[5]++;
                    break;
            }            
            count++;
        }
        
        System.out.println("1 = " + rollCounter[0] + " times rolled");
        System.out.println("2 = " + rollCounter[1] + " times rolled");
        System.out.println("3 = " + rollCounter[2] + " times rolled");
        System.out.println("4 = " + rollCounter[3] + " times rolled");
        System.out.println("5 = " + rollCounter[4] + " times rolled");
        System.out.println("6 = " + rollCounter[5] + " times rolled");
        
        int asd = rollCounter[0] + rollCounter[1] + rollCounter[2] + rollCounter[3] + rollCounter[4] + rollCounter[5];
        
        System.out.println("\n\nTotal: " + asd);
        
    }

}
