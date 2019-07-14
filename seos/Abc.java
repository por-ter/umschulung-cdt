package SEOS;

import java.util.Scanner;

public class Abc
{

	public static void main(String[] args) 
	{
		merkepasswort();
	}
	public static void merkepasswort()
	{
		String name;
		{String merke=("");
		//String name;
		Scanner ein = new Scanner(System.in);
		System.out.println("Geben Sie ihr persönliches Passwort ein"
							+" dieses wird gespeichert: \t");
		name = ein.nextLine();
		merke.equals(name);
		//System.out.print("Das Passwort lautet: \t\n" +(name));
		}
		start((name));
	}	
		public static void start(String name)
		{
                String pw="";
		int i = 1;
	        while (i<4 && !name.equals(pw))
	        {
	        Scanner ein = new Scanner(System.in);
	        System.out.println("\nBitte geben Sie ihr Passwort ein: ");
	        pw = ein.nextLine();
	        	{
	        
		        if (name.equals(pw))
		        	System.out.println("\nVery good, Zugriff gewährt!!");
		        else	        
		        	System.out.println("\nLeider falsch, sie haben noch " + (i-1) +
		        						" Versuche");
	        	}
	        }
		}
}