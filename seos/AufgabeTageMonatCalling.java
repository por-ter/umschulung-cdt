package seos;

import java.util.*;

public class AufgabeTageMonatCalling {
    
    public static void main(String[] args) {
        start();
    }
    
    public static void start(){
        Scanner eing=new Scanner(System.in);
        int monat, jahr, ca=0;
        
        System.out.print("Monat: ");
        monat=eing.nextInt();
        System.out.print("Jahr: ");
        jahr=eing.nextInt();
        int schalt=SchaltBerech.schalt(jahr);
        
        if(monat == 1 || monat == 3 || monat == 5 || monat == 7 || monat == 8 
           || monat == 10 || monat == 12){
            ca=1;
            
        }else if(monat == 4 || monat == 6 || monat == 9 || monat == 11){
            ca=2;
            
        }else if(monat == 2 && schalt==0){
            ca=3;
        }else{
            ca=4;
        }
        
        switch(ca){
            case 1:
                System.out.println("31");
                break;
                
            case 2:
                System.out.println("30");
                break;
                
            case 3:
                System.out.println("29");
                break;
                
            default:
                System.out.println("28");
        }
    }

}
