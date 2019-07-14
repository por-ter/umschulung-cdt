package moviegame;

import java.util.ArrayList;
import java.util.Scanner;

public class Player {
    
    private String name;
    private int highScore;
    
    public Player(String name){
        this.name = name;
    }
    
    public Player(String name, int highScore){
        this.name = name;
        this.highScore = highScore;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHighScore() {
        return highScore;
    }

    public void setHighScore(int highScore) {
        this.highScore = highScore;
    }
    
    public static void playerCreation(String name){
        Scanner eing = new Scanner(System.in);
        System.out.println("Please enter your name: ");
        Player playerName = new Player(eing.nextLine());        
        System.out.println();
        System.out.println("Thank you, "+name+", we will use this name to record"
                + " your high-scores when you more as once play!\nThanks and good luck!\n");      
    }
    
    @Override
    public String toString(){
        return String.format("Name: %s\nScore: %d", name, highScore);
    }

}
