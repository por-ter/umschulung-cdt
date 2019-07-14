package seos;

import java.util.*;

public class Schlagzeilgenerator {
    
    public static void main(String[] args) {
        
        start();
        
    }
    
    public static void start(){
        System.out.println("Schlagzeilgenerator");
        System.out.println("Welches soll das erste Wort sein? 1-4");
        Scanner eing=new Scanner(System.in);
        int nummer1=eing.nextInt();
        String wort1=wort1(nummer1);
        //System.out.println("Das erste Wort lautet: "+wort1);
        
        System.out.println("Welches soll das zweite Wort sein? 1-4");
        int nummer2=eing.nextInt();
        String wort2=wort2(nummer2);
        //System.out.println("Das zweite Wort lautet: "+wort2);
        
        System.out.println("Welches soll das dritte Wort sein? 1-4");
        int nummer3=eing.nextInt();
        String wort3=wort3(nummer3);
        //System.out.println("Das dritte Wort lautet: "+wort3);
        
        System.out.println("Welches soll das vierte Wort sein? 1-4");
        int nummer4=eing.nextInt();
        String wort4=wort4(nummer4);
        //System.out.println("Das vierte Wort lautet: "+wort4);
        
        System.out.println("\nIhre Schlagzeile des Tages lautet: "
                            +wort1+wort2+wort3+wort4);
    }
    
    public static String wort1(int nummer1){
        String word1=" ";
        
        switch(nummer1){
                case 1: 
                    word1="Ugly ";
                    break;
                    
                case 2:
                    word1="Rancid ";
                    break;
                    
                case 3:
                    word1="Dumb ";
                    break;
                    
                default:
                    word1="Wanker ";
        }
        
        return word1;
                    
    }
    
    public static String wort2(int nummer2){
        String word2=" ";
        
        switch(nummer2){
                case 1: 
                    word2="Thersa May ";
                    break;
                    
                case 2:
                    word2="David Cameron ";
                    break;
                    
                case 3:
                    word2="Recep Tayyip Erdoğan ";
                    break;
                    
                default:
                    word2="Donald Trump ";
        }
        
        return word2;
    }
    
    public static String wort3(int nummer3){
        String word3=" ";
        
        switch(nummer3){
                case 1: 
                    word3="fucked ";
                    break;
                    
                case 2:
                    word3="blew ";
                    break;
                    
                case 3:
                    word3="got fucked by ";
                    break;
                    
                default:
                    word3="made out with ";
        }
        
        return word3;
    }
    
    public static String wort4(int nummer4){
        String word4=" ";
        
        switch(nummer4){
                case 1: 
                    word4="a goat.";
                    break;
                    
                case 2:
                    word4="a cow.";
                    break;
                    
                case 3:
                    word4="a pig.";
                    break;
                    
                default:
                    word4="a donkey.";
        }
        
        return word4;
    }
    

}
