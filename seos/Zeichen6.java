package seos;

public class Zeichen6 {
    
    // Replaces everything that is exactly like what you want to replace
    // case-sensitive
    
    public static void main(String[] args) {
        String titel="ABOUT something AB ungelöst";
        System.out.println("Alter Titel: "+titel);
        
        titel=titel.replaceAll("AB","XY");
        System.out.println("Neuer Titel: "+titel);
        
    }
}
