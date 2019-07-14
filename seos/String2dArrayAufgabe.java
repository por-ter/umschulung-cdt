package seos;

import java.util.*;

public class String2dArrayAufgabe {
    
    public static void main(String[] args) {
        int [][] aufg={{5,4,3,2,1},{1,2,3},{6,5,4,3,2,1}};
        
        int sum=0, ges=0;
        
        for (int a=0; a<aufg.length; a++){
            for (int b=0; b<aufg[a].length; b++){
                sum += aufg[a][b];
                System.out.print(aufg[a][b]);
                System.out.println(". Zwischensumme: "+sum);
                
        }
            ges += sum;
            System.out.println("Zeilen summe:"+sum);
            System.out.println("");
    }
        System.out.println("Gesammt summe: "+ges);
    }

}
