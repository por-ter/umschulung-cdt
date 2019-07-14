package seos;

import java.util.*;

public class Augabe10 {

    
//    Ihre Aufgabe ist es aus den Angaben: hoehe, breite und tiefe das Volumen zu berechnen
//    (Sie multiplizieren einfach hoehe*breite*tiefe)
//    Die Daten zu hoehe, beite und tiefe muessen in der Methode start bleiben
//    In der Methode volumen soll die Berechnung des Volumens erfolgen
//    In der Methode start soll der Volumenwert ausgegeben werden
//    Ergänzen Sie bitte nachstehenden Code entsprechend - Danke :)
    
    public static void main(String[] args) {
        start();
    }

    public static void start() {
        int hoehe = 2;
        int breite = 3;
        int tiefe = 5;
        System.out.println("Hoehe: " + hoehe + " Breite; " + breite + " Tiefe: " + tiefe);
        System.out.println("Volume: "+volumen(hoehe, breite, tiefe));
    }

    public static int volumen(int hoehe, int breite, int tiefe) {
        int erg=hoehe*breite*tiefe;
        return erg;
    }

}
