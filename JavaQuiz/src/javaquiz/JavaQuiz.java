package javaquiz;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import static javaquiz.QuestionsAnlegen.fragen;

public class JavaQuiz {

    static Scanner eing = new Scanner(System.in);
    static Random rnd = new Random();

    public static void main(String[] args) throws InterruptedException {
        fragen();
    }
        
    public static void menu(HashMap<Integer, Questions> qs) throws InterruptedException {
        Player pl=new Player();
        System.out.println("Enter name: ");
        pl.setName(eing.nextLine());
        
        HashSet<Integer> frag = new HashSet<>();
        do {
            frag.add(1 + rnd.nextInt(35));
        } while (frag.size() < 10);

        Object[] hold = new Object[10];
        hold = frag.toArray();

        int a = 0, points = 0, countR = 0, countF = 0;

        do {
            System.out.println(qs.get(hold[a]));
            System.out.print("ANSWER: ");
            int choice = eing.nextInt();

            if (choice == qs.get(hold[a]).getCorrectA()) {
                points = points + qs.get(hold[a]).getQuestionPunkte();
                pl.setPoints(points);
                System.out.println(CColours.greenBold + "\n||| CORRECT |||\t--->" + CColours.reset + "\tPOINTS: " + points + "\n");
                countR++;
            } else {
                System.out.println(CColours.red + "\n||| WRONG |||\t--->" + CColours.reset + "\tPOINTS: " + points);
                System.out.println("The correct answer was number "
                        + qs.get(hold[a]).getCorrectA() + "\n");
                countF++;
            }

            ++a;
        } while (a < 10);

        System.out.println("\n\tTOTAL POINTS: " + pl.getPoints()
                + "\n\tCorrect: " + countR
                + "\n\tIncorrect: " + countF);

        if (countR > countF) {
            for (int i = 5; i > 0; i--) {
                System.out.print(CColours.greenBold + "  CONGRATULATIONS " 
                        + pl.getName() + " "+ CColours.reset);
                Thread.sleep(350);
                System.out.print("\b");
                Thread.sleep(350);
            }
            System.out.println("");
        } else if (countR < countF) {
            for (int j = 5; j > 0; j--) {
                System.err.print(CColours.red + "  YOU SUCK " + pl.getName() 
                        + " " + CColours.reset);
                Thread.sleep(350);
                System.out.print("\b");
                Thread.sleep(350);
            }
        }
    }
}
