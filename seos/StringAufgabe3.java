package seos;

import java.util.*;

public class StringAufgabe3 {
    
    public static void main(String[] args) {
        start();
    }
    
    public static void start(){
        String s1="Raub";
        String s2="Hans";
        
        String one=s1.replaceFirst("R", "L");
        String two=s1.replaceFirst("R", "T");
        String thr=s1.replace("b", "m");
        
        System.out.println("Aus "+s1+" wird "+one+", "+two+", "+thr+".");
        System.out.println("s2 hat den Inhalt: "+s2);
        
        String h1=s2.replaceFirst("H","G");
        System.out.println("Aus "+s2+" wurde nun "+h1);
        System.out.println("s2 hat noch immer den Inhalt: "+s2);
        
        String s4=s2.replace("s","t");
        System.out.println("Zwischenschritt, h4 hat den Inhalt: "+s4);
        
        s4=s4.replace("n","s");
        System.out.println("s4 hat den Inhalt: "+s4);
        String s5=s4.replaceFirst("H","R");
        s5=s5.replace("n","s");
        System.out.println("s5 hat den Inhalt: "+s5);
        
        System.out.println("Alle Inhalte: s1 "+s1+" s2 "+s2+" s3 "+h1+" s4 "
                            +s4+" s5 "+s5);
        
        
    }

}
