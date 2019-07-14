package seos;

import java.util.*;

public class StringsVergleichen {
    
    public static void main(String[] args) {
        String name = "Hugo";
        String name2 = "HUGO";
        
        Scanner eing=new Scanner(System.in);
        
        System.out.println("Type, Hugo oder HUGO: ");
        String name3=eing.nextLine();
        
        if (name3.equals(name2)){
            System.out.println("gleich");
        }else{
            System.out.println("UNgleich");
        }
    }

}
