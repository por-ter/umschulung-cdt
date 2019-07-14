package seos;

import java.util.*;

public class StringArray2d {
    
    public static void main(String[] args) {
        erzeuge();
    }
    
    public static void erzeuge(){
        String[][] name=new String[10][5];
        
        for(int i=0; i<name.length; i++){
            for(int j=0; j<name[i].length; j++){
                name[i][j]=" | PORTER | ";
                System.out.print(name[i][j]);
            }
            System.out.println("");
        }
    }
}
