package seos;

public class Zeichen8 {
    
    // Replaces the first letter
    // HINWEIS*** Add (?i) to remove case-sensitivity.
    
    public static void main(String[] args) {
          String ers="I'm not Mimi";
          
          String ersetzt=ers.replaceFirst("i", "a");
          
          System.out.println(ersetzt);
        
    }
}
