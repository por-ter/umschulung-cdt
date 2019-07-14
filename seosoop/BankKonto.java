package seosoop;

import java.util.*;

public class BankKonto {
    
    private int kontoNum;
    private String inhaber;
    private double kontoStand;
    
    public BankKonto(int kontoNum){
        this.kontoNum=kontoNum;
    }
    
    public BankKonto(int kontoNum, String inhaber, double kontoStand){
        this(kontoNum);
        this.inhaber=inhaber;
        this.kontoStand=kontoStand;
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
    
    public BankKonto (double kontoStand){
        setKontoStand(kontoStand);
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
        return String.format("***** Aktuelle Zustand *****\nKonto Nummer: %d \nInhaber: %s \n"
                + "Konto Stand: %.2f", this.kontoNum, this.inhaber, this.kontoStand);
    }

}
