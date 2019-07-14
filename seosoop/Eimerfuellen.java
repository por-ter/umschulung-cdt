package seosoop;

import java.util.*;

public class Eimerfuellen {
    
    public static void main(String[] args) {
        
        Scanner eingabe = new Scanner (System.in);
        int wahl;
        int i =0;
        int zahl = 0;
        Eimer bucket = new Eimer();
        Random rd = new Random();
        
        System.out.println("Sie sollen einen Eimer mit 50 Liter Fassungsvermögen "
                + "möglichst voll bekommen");
        System.out.println("Sie können ihn füllen und auch etwas abschöpfen");
        System.out.println("Sie haben 5 Aktionen um den Eimer möglichst voll zu bekommen,\n"
                + "überlaufen darf er aber nicht");
        System.out.println("Sie müssen alle 5 Aktionen durchführen.");
        System.out.println("Es können nur ganze Liter hinzugefügt und entnommen werden");
        System.out.println("*************************");
        
        while (i<5){
            zahl=0;
            wahl=0;
            System.out.println("Füllen(1) oder abschöpfen(2)?");
            while (wahl !=1 && wahl!=2){
                wahl = eingabe.nextInt();
            }
            System.out.println("Bitte geben Sie eine Zahl zwischen 1 und 25 ein");
            while (zahl<=0 || zahl>25){
                zahl=eingabe.nextInt();
            }
            zahl=rd.nextInt(zahl)+1;
            System.out.println("Sie haben "+zahl+" Liter erwürfelt");
            
            if (wahl==1){
                bucket.setLiter(zahl);
            }
            if (wahl==2){
                bucket.setLiter(-zahl);
            }
            i++;
            System.out.println(bucket.toString());
            if (bucket.getLiter()>50){
                i=5;
                System.out.println("Ihr Eimer ist gerade übergelaufene - leider vorloren");
            }
        }
        
    }

}
