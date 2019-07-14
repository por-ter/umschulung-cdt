package seosoop;

import java.util.*;

public class BankKonto2 {
    
    private String bankname;
    private int kontoNum;
    private String inhaber;
    private double kontoStand;
    private double zinssatz;
    private double gesamtbetrag;
    
    public BankKonto2(int kontoNum){
        this.kontoNum=kontoNum;
    }
    
    public BankKonto2(double zinssatz){
        this.zinssatz=zinssatz;
    }
    
    public BankKonto2(int kontoNum, String inhaber, double kontoStand){
        this(kontoNum);
        this.inhaber=inhaber;
        this.kontoStand=kontoStand;
    }
    
    public BankKonto2(String bankname, int kontoNum, String inhaber, 
                  double kontoStand){
        this(kontoNum, inhaber, kontoStand);
        this.bankname=bankname;
    }
    
    public BankKonto2(String bankname, int kontoNum, String inhaber, 
                  double kontoStand, double zinssatz, double gesamtbetrag){
        this(kontoNum, inhaber, kontoStand);
        this.bankname=bankname;
        this.zinssatz=zinssatz;
        this.gesamtbetrag=gesamtbetrag;
    }

    public String getBankname() {
        return bankname;
    }

    public void setBankname(String bankname) {
        this.bankname = bankname;
    }

    public double getZinssatz() {
        return zinssatz;
    }

    public void setZinssatz(double zinssatz) {
        this.zinssatz=kontoStand/zinssatz;
        
    }

    public double getGesamtbetrag() {
        return gesamtbetrag;
    }

    public void setGesamtbetrag(double gesamtbetrag) {
        this.gesamtbetrag = kontoStand+zinssatz;
    }
    
    public static double einzahl(double ein){
        Scanner eing=new Scanner(System.in);
        System.out.println("How much ...... ein?");
            ein = eing.nextDouble();
            return ein;
    }
    
    public static double auszahl(double aus){
        Scanner eing=new Scanner(System.in);
        System.out.println("How much ...... aus?");
            aus = eing.nextDouble();
            return aus;
    }
    
    // kontoNummer
    public int getKontoNum(){
        return kontoNum;
    }
    
    public void setKontoNum(int kontoNum) {
        this.kontoNum = kontoNum;
    }
    
    // inhaber
    public String getInhaber(){
        return inhaber;
    }
    public void setInhaber(String inhaber){
        this.inhaber = this.inhaber+inhaber;
    }
    
    // kontoStand
    public double getKontoStand(){
        return kontoStand;
    }
    public void setKontoStand(double kontoStand){
            if (kontoStand*-1 > this.kontoStand){
                System.out.println("Ich habe dir den ganzen "+this.kontoStand+
                        " gegeben, mehr geht nicht!");
                this.kontoStand=0;
            }else{
                this.kontoStand = this.kontoStand+kontoStand;
            }
    }
    
    @Override
    public String toString(){
        return String.format("***** Aktuelle Zustand *****\nBankName: %s "
                + "\nKonto Nummer: %d \nInhaber: %s \n"
                + "Konto Stand: %.2f \nZinsatz: %.2f \n"
                + "Gesamtbetrag: %.2f",this.bankname, this.kontoNum, this.inhaber, 
                this.kontoStand, this.zinssatz, this.gesamtbetrag);
    }

}
