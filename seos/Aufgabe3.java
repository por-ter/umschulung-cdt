package seos;

import java.util.*;

public class Aufgabe3 {
    
    public static void main(String[] args) {
        meinKlasse();
        System.out.println("**********************");
    }
    
    public static void hallo(){
        System.out.print("Hallo ");
    }
    
    public static void meinKlasse(){
        Scanner eing=new Scanner(System.in);
        
        System.out.println("Bitte Klassenname eingeben");
        String klasse=eing.nextLine();
        hallo();
        System.out.println(klasse);
    }

}
