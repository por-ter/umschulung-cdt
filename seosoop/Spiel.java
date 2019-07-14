package seosoop;

import java.util.*;

public class Spiel {

        public static void main(String[] args) {
            Scanner eingabe = new Scanner(System.in);
            String name;
            int i = 0;
            int spg1 = 0, spg2 = 0;
            int geld1 = 0, geld2 = 0, geld = 0;
            Random rd = new Random();
            System.out.println("Spieler1 geben Sie mir Ihren Namen");
            name = eingabe.next();
            Spieler sp1 = new Spieler(name);
            System.out.println("Spieler2 geben Sie mir Ihren Namen");
            name = eingabe.next();
            Spieler sp2 = new Spieler(name);
            Bank bank = new Bank();
            System.out.println("Es werden drei Runden gespielt, gewonnen hat der, "
                    + "der am Ende mehr Geld hat. Ihr Startgeld beträgt 500 Euro");
            while (i < 3) {
                geld1 = 0;
                geld2 = 0;
                System.out.println("\n"+sp1.getName() + ", wie viel Geld setzen Sie ein?");
                while (geld1 <= 0) {
                    geld1 = eingabe.nextInt();
                }
                System.out.println("Ihr Einsatz: " + geld1 + " | Ihr Guthaben: " + sp1.getGeld());
                if (geld1 > sp1.getGeld()) {
                    System.out.println("Sie haben nur noch " + sp1.getGeld());
                    geld1 = sp1.getGeld();
                    System.out.println("Ihr Einsatz wurde auf " + geld1 + " reduziert");
                }
                System.out.println(sp1.getName() + " würfelt");
                spg1 = rd.nextInt(6) + 1;
                
                System.out.println("\n"+sp2.getName() + ",wie viel Geld setzen Sie ein?");
                while (geld2 <= 0) {
                    geld2 = eingabe.nextInt();
                }
                System.out.println("Ihr Einsatz: " + geld2 + "| Ihr Guthaben: " + sp2.getGeld());
                if (geld2 > sp2.getGeld()) {
                    System.out.println("Sie haben nur noch " + sp2.getGeld());
                    geld2 = sp2.getGeld();
                    System.out.println("Ihr Einsatz wurde auf " + geld2 + " reduziert");
                }
                System.out.println(sp2.getName() + " würfelt");
                spg2 = rd.nextInt(6) + 1;               
                                
                geld = geld1 + geld2;
                if (spg1 == spg2) {
                    System.out.println("Der gesamte Einsatz von " + geld + " geht an die Bank");
                    bank.setGeld(geld);
                    sp1.setGeld(-geld1);
                    sp2.setGeld(-geld2);
                } else if (spg1 > spg2) {
                    sp1.setGeld(geld1);
                    sp2.setGeld(-geld2);
                } else {
                    sp2.setGeld(geld2);
                    sp1.setGeld(-geld1);
                }
                System.out.println("");
                System.out.println(sp1.getName()+" hat " + spg1+" gewürfelt.");
                System.out.println(sp2.getName()+" hat " + spg2+" gewürfelt.");
                if (spg1>spg2){
                System.out.format("%s hat dieses Runde gewonnen!\n",sp1.getName());
                }else{
                System.out.format("%s hat dieses Runde gewonnen!\n",sp2.getName());
                }
                System.out.println("\nAktueller Kontostand Spieler 1 " + sp1.getGeld());
                System.out.println("Aktueller Kontostand Spieler 2 " + sp2.getGeld());
                System.out.println("-------------------------------");
                if (sp1.getGeld()==0){
                    i=5;
                }else if (sp2.getGeld()==0){
                    i=5;
                }
                i++;
            }
            System.out.println(sp1.toString());
            System.out.println(sp2.toString());
            System.out.println(bank.toString());
            
            if (bank.getGeld()>geld1 || bank.getGeld()>geld2){
                System.out.println("\nYou both suck and the bank has all your "
                        + "money, you should quit gambling.");
            }else if (geld1>geld2){
                System.out.format("\nCongratulations %s, du hast gewonnen!\n",sp1.getName());
            }else{
                System.out.format("\nCongratulations %s, du hast gewonnen!\n",sp2.getName());
            }
        }
    }
