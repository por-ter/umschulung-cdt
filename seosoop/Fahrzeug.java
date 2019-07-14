package seosoop;

public class Fahrzeug {

    private int baujahr;
    private int ps;
    private String marke;
    private int tankgroesse;

    // Konstruktor der Elternklasse
    public Fahrzeug(int bj, int ps, String marke, int tank) {
        this.baujahr = bj;
        this.marke = marke;
        this.ps = ps;
        this.tankgroesse = tank;
    }

//    @Override
//    public String toString(){
//        return String.format("Baujahr %d Marke: %s, PS%d Tankgroesse %d",
//                baujahr, marke, ps, tankgroesse);
//    }
    @Override
    public String toString() {
        return String.format("Marke: %s, Baujahr %d PS %d Tankgroesse %d",
                marke, baujahr, ps, tankgroesse);
    }
}
