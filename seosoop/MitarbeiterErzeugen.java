package seosoop;

public class MitarbeiterErzeugen {
    
    public static void main(String[] args){
        Mitarbeiter M1 = new Mitarbeiter("Vata", "Morgana", 
                        "Heideweg 16 45125 Berlin", 2500.00,"IT");
        Mitarbeiter M2 = new Mitarbeiter("Lilly", "Lasterlos", 
                        "Tugendalle 11 47120 Achtsam", 1720.33,"Buchhaltung");
        
        FreieMA FM1=new FreieMA("Wilma", "Urlaub", "Hasemkamp 23", 25.0, 42);
        FreieMA FM2=new FreieMA("Max", "Imal", "Große Waldstr. 22", 35.0, 42);
        
        System.out.println(M1.toString());
        System.out.println(M2.toString());
        System.out.println("**************");
        System.out.println(FM1.toString());
        System.out.println("-----");
        System.out.println(FM2.toString());
    }

}
