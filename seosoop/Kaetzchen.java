package seosoop;

import java.util.*;

public class Kaetzchen {
    
    public static void main(String[] args) {
        Scanner eingabe=new Scanner(System.in);
        int anzahl=2;
        String name="";
        double gewicht=0.0;
        String aktivitaetsgrad="";
        
        Katze[] Mietz=new Katze[anzahl];
        for(int i=0; i<anzahl; i++){
            System.out.println("Bitte geben Sie den Namen ein.");
            name=eingabe.nextLine();
            
            System.out.println("Bitte geben Sie das Gewicht ein.");
            gewicht=eingabe.nextDouble();
            eingabe.nextLine();
            
            System.out.println("Wenn die Katze faul ist, geben Sie faul ein,"
                        + " wenn nicht bestätigen Sie einfach mit Enter.");
            aktivitaetsgrad=eingabe.nextLine();
            if (aktivitaetsgrad.length()>0){
                // zahlen[i]=4711; <-- before
                Mietz[i]=new Katze(name, gewicht, aktivitaetsgrad);
            }else{
                Mietz[i]=new Katze(name, gewicht);
            }
        }
        for(int i=0; i<anzahl; i++){
            //System.out.println(Mietz[i].getName()+""+Mietz[i].getGewicht());
            System.out.println(Mietz[i].toString());
        }
        
        System.out.println("******Fressen oder Spielen*******");
        System.out.println("Welches Kätzchen?");
        name=eingabe.nextLine();
        // hier verkürzte Fassung - real Suchroutine, um zu Ermitteln an welche
        // Indexposition Ronja bzw. Luna gespeichert ist.
        int j=0;
        if (name.equalsIgnoreCase("Ronja")){
            ;
        }else if(name.equalsIgnoreCase("Luna")){
            j=1;
        }else{
            System.err.println("Fremde Katzen haben hier nichts zu suchen");
            System.exit(0);
        }
        System.out.println("Soll "+name+" fressen (1) oder spielen(2)?");
        int wahl=eingabe.nextInt();
        Mietz[j].setGewicht(wahl);
        
        System.out.println(Mietz[j].toString());
    }
}
