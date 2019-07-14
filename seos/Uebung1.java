package seos;

import java.util.*;

//Übung - main ruft start auf, start bekommt 2 int-Werte über Tastatur
//und addiert diese Werte. Die main soll das Ergebnis den Addition ausgeben

public class Uebung1 {
    
    public static void main(String[] args) {
    int erg=start();
    System.out.println("Ergebnis ist: "+erg);
    }
    
    public static int start(){
    Scanner eing=new Scanner (System.in);
    
    System.out.println("Bitte geben Sie ein zahl zu rechnen");
    int first=eing.nextInt();
    System.out.println("und die nächste");
    int second=eing.nextInt();
    
    int erg=first+second;
    
    return erg;
    
    }
}
