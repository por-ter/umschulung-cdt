package seosoop;

public class Spieler {

    private String name;
    int geld = 500;

    public Spieler(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getGeld() {
        return geld;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGeld(int geld) {
        this.geld = this.geld + geld;
    }

    @Override
    public String toString() {
        return String.format("Spieler: %s Geld:%d", this.name, this.geld);
    }
}
