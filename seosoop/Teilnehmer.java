package seosoop;

public class Teilnehmer {

    private String name;
    private int ergebnis;

    public Teilnehmer(String name, int ergebnis) {
        setName(name);
        setErgebnis(ergebnis);
    }

    public Teilnehmer(String name) {
        setName(name); //oder: this(name, -1);
        setErgebnis(-1);
    }

    public void setName(String name) {
        if (name.length() == 0) {
            name = "Unbekannt";
        }
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setErgebnis(int ergebnis) {
        if (ergebnis != -1) { // Kennzeichen für fehlendes Ergebnis
            if (ergebnis < 0) {
                ergebnis = 0;
            } else if (ergebnis > 100) {
                ergebnis = 100;
            }
        }
        this.ergebnis = ergebnis;
    }

    public int getErgebnis() {
        return ergebnis;
    }

    public String getNote() {
        String note;
        if (ergebnis == -1) {
            note = "Liegt noch nicht vor";
        } else if (ergebnis >= 88) {
            note = "Sehr gut";
        } else if (ergebnis >= 75) {
            note = "Gut";
        } else if (ergebnis >= 63) {
            note = "Befriedigend";
        } else if (ergebnis >= 51) {
            note = "Ausreichend";
        } else {
            note = "Mangelhaft";
        }
        return note;
    }
    
    @Override
    public String toString(){
        return String.format("Name: %1$-20s  Punkte: %2$3d \tNote:\t",this.name, this.ergebnis);
    }
}
