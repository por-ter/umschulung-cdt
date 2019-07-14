package seos;

public class StringsTeil2 {
    
    public static void main(String[] args) {
        
        System.out.println("Aus 42 wird "+"42".replace('4', ' '));
        // replaces the 4 in the 42 with a space
        
        String zahl1="23";
        System.out.println("Aus "+zahl1+" wird "+zahl1.replace('2','3'));
        // aus 23 wird 33
        System.out.println(zahl1);
        // aber only in that sout, it doesn't change the variable
        
        System.out.println("Aus abc wird "+"abc".replace('b', 'Z'));
        // aus abc wird aZc
        
        System.out.println("Aus Post wird "+"Post".replace('P','L'));
        // aus Post wird Lost
        
        //Ersetze das erste Auffinden(!) von x durch y--> "xx".replaceFirst("x","y")
        System.out.print("Das erste x wird durch y ersetzt--> ");
        System.out.println("xx".replaceFirst("x","y"));
        
        System.out.println("Aus 4444 wird "+"4444".replaceFirst("4","2"));
        // aus 4444 wird 2444
        
        String name2="Lilli";
        System.out.println("Aus "+name2+" wird "+name2.replaceFirst("i", "o"));
        // aus Lilli wird Lolli
    }

}
