package moviegame;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class HauptProgram {

    public static Scanner eing = new Scanner(System.in);

    public static void main(String[] args) throws FileNotFoundException {
        GetMovie.getMovieTitle();
    }

    public static void welcomeMessage() {
        System.out.println("||| Movie List Hangman |||");
        System.out.println("°°°°°°°°°°°°°°°°°°°°°°°°°°");
        System.out.println("You must guess the movie titles in as fewer tries as possible.");
        System.out.println("Maximum of 5 failed guesses before the round is over.\n");
        System.out.println("Hinweis: try working through the vowels before consenants!\n");
        System.out.println("Let's begin!!!\n");
    }

    public static void hauptProgram(String movieTitle, String[] title, String name) {
        welcomeMessage();

        System.out.print("Please enter your name: ");
        Player playerName = new Player(eing.nextLine());
        System.out.println();
        System.out.println("Thank you, " + playerName.getName() + ", and good luck!\n");

        // prints out the movie title in --- ------ format
        for (int i = 0; i < title.length; i++) {
            System.out.print(title[i]);
        }

        ArrayList<Integer> positions = new ArrayList<>();

        // input/interaction with the player/user
//        Scanner eing = new Scanner(System.in);
        System.out.println();
        int keepPlaying = 1;
        int counter = 1;
        int mistakes = 5;

        do {
            System.out.print("\nYour letter: ");
            String guess = eing.next();

            String lowerMovieTitle = movieTitle.toLowerCase();

            if (lowerMovieTitle.contains(guess)) {
                System.out.println("Title contains: " + guess);
                int index = lowerMovieTitle.indexOf(guess);
                while (index >= 0) {
                    positions.add(index);
                    index = lowerMovieTitle.indexOf(guess, index + 1);

                }
                System.out.println();

                for (int j = 0; j < positions.size(); j++) {
                    title[positions.get(j)] = title[positions.get(j)].replace("-", guess);
                }

                for (String title1 : title) {
                    System.out.print(title1);
                }
                System.out.println();

                // put this in own method
                System.out.println("\nCan you guess the full movie yet?\n** YES(Y) - NO(N)**");
                String wahl = eing.next();
                eing.nextLine();
                if (wahl.equalsIgnoreCase("y")) {
                    // user wants to guess the correct answer.
                    System.out.print("Your guess: ");
                    guess = eing.nextLine();

                    if (guess.equalsIgnoreCase(movieTitle)) {
                        System.out.println("\nCongratulations, " + playerName.getName() + ", the correct answer is '" + movieTitle + "'.");
                        System.out.println("You guessed that in " + counter + " rounds, well done!");
//                        playerName.setHighScore(counter);
//                        try {
//                            ScoreSheet.writeToSpreadsheet(playerName, counter);
//                        } catch (IOException ex) {
//                            ;
//                        }
                        keepPlaying = 123;
//                        endMenu();
                    } else {
                        mistakes--;
                        System.out.println("\nBad luck, " + playerName.getName() + ", " + guess + " isn't the movie title");
                        System.out.println("You have " + mistakes + " tries left!");
//                        System.out.println("The correct answer was: " + movieTitle);
//                        System.out.println("GAME OVER!!!");
//                        keepPlaying = 123;

//                        endMenu();
                    }

                } else if (wahl.equalsIgnoreCase("n")) {
                    keepPlaying = 1;
                }
            } else if (!lowerMovieTitle.contains(guess)) {
                mistakes--;
                System.out.println("Bad luck, " + playerName.getName() + ", " + guess + " isn't in the movie title"
                        + ", you have " + mistakes + " tries left!");

            }
            if (mistakes == 0) {
                System.err.println("\nBad luck!");
                System.out.println("The answer was: " + movieTitle);
                keepPlaying += 100;
            }
            counter++;

        } while (keepPlaying == 1);
        endMenu();
    }

    public static void endMenu() {
        System.out.println("\n||| Options |||");
//        System.out.println("[1] -   Show High-Scores");
        System.out.println("[1] -   Play Again");
        System.out.println("[0] -   Exit");

        try {
            int ch = eing.nextInt();
            eing.nextLine();
            switch (ch) {
//                case 1:
//                    ScoreSheet.showHighScores();
//                    endMenu();
//                    break;

                case 1:
                    GetMovie.getMovieTitle();
                    endMenu();
                    break;

                case 0:
                    System.out.println("Thanks for playing!");
                    System.exit(0);
                    break;

                default:
                    System.exit(0);
            }
        } catch (IOException ioe) {
            ;
        }
    }
}
