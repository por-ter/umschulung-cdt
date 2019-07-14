package seos;

import java.util.*;

public class StringAufgabe1 {
    
    public static void main(String[] args) {
        start();
    }
    
    public static void start(){
        Scanner eing=new Scanner(System.in);
        String wort1="";
        String wort2="";
        
        System.out.println("Bitte ein wort geben");
        wort1=eing.next();
        System.out.println("Bitte die zweite wort geben");
        wort2=eing.next();
        
        int a = wort1.length();
        int b = wort2.length();
        
        if(a>b){
            System.out.println("Dein erstes wort, "+wort1+", hat mehrere letters,"
                    + " es enthält "+a+" letters. Dein zweite hat nur "+b);
        }else{
            System.out.println("Dein zweite wort, "+wort2+", hat mehrere letters,"
                    + " es enthält "+b+" letters. Dein zweite hat nur "+a);            
        }        
    }
}
