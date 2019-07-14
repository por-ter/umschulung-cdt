package seosoop;

import java.util.*;

public class MenschErzeugen {
    
    public static void main(String[] args) {
        Scanner eing=new Scanner(System.in);     
        
        // Mensch 1
        Mensch m1=new Mensch();        
        System.out.println("Geben Sie bitte Ihre...");
        System.out.println("Nachname:");
        m1.nname=eing.nextLine();
        System.out.println("Vorname:");
        m1.vname=eing.nextLine();
        System.out.println("Geschlecht:");
        m1.geschlecht=eing.next();
        System.out.println("Alter:");
        m1.alter=eing.nextInt();
        
        // Mensch 2
        Mensch m2=new Mensch();
        m2.nname="Lawrence";
        m2.vname="Jennifer";
        m2.geschlecht="Weiblich";
        m2.alter=28;        
        
        // Mensch 3
        Mensch m3=new Mensch("Grohl","Dave","Männlich", 50);    
        
        // Mensch 4
        Mensch m4=new Mensch();
        
        System.out.println(m1);
        System.out.println(m2);
        System.out.println(m3);
        System.out.println(m4);
        
    }

}
