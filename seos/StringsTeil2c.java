package seos;

import java.util.*;

public class StringsTeil2c {
    
    public static void main(String[] args) {
        String name = "Grigori Jefimowitsch Rasputin";
        System.out.println("Der String hat den Inhalt: "+name);
        String spruch = "Das Leben ist ein Kampf, siege";
        
        System.out.println("");
        
        System.out.println("Welcher Buchstabe befindet sich an der 2. Stelle"
                + "(Zählung beginnt bei 0)");
        char erg=name.charAt(2);
        System.out.println(erg);
        System.out.println("\n**************************");
        
        erg=name.charAt(name.length()-5);
        System.out.println(erg);
        System.out.println("\n**************************");
        
        for (int i=0; i<name.length(); i++){
            erg=name.charAt(i);
            System.out.println(erg);
        }
        System.out.println("\n*****************************");
        
        int position=name.indexOf("R");
        System.out.println(position);
        System.out.println("\n*****************************");
        
        int leerzeichen1=name.indexOf(" ");
        System.out.println(leerzeichen1);
        System.out.println("\n*****************************");
        
        int leerzeichen2=name.indexOf(" ", 8);
        System.out.println(leerzeichen2);
        System.out.println("\n*****************************");
        
        int leerzeichenDas2=name.indexOf(" ", name.indexOf(" ")+1);
        System.out.println("Das 2. Leerzeichen ist an Pos: "+leerzeichenDas2);
        System.out.println("\n*****************************");
        
        char erg3=name.charAt(name.indexOf(" ", name.indexOf(" "+1)+1));
        System.out.println(erg3);
        
    }

}
