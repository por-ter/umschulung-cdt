package seos;

import java.util.*;

public class Aufgabe4 {
    
    public static void main(String[] args) {
        start();
        System.out.println("*************************");
    }
    
    public static void start(){
        Scanner eing=new Scanner(System.in);
        
        System.out.println("Bitte Namen geben");
        String name=eing.nextLine();
        begruessung();
        System.out.println(name);
    }
    
    public static void begruessung(){
        Scanner eing=new Scanner(System.in);
        
        System.out.println("Bitte wählen Sie eine begrüssung aus");
        String greeting=eing.nextLine();
        System.out.print(greeting+" ");
    }

}
