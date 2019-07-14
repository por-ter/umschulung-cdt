package seos;

import java.util.*;

public class Aufgabe7 {

    public static void main(String[] args) {
        int[] zahlen = {2, 8, 4, 6, 23, 17};

        System.out.println("Bitte gesuchte Zahl eingeben");
        search(zahlen);
    }

    public static void search(int[] array) {
        Scanner eing = new Scanner(System.in);

        int such = eing.nextInt();
        
        int i=0;        
        while(i<array.length && such!=array[i]){
            i++;
        }
        output(array, i, such);
    }

    public static void output(int [] bob, int i, int such) {
        if (i<bob.length) {
                System.out.println("Congrats, you found the number "
                                    +such+" on index pos: " + i);
            }else{
                System.out.println("Leider, die "+such+" ist nicht gefunden");
        }                
    }
}
