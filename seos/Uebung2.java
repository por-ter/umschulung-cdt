package seos;

import java.util.*;

//Übung - main ruft start auf, start bekommt 2 int-Werte über Tastatur
//und addiert diese Werte. Die main soll das Ergebnis den Addition ausgeben
//bonus gehalt

public class Uebung2 {

    public static void main(String[] args) {
        int grundGehalt = 1000;
        int erg = start(grundGehalt);
        System.out.println("Ergebnis ist: " + erg);
    }

    public static int start(int istMirEgal) {
        Scanner eing = new Scanner(System.in);

        System.out.println("Bitte geben Sie Bonus 1");
        int first = eing.nextInt();
        System.out.println("Bitte geben Sie Bonus 2");
        int second = eing.nextInt();

        int erg = first + second + istMirEgal;

        return erg;

    }
}
