package seos;

public class Zeichen7 {
    
    // Replaces everything that is exactly like what you want to replace
    // ignores case-sensitivity
    
    public static void main(String[] args) {
          String ers="u, Wunder, gut, Uu, burgen";
          
          String ersetzt=ers.replaceAll("(?i)u", "x");
          
          System.out.println(ersetzt);
        
    }
}
