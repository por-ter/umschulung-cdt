package seos;

import java.util.*;

public class AddierenRausgeschmissen {
    
    public static void main(String[] args) {
        start();        
    }
    
    public static void start(){
        int a=5;
        int b=2;
        addiere(a,b);
    }
    
    private static void addiere (int zahl1, int zahl2){
        int c = zahl1+zahl2;
        System.out.println("Ergebnis aus "+zahl1 +" + "+zahl2+" = "+c);
    }

}
