package seos;

public class Zeichen1 {
    
    public static void main(String[] args) {
        String a = "Hello";
        String b = "HELLO";
        
        if(a.equalsIgnoreCase(b)){
            System.out.println("a und b haben den gleichen Inhalt.");
        }else{
            System.out.println("a und b haben NICHT den gleichen Inhalt.");
        }
    }
}
