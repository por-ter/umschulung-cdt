package seosoop;

import java.util.*;

public class Mensch {

    String nname;
    String vname;
    String geschlecht;
    int alter;

    public Mensch(String n, String v, String g, int a) {
        nname = n;
        vname = v;
        geschlecht = g;
        alter = a;
    }
    
    public Mensch(){        
    }

    public String toString() {
        return String.format("\nNachname:\t%s\nVorname:\t%s\nGeschlecht:\t%s"
                        + "\nAlter:\t\t%s\n", nname, vname, geschlecht, alter);
    }

}
