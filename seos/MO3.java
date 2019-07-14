package seos;

import java.util.*;

public class MO3 {
    
    public static void main(String[] args) {
        int a=42;
        int a1=addiere(a);
        System.out.println("a1: " + a1);
    }
    
    public static int addiere (int a){
        a=a*2;
        System.out.println("a --> "+a);
        return a;
    }

}
