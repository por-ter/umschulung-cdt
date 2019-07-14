package seosoop;

import java.util.*;

public class BankNewKunden {
public static void neuKunden(){
    Scanner eing=new Scanner(System.in);
    System.out.println("How many new Accounts?");
            int arrayLaenge = eing.nextInt();
            BankKonto[] kunden2 = new BankKonto[arrayLaenge];
            
            // Füllt neue Kunden info ein
            // ---------------- ----------------
            int j = 0;
            while (j < arrayLaenge) {
                String inhaber;
                double kontoStand = 0.0;
                int kontoNum = 0;
                Random rd = new Random();
                // BankKonto nummer
                kontoNum = rd.nextInt(9999) + 1000;
                eing.nextLine();
                System.out.println("\n*************************************\n"
                        + "Seinen neue Konto nummer is: " + kontoNum
                        + " bitte merken Sie.");
                // Inhaber
                System.out.println("Namen geben..");
                inhaber = eing.nextLine();
                // Anfangs Kontostand
                System.out.println("Anfangs konto Stand?");
                kontoStand = eing.nextInt();
                kunden2[j] = new BankKonto(kontoNum, inhaber, kontoStand);
                j++;
            }
            
            System.out.println("\n*************************************\n");
            
            // Password Check
            // ---------------- ----------------
            BankPasswordCheck.eingabe();

            // Enter BankKonto Nummer
            // ---------------- ----------------
            System.out.println("Enter Konto Nummer:");
            int knumTest2 = eing.nextInt();
            int y = 0, merk = 0;
            while (y < kunden2.length) {
                if (kunden2[y].getKontoNum() == knumTest2) {
                    merk = y;
                    y = 30;
                }
                y++;
            }
            // Ein / Auszahlung
            // ---------------- ----------------
            System.out.println("Money in(1) or out(2)");
            double ein = 0, aus = 0;
            int wahl = eing.nextInt();
            if (wahl == 1) {
                ein = BankKonto.einzahl(ein);
                kunden2[merk].setKontoStand(ein);
            } else if (wahl == 2) {
                aus = BankKonto.auszahl(aus);
                kunden2[merk].setKontoStand(-aus);
            }
            System.out.println(kunden2[merk].toString());
}
}
