package seosoop;

public class HausErzeugen {
    
    public static void main(String[] args) {
        Haus h1=new Haus(33,44,21,"rot");
        System.out.println("******");
        System.out.println(h1.toString());
//        System.out.println("Breite des Hauses "+h1.breite +"m");
//        System.out.println("Höhe des Hauses "+h1.hoehe +"m");
//        System.out.println("Tiefe des Hauses "+h1.tiefe +"m");   
        
        Haus h2=new Haus(10,11,12,"blau");
        //System.out.println("******");
        System.out.println(h2.toString());
//        System.out.println("Breite des Hauses "+h2.breite +"m");
//        System.out.println("Höhe des Hauses "+h2.hoehe +"m");
//        System.out.println("Tiefe des Hauses "+h2.tiefe +"m"); 
        
        Haus h3=new Haus(34,22,11);
        //System.out.println("******");
        System.out.println(h3.toString());
//        System.out.println("Breite des Hauses "+h3.breite +"m");
//        System.out.println("Höhe des Hauses "+h3.hoehe +"m");
//        System.out.println("Tiefe des Hauses "+h3.tiefe +"m"); 
//        System.out.println("Farbe des Hauses ist "+h3.farbe); 
        
        Haus h4=new Haus();
        //System.out.println("******");
        
    }
}
