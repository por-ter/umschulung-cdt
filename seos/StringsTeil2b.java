package seos;

public class StringsTeil2b {
    
    public static void main(String[] args) {        
         String name="Lilly";
         
         String leer=" *** eins und  zwei *** ";
         System.out.println(leer);
         
         String leer2=leer.replace(" ","");
         System.out.println("Alle Leerzeichen wurden entfernt");
         System.out.println(leer2);
         System.out.println("*********************************");
         
         String leer3=leer.replaceFirst(" ","");
         System.out.println("Nur das erste Leerzeichen wurde entfernt");
         System.out.println(leer3);
         System.out.println("*********************************");
         
         System.out.println("Nur die Leerzeichen am Anfang und am Ende wurden entfernt");
         String leer4=leer.trim();
         System.out.println(leer4);
         System.out.println("*********************************");
         
         System.out.println("Alle mehrfach aufeinanderfolgenden "
                 + "Leerzeichen AUßER die am Anfang und am Ende"
                 + " wurden entfernt");
         String leer5=leer.replaceAll(" +"," ");
         System.out.println(leer5);
         System.out.println("**********************************");
         
         System.out.println("Jede l(kleines L) wurde durch 's' ersetzt");
         String nameNeu=name.replaceAll("l","s");
         System.out.println(nameNeu);
         System.out.println("***********************************");
         
         System.out.println("In einem Kommando wurden sowohl die"
                 + " Leerzeichen an Anfang und Ende als auch"
                 + " mehrere aufeinanderfolgende Leerzeichen entfernt.");
         String leer6=leer.replaceAll(" +", " ").trim();
         System.out.println(leer6);
         System.out.println("************************************");
         
        
    }

}
