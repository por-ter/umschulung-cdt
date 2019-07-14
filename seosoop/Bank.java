package seosoop;

public class Bank {

    String name = "ZockerKasse";
    int geld;

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
        return String.format("Spieler: %s Geld:%d", name, geld);
    }
}
