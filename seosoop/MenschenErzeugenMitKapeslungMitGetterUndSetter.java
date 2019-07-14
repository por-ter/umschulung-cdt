package seosoop;

import java.util.*;

public class MenschenErzeugenMitKapeslungMitGetterUndSetter {

    public static void main(String[] args) {
        String geschlecht;
        String nachname;
        String vorname;
        int lebensalter;
        String hobby;
        Scanner eingabe = new Scanner(System.in);
        System.out.println("Bitte geben Sie das Geschlecht der Person ein");
        geschlecht = eingabe.next();
        System.out.println("Bitte geben Sie den Nachnamen der Person ein");
        nachname = eingabe.next();
        System.out.println("Bitte geben Sie den Vornamen der Person ein");
        vorname = eingabe.next();
        System.out.println("Bitte geben Sie das Lebensalter der Person ein");
        lebensalter = eingabe.nextInt();
        System.out.println("Bitte geben Sie das Hobby der Person ein");
        hobby = eingabe.next();
        MenschMitKontrolleErzeugen M1 = new MenschMitKontrolleErzeugen(geschlecht, nachname, vorname, lebensalter, hobby);
        System.out.println("Der erste Mensch heißt " + M1.vorname + " " + M1.nachname);
        System.out.println("Geschlecht: " + M1.getGeschlecht() + " Alter: " + M1.getLebensalter() + " Jahre.");
        System.out.println("Hobby: "+M1.getHobby());
    }
}
