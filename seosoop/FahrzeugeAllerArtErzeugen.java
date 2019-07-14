package seosoop;

public class FahrzeugeAllerArtErzeugen {
    
    public static void main(String[] args) {
        System.out.println("HEIDINGER'S LKW und PKW An- und Verkauf");
        System.out.println("Alle unsere Fahrzeuge");
        Fahrzeug F1 = new Fahrzeug(2010, 120, "Mercedes", 400);
        Fahrzeug F2 = new Fahrzeug(2018, 200, "Audi", 550);
        Fahrzeug F3 = new Fahrzeug(2012, 130, "BMW", 600);
        Fahrzeug F4 = new Fahrzeug(2014, 100, "Ente", 50);
        Fahrzeug F5 = new Fahrzeug(2018, 130, "Ford", 120);
        System.out.println(F1.toString());
        System.out.println(F2.toString());
        System.out.println(F3.toString());
        System.out.println(F4.toString());
        System.out.println(F5.toString());
        System.out.println("***************************************");
        
        System.out.println("Alle LKWs");
        Lkw L1 = new Lkw(2010, 120, "Mercedes", 400, 34, "Lastzug");
        Lkw L2 = new Lkw(2018, 200, "Audi", 550, 33, "Tieflader");
        Lkw L3 = new Lkw(2012, 130, "BMW", 600, 22, "Haubenfahrzeug");
        System.out.println(L1.toString());
        System.out.println(L2.toString());
        System.out.println(L3.toString());
        
        System.out.println("Alle PKWs");
        Pkw P1 = new Pkw(2009, 120, "Mercedes", 100, 120);
        Pkw P2 = new Pkw(2014, 200, "Ford", 150, 220);
        System.out.println(P1.toString());
        System.out.println(P2.toString());
    }

}
