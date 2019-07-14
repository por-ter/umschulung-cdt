package seos;

import java.util.*;

public class StringAufgabe4 {
    
    public static void main(String[] args) {
        start();
    }
    
    public static void start(){
        Scanner eing=new Scanner(System.in);
        String vor=""; String emvor="";
        String nach=""; String emnach="";
        String firma=""; String emfir="";
        String email="@cdt.de";
        
        System.out.println("Bitte vorname geben");
        vor=eing.next();
        System.out.println("Bitte nachname geben");
        nach=eing.next();
        System.out.println("Bitte Firmanamen geben");
        firma=eing.next();
        
        emvor=vor.substring(0, 2);
        emnach=nach.substring(0, 4);
        
        emvor=emvor.toLowerCase();
        emnach=emnach.toLowerCase();
        firma=firma.toLowerCase();
        
        emfir=email.replace("cdt", firma);
        
        System.out.println("Deine email adresse ist: "+emvor+emnach+emfir);
    }

}
