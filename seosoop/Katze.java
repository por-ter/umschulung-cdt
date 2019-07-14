package seosoop;

import java.util.*;

public class Katze {
    private String name; // default null
    private double gewicht; // default 0.0
    private String aktivitaetsgrad; // default null
    
    public Katze(String name, double gewicht){
        this.name=name;
        this.gewicht=gewicht;
        this.aktivitaetsgrad="unbekannt";
    }
    
    public Katze(String name, double gewicht, String aktivitaetsgrad){
        this(name, gewicht);
        this.aktivitaetsgrad=aktivitaetsgrad;
    }

    public void setGewicht(int wahl) {
        if (wahl==1){
            this.gewicht=this.gewicht+300;
        }else{
            this.gewicht=this.gewicht-200;
        }
    }
    
    @Override
    public String toString(){
        return String.format("Name der Katze: %s, Gewicht: %.2f, "
                + "Aktivitätsgrad: %s", this.name, this.gewicht, this.aktivitaetsgrad);
    }
    
}
