package seosoop;

import java.util.*;

public class Haus {

    int breite = 25;
    int hoehe = 3;
    int tiefe = 10;
    String farbe = "schwarz";

    public Haus(int b, int h, int t, String f) {
        breite = b;
        hoehe = h;
        tiefe = t;
        farbe = f;

    }
    // hier wird ein zweite konstrukor geben
    public Haus(int b, int h, int t){
        breite=b;
        hoehe=h;
        tiefe=t;
        farbe="grün";
    }
    
    public Haus(){
        
    }
    
    @Override
    public String toString(){
        return
        String.format("Breite:\t%d\tHöhe:\t%d\tTiefe:\t%d\tFarbe:\t%s", breite,
                hoehe, tiefe, farbe);
    }

}
