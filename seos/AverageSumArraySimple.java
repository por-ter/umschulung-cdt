package seos;

import java.util.*;

public class AverageSumArraySimple {
    
    public static void main(String[] args) {
        int[] array={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        
        double summe=0;
        for (int i=0; i<array.length; i++){
            summe += array[i]; 
        }
        summe  /= array.length;
        System.out.println(summe);
    }

}
