package seos;

import java.util.*;

public class Aufgabe11Password {

    public static void main(String[] args) {
        eingabe();
    }

    public static void eingabe() {
        Scanner eing = new Scanner(System.in);
        String mog = ""; String mog2 = "";        
        String kenn = ""; String ges = "";
        

        int i=0;        
        while (i < 3 && !kenn.equals(Password.kw(kenn))) {
            System.out.println("Bitte geben Sie Ihre Passwort:");
            kenn = eing.nextLine();
            moeglich(mog, mog2, kenn);
            i++;
        }
        gesperrt(ges, i);
    }

    public static String moeglich(String mog, String mog2, String kenn) {
        if (kenn.equals(Password.kw(kenn))) {
            mog = "Zugriff erlaubt!";
            System.out.println(mog);
            return mog;
        } else {
            mog2 = "Zugriff verweigert!";
            System.out.println(mog2);
            return mog2;
        }
    }
    
    public static String gesperrt(String ges, int i){
        if (i==3)
            ges = "\nPassword incorrect too often, "
                    + "please contact your IT department.";
            System.out.println(ges);
            
        return ges;    
    }    
}
