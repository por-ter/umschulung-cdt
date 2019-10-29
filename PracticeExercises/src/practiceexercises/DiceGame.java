package practiceexercises;

public class DiceGame {

    private static int numberOfGames = 10;

    public static void main(String[] args) {

        int computerWins = 0, computerRoll = 0;
        int userWins = 0, userRoll = 0;
        int tiedGames = 0;

        for (int round = 0; round < numberOfGames; round++) {

            computerRoll = Dice.rollDice6();
            userRoll = Dice.rollDice6();

            // determine who won the game
            if (computerRoll == userRoll) {
                tiedGames++;
            } else {
                if (computerRoll > userRoll) {
                    computerWins++;
                } else {
                    userWins++;
                }
            }
        }

        // displays the results
        System.out.println("Computer.... " + computerWins);
        System.out.println("User.... " + userWins);
        System.out.println("Ties.... " + tiedGames);

        if (computerWins > userWins) {
            System.out.println("You got beat by a computer");
        } else {
            if (computerWins < userWins) {
                System.out.println("You beat the computer");
            } else {
                System.out.println("The game has ended in a tie");
            }
        }

    }

}
