package seos;

import java.util.*;

public class MethodBeispiel1 {
    
    public static void main(String[] args) {
        
        System.out.println("Ich bin die main");
        start();        
        System.out.println("wieder in der main");
        
        
    }
    public static void start(){
        
        System.out.println("Ich bin start");
        eingabe();
        
    }
    
    public static void eingabe(){
        Scanner eing=new Scanner(System.in);
        String sagWas;
        System.out.println("\nType something");
        sagWas=eing.nextLine();
        System.out.println("\nYou typed: " + sagWas + "\n");
    }

}
