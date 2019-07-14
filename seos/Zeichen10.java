package seos;

public class Zeichen10 {
    
    // replace vs replace, also what is new is [a|b] - this replaces those
    // letters even though they are not next to each other
    
    public static void main(String[] args) {
          String a = "artem beate daniel";
          String a1=a.replace("a","*");
          System.out.println("a1: "+a1);
          
          String a2=a.replaceAll("[n|t]", "*");
          System.out.println("a2: "+a2);
        
    }
}
