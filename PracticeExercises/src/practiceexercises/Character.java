package practiceexercises;

public class Character {
    
    public String race;
    public int[] skills;
    public String[] charClass;
    public String background;

    public Character() {
    }

    public Character(String race, int[] skills) {
        this.race = race;
        this.skills = skills;
    }
    
    public String raceChoiceRandom(){        
        switch(Dice.rollDice4()){
            case 1: race = "Human";
                break;
            case 2: race = "Dwarf";
                break;
            case 3: race = "Elf";
                break;
            case 4: race = "Halfling";
                break;
        }       
        return this.race;        
    }
    
    public int[] skillSet(String race){
        // Agility, Strength, Intelligence, Charisma, Special        
        switch(race){
            case "Human":
                skills = new int[]{3,3,3,5,3};
                break;
            case "Dwarf":
                skills = new int[]{2,4,3,1,3};
                break;
            case "Elf":
                skills = new int[]{4,2,5,4,3};
                break;
            case "Halfling":
                skills = new int[]{4,2,3,4,4};
                break;
        }
        
        return this.skills;
    }
    
    public String charClass(String race, int choice){
        switch(race){
            case "Human":
                charClass = new String[]{"Warrior","Barbarian","Cleric","Wizard"};
                break;
            case "Dwarf":
                charClass = new String[]{"Warrior","Druid","Warlock","Bard"};
                break;
            case "Elf":
                charClass = new String[]{"Assassin","Fighter","Sorcerer","Paladin"};
                break;
            case "Halfling":
                charClass = new String[]{"Hunter","Assassin","Cleric","Bard"};
                break;
        }
        
        return this.charClass[choice];
    }
    
    public String background(int choice){
        switch(choice){
            case 1: background = "Criminal";
                break;
            case 2: background = "Loner";
                break;
            case 3: background = "Sage";
                break;
            case 4: background = "Soldier";
                break;
        }
        return this.background;
    }

    @Override
    public String toString() {
        return "Your Character\n--------------\n" + "Race: " + race + "\nClass: "+ charClass(race,1) + "\nBackground: " + background + 
                "\nAbilities:\n" + "\tAgility - " + skills[0] + "\n\tStrength - " + skills[1] + 
                "\n\tIntelligence - " + skills[2] + "\n\tCharisma - " + skills[3] + "\n\tSpecial - " + skills[4];
    }
    
    

}
