package seosoop;

public class Pkw extends Fahrzeug{

    private int kofferraumgroesse;

    public Pkw(int bjAusAnwendung, int psAusAnwendung, String markeAusAnwendung,
            int tankAusAnwendung, int KofferraumgroesseAusAnwendung) {
        super(bjAusAnwendung, psAusAnwendung, markeAusAnwendung, tankAusAnwendung);
        this.kofferraumgroesse = KofferraumgroesseAusAnwendung;
    }

    @Override
    public String toString(){
        String pDaten = super.toString();
        return String.format("%s,Kofferraumgröße: %d ", pDaten, kofferraumgroesse);
    }

}
