package seos;

public class IndexOf {
    
    public static void main(String[] args) {
        
        //1 - shows the index position of a letter in a String
        String prg="Java";
        
        int x=prg.indexOf("v");
        
        System.out.println(x);
        
        //2 - first letter "a", after the index # 11
        String ind="Abrakadabra hex hex Aloha";
        
        int y=ind.indexOf("a",11);
        
        System.out.println(y);
        
        //3 - the last letter "a"
        String ihn="Java Kaffee";
        
        int g=ihn.lastIndexOf("a");
        
        System.out.println(g);
        
        //4
        String text="Such das Zeichen an Pos 3 (also hier das 'h') und gib es aus";
        
        char gefunden = text.charAt(3);
        
        System.out.println(gefunden);
        
        //5 - gives the first letter at pos 0, statt charAt, length()-1 is the
        // total length and the last letter in the String
        String btv="Biderektional";
        System.out.println("Das erste Zeichen ist ein "+btv.charAt(0));
        
        char lz=btv.charAt(btv.length()-1);
        
        System.out.println("Das letzte Zeichen ist ein "+lz+" an Pos "+ (btv.length()-1));
    }
}
