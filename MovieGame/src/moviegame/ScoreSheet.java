package moviegame;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.ListIterator;

public class ScoreSheet {
    
    public static void writeToSpreadsheet(Player playerName, int counter) throws IOException {
        String name = playerName.getName();
        int score = playerName.getHighScore();

        String zeile = String.format("%s; %d;", name, score);
        FileWriter f = new FileWriter("C:\\Bob\\highScoreSpreadsheet.csv", true);
        try (BufferedWriter bw = new BufferedWriter(f)) {
            bw.write(zeile);
            bw.newLine();
        } catch (IOException exi) {
            System.out.println(":::");
        }
        System.out.println("\n" + playerName.toString() + "\n- saved to High-Score list!");
//        System.out.println("\nHigh Score saved!");
    }

    public static void showHighScores() throws FileNotFoundException {
        BufferedReader br;
        ArrayList liste;

        br = new BufferedReader(new FileReader("C:\\Bob\\highScoreSpreadsheet.csv"));
        liste = new ArrayList();
        String s;
        try {
            while ((s = br.readLine()) != null) {
                liste.add(s);
            }
        } catch (IOException ex) {
            ;
        } finally {
            try {
                br.close();
            } catch (IOException ex) {
                ;
            }
        }
        int anz = liste.size();
        ListIterator<String> mL = liste.listIterator();
        System.out.println("||| High-Scores |||");
        for (int i = 0; i < anz; i++) {
            System.out.println((i+1) + ": " + mL.next());
        }
    }

}
