package seosoop;

public class Lkw extends Fahrzeug {

    private int ladeflaecheInPaletten;
    private String art;

    public Lkw(int bjAusAnwendung, int psAusAnwendung, String markeAusAnwendung,
                int tankAusAnwendung, int ladefaecheAusAnwendung, String artAusAnwendung) {
        super(bjAusAnwendung, psAusAnwendung, markeAusAnwendung, tankAusAnwendung);
        this.ladeflaecheInPaletten = ladefaecheAusAnwendung;
        this.art = artAusAnwendung;
    }
    
    @Override
    public String toString(){
        String pDaten = super.toString();
        return String.format("%s,Ladeflaeche: %d Art: %s ",pDaten,
                ladeflaecheInPaletten,art);
    }

}
