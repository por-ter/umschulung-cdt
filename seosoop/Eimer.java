package seosoop;

public class Eimer {
    
    private String farbe="black"; // default null
    private int fuellmenge;
    // int fuellmenge=0; 0 ist default also bitte weglassen
    
    public int getLiter(){
        return fuellmenge;
    }
    
    public void setLiter(int liter){
        this.fuellmenge = this.fuellmenge+liter;
    }
    
    public String toString(){
        return String.format("Eimerfüllung des %s Eimers: %d", farbe, this.fuellmenge);
                         // statt - "Eimerfüllung des "+farbe+" Eimers: %d", this.fuellmenge);
    }

}
