package seos;

import java.util.*;

public class SwitchCaseBsp {
    
    public static void main(String[] args) {
        System.out.println("Bitte treffen Sie Ihre Wahl");
        int wahl = 0;
        Scanner eingabe = new Scanner(System.in);
        System.out.println("1\tKonto anlegen");
        System.out.println("2\tKonto anzeigen");
        System.out.println("3\tEinzahlung");
        System.out.println("4\tAuszahlung");
        System.out.println("0\tEnde");
        wahl = eingabe.nextInt();
       switch (wahl) { // if(wahl==1)
            case 1:
                System.out.println("Konto anlegen");
                break;
            case 2:
                System.out.println("Konto anzeigen");
                break;
            case 3:
                System.out.println("Einzahlung");
                break;
            case 4:
                System.out.println("Auszahlung");
                break;
            default:
                System.out.println("Auf Wiedersehen!");
        }

    }

}