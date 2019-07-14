package seos;

import java.util.*;

public class MO {
    
    public static void main(String[] args) {
        MO b1 = new MO();
        b1.addiere(42,23);
    }
    
    public void addiere (int x, int y){
        int c = x+y;
        System.out.println("Die Addition von "+x+" und "+y+" ergibt "+c);
    }

}
