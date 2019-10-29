package practiceexercises;

public class DDTest {

    public static void main(String[] args) {
        
        Character playerOne = new Character();
        
        String race = playerOne.raceChoiceRandom();
        
        // Calculate character ability/skill points
        int[] abilities = playerOne.skillSet(race);        
        for(int skillCalc = 0; skillCalc<abilities.length; skillCalc++){
            abilities[skillCalc] = abilities[skillCalc] + Dice.rollDice4();
        }
        
        String characterClass = playerOne.charClass(race, (Dice.rollDice4()-1));
        System.out.println("###"+characterClass+"###");
        
        String background = playerOne.background(Dice.rollDice4());
        
        System.out.println(playerOne.toString());
        
        
    }

}
