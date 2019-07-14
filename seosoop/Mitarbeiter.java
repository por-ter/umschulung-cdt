package seosoop;

import java.util.*;

public class Mitarbeiter extends Person {
    private double gehalt;
    private String abteilung;
    
    public Mitarbeiter(String vorname, String name, String adresse,
            double gehalt, String abteilung){
        super(vorname, name, adresse);
        this.gehalt=gehalt;
        this.abteilung=abteilung;
    }
    
    @Override
    public String toString(){
        String pDaten=super.toString();
        return String.format("%s, Verdienst: %.2f Abteilung: %s", pDaten,
                gehalt,abteilung);
    }
}
