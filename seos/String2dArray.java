package seos;

import java.util.*;

public class String2dArray {

    public static void main(String[] args) {
        erzeuge();
    }

    public static void erzeuge() {
        String spalte = "-ö|ö-";
        int a=0, b=0;
        String[][] array=new String[10][5];
        
        for(a=0; a<array.length;a++){
            for(b=0; b<array[a].length; b++){
                array[a][b]=spalte;
                System.out.print(array[a][b]);
            }
            System.out.println("");
        }
    }
}
