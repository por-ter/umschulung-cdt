package seosoop;

public class Person {
    private String vorname;
    private String name;
    private String adresse;
    
    //Konstruktor der Elternklasse
    public Person(String vn, String nn, String adr){
        vorname=vn;
        name=nn;
        adresse=adr;
    }
    
    @Override
    public String toString(){
        return String.format("Meine Name ist %s %s, meine Adresse "
                + "lautet %s", vorname, name, adresse);
    }
}
