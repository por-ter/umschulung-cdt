package seos;

import java.util.*;

public class Aufgabe6 {
    
    public static void main(String[] args) {
        int [] gewinne={1000,20,300,160};
        gewinnErmittlung(gewinne);
    }
    
    public static void gewinnErmittlung(int[] array){
        int summe=0;
        for (int x: array)
            summe += x;
        
        double schnitt = summe / array.length;
        
        System.out.println("Gesamtgewinn: "+summe+
                "\nDurchschnittlichen Gewinn: "+schnitt);
    }

}
