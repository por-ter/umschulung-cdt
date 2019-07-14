package seosoop;

public class FreieMA extends Person implements Arbeitszeit{
   private double honorarStd;
   private String stunden;
   int wochenStunde;
   
   public FreieMA(String vorname, String name, String adresse, 
           double honorarStd, int wochenStunde){
       super(vorname, name, adresse);
       this.honorarStd=honorarStd;
       this.wochenStunde=wochenStunde;
   }
   @Override
   public String toString(){
       String pDaten=super.toString();
       return String.format("%s, Honorar pro Stunde: %.2f\nWochenstunden: "
               + "%d\nGesamthonorar: %.2f", pDaten, honorarStd, wochenStunde,
               (honorarStd*wochenStunde));
   }
}
