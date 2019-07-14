package seos;

import java.util.*;

public class AddierenRausgeschmissen2 {
    
    public static void main(String[] args) {
        start();        
    }
    
    public static void start(){
        int elephants = 5;
        int lions = 2;
        int erg = losrechne(elephants, lions);
        
        System.out.println("Der Wert von erg = " + erg);
    }
    
    // in place of void is int (kann auch double, float, String.....
    public static int losrechne (int zahl1, int zahl2){
        int heidi = zahl1 + zahl2 +5;
        return heidi;
    }

}
