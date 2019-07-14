package seos;

import java.util.*;

public class Aufgabe8Grundurlaub {
    
    public static void main(String[] args) {
        grundUrlaub();
    }
    
    public static void grundUrlaub(){
        int gru=30, st1=3, st2=5, st3=7, st4=10;
        
        Scanner eing=new Scanner(System.in);
        
        System.out.println("Wie alt bist du denn???");
        System.out.println("1\tab 55");
        System.out.println("2\tab 57");
        System.out.println("3\tab 60");
        System.out.println("4\tab 65");
        int alter=eing.nextInt();
        
        switch(alter){
            case 1:
                System.out.println("Du bekommst "+(gru+st1)+ " urlaub Tagen.");
                break;
                
            case 2:
                System.out.println("Du bekommst "+(gru+st2)+ " urlaub Tagen.");
                break;
                
            case 3:
                System.out.println("Du bekommst "+(gru+st3)+ " urlaub Tagen.");
                break;
                
            default:
                System.out.println("Du bekommst "+(gru+st4)+ " urlaub Tagen.");
                
        }
        
    }

}
