package seosoop;

import java.util.Scanner;

public class BankMenu {

    public static void main(String[] args) {
        Scanner eing = new Scanner(System.in);

        System.out.println("Zinssatz Kunden(1) oder neu(2)?");
        int wahl = eing.nextInt();

        // Zinsatz Kunden ---------------- ---------------- ----------------
        if (wahl == 1) {           
            BankZinsenKunden.zinsKunden();

        }
        // New Kunden ------------------- ----------------- -----------------
        if (wahl == 2) {
            BankNewKunden.neuKunden();
        }
    }
}
