package seos;

//Aufgabe 6
//Gegeben sind drei Strings mit folgendem Inhalt:
//s1="Raub, s2="tot", hugo="Lotto"
//Die Strings sollen so bearbeitet werden, dass:
//1. Ausgegeben wird: Aus Raub wird Laub, Taub, Raum, Traum
//2. Weiter geht es mit s2. Aus tot soll nach und nach rot, Lot, Pirot werden.
//3. Aus Lotto wird nun: Otto, Motto, Ratte, Latte, Latte
//Die Ausgabe am Ende könnte wie folgt aussehen:
//Aus Raub wird Laub, Taub, Raum, lieb
//s2 hat den Inhalt: tot.
//Aus tot nun rot
//Aus tot nun Lot
//Aus tot nun Pirot
//Alle Inhalte: s1 Raub s2 tot s3 rot s4 Lot s5 Pirot
//**********************************************************
//Weiter geht es mit hugo
//Aus dem ursprünglichen "Lotto" wurde
//Otto
//Motto
//Ratte
//Latte
//Matte

public class StringAufgabe6 {
    
    public static void main(String[] args) {
        String s1="Raub"; String s2="tot"; String hugo="Lotto";
        
        System.out.println("Aus "+s1+" wird "+"Raub, ".replace("R", "L")
                +"Raub, ".replace("R", "T")+"Raub, ".replace("b", "m")
                +"Raub, ".replace("Rau", "lie"));
        
        System.out.println("s2 hat den Inhalt: "+s2+".");
        System.out.println("Aus tot nun "+"tot".replaceFirst("t","r"));
        System.out.println("Aus tot nun "+"tot".replaceFirst("t","L"));
        System.out.println("Aus tot nun "+"tot".replaceFirst("t","Pir"));
        
        String s3=s2.replaceFirst("t","r");
        String s4=s2.replaceFirst("t","L");
        String s5=s2.replaceFirst("t","Pir");
        System.out.println("Alle Inhalte: "+"s1 "+s1+" s2 "+s2+" s3 "+s3+" s4 "+s4+" s5 "+s5);
        System.out.println("********************************************************");
        
        System.out.println(hugo);
        
        String hihi=hugo.replace("Lo","O"); // ("L","")
        System.out.println(hihi);
        
        String hkhk=hihi.replace("O","Mo");
        System.out.println(hkhk);
        
        String hjhj=hugo.replaceFirst("o$", "e"); 
        hjhj=hjhj.replace("Lo","Ra");
        System.out.println(hjhj);
        
        String hzhz=hjhj.replace("Ra","La");
        System.out.println(hzhz);
        
        String hbhb=hjhj.replace("Ra","Ma");
        System.out.println(hbhb);
        
        System.out.println("******");
        
        String huho=hugo.replace("Lo","O")+"e"+hugo.charAt(hugo.length()-1);
        System.out.println(huho);
        
    }

}
