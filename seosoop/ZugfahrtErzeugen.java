package seosoop;

import java.util.*;

public class ZugfahrtErzeugen {
    
    public static void main(String[] args) {
        Scanner eing=new Scanner(System.in);
        Zugfahrt z1=new Zugfahrt();
        
        System.out.println("Bitte Stunden geben");
        z1.setAbfahrtStd(eing.nextInt());
        
        System.out.println("Stunden: "+z1.getAbfahrtStd());
        
        System.out.println("Bitte Minuten geben");
        z1.setAbfahrtMin(eing.nextInt());
        
        System.out.println("Minuten: "+z1.getAbfahrtMin());
    }
}
