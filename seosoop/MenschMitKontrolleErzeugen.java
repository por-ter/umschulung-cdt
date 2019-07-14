package seosoop;

import java.util.*;

public class MenschMitKontrolleErzeugen {
    
    public MenschMitKontrolleErzeugen(String g, String n, String v, int l, String h){
        geschlecht = g;
        nachname = n;
        vorname = v;
        lebensalter = l;
        hobby = h;
    }
    
    // geschlecht    
    private String geschlecht;
    
    public String getGeschlecht(){
        return geschlecht;
    }
    
    public void setGeschlecht(String geschlecht){
        this.geschlecht = this.geschlecht+geschlecht;
    }
    
    // nachname    
    public String nachname;
    
    // vorname    
    public String vorname;
    
    // lebensalter    
    private int lebensalter;
    
    public int getLebensalter(){
        return lebensalter;
    }
    
    public void setLebensalter(int lebensalter){
        this.lebensalter = this.lebensalter+lebensalter;
    }
    
    // hobby    
    private String hobby;
    
    public String getHobby(){
        return hobby;
    }
    
    public void setHobby(String hobby){
        this.hobby = this.hobby+hobby;
    }  
        
}
