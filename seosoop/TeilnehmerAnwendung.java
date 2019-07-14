package seosoop;

import java.util.*;

public class TeilnehmerAnwendung {

    public static void main(String[] args) {
        Scanner eing = new Scanner(System.in);
        int punkte = 0;
        int anzahl=5;
        String name = "";     
        
        //-----------------------------------------------------------------
        Teilnehmer t1 = new Teilnehmer(name, punkte);

        System.out.println("Namen geben");
        t1.setName(eing.nextLine());
        System.out.println("Punkte geben");
        t1.setErgebnis(eing.nextInt());

        t1.getName();
        t1.getErgebnis();
        t1.getNote();        
        
        //-----------------------------------------------------------------
        Teilnehmer[] klasse = new Teilnehmer[anzahl];
        eing.nextLine();
        
        for (int i = 0; i < anzahl; i++){
            System.out.println("Namen geben");
            name=eing.nextLine();
            System.out.println("Punkte geben");
            punkte=eing.nextInt();            
            klasse[i] = new Teilnehmer (name, punkte);
            eing.nextLine();
        }
        
        for (int i = 0; i < anzahl; i++) {
            klasse[i].getName();
            klasse[i].getErgebnis();
            klasse[i].getNote();
            System.out.println(klasse[i].toString() + klasse[i].getNote());
        }
        System.out.println("");
        
        //----------------------------------------------------------------
        Teilnehmer[] gruppe = new Teilnehmer[anzahl];
        
        gruppe[0] = new Teilnehmer ("Billy Bob", 99);
        gruppe[1] = new Teilnehmer ("Terry Tim", 44);
        gruppe[2] = new Teilnehmer ("Davey Don", 55);
        gruppe[3] = new Teilnehmer ("Stewy Sid", 76);
        gruppe[4] = new Teilnehmer ("Robby Rob", 88);
        
        for (int i = 0; i < anzahl; i++) {
            gruppe[i].getName();
            gruppe[i].getErgebnis();
            gruppe[i].getNote();
            System.out.println(gruppe[i].toString() + gruppe[i].getNote());
        }
        
        System.out.println("");        
        System.out.println(t1.toString() + t1.getNote());      
    }
}
