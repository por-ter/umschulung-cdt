package seosoop;

import java.util.*;

public class BankZinsenKunden {
    public static void zinsKunden(){
        Scanner eing=new Scanner(System.in);
        int anzahl = 2;
            BankKonto2[] kunden = new BankKonto2[anzahl];
            // Kunden[0]
            kunden[0] = new BankKonto2("Bank of Dave", 4848, "Billy Bob", 1000);
            kunden[0].setZinssatz(10);
            kunden[0].setGesamtbetrag(0);
            System.out.println(kunden[0].toString());

            System.out.println("");

            // Kunden[1]
            kunden[1] = new BankKonto2("Bank of Dave", 5959, "Terry Tim", 20000);
            kunden[1].setZinssatz(10);
            kunden[1].setGesamtbetrag(0);
            System.out.println(kunden[1].toString());

            System.out.println("*************************************\n");

            // Enter Konto Nummer
            // ---------------- ----------------
            System.out.println("\n*************************************\n");
            System.out.println("Enter Konto Nummer:");
            int knumTest = eing.nextInt();
            int x = 0, mark = 0;
            while (x < kunden.length) {
                if (kunden[x].getKontoNum() == knumTest) {
                    mark = x;
                    x = 30;
                }
                x++;
            }
            
            // Password Check
            // ---------------- ----------------
            BankPasswordCheck.eingabe();
            
            // Ein / Auszahlung
            // ---------------- ----------------
            System.out.println("Money in(1) or out(2)");
            double ein = 0, aus = 0;
            int wahl = eing.nextInt();
            if (wahl == 1) {
                ein = BankKonto2.einzahl(ein);
                kunden[mark].setKontoStand(ein);
                kunden[mark].setZinssatz(10);
                kunden[mark].setGesamtbetrag(0);
            } else if (wahl == 2) {
                aus = BankKonto2.auszahl(aus);
                kunden[mark].setKontoStand(-aus);
                kunden[mark].setZinssatz(10);
                kunden[mark].setGesamtbetrag(0);
            }
            System.out.println(kunden[mark].toString());

            System.out.println("");
    }
}
