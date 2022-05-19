public class Character {
    public String characterName = "Gandalf";
    public int level = 0;
    public int healthPoints = 100;
    public int manaPoints = 200;

    /**
     * Create two Constructors
     * 1 - Non Parameterized Constructor
     * 2 - Parameterized Constructor Initializing healthPoints, level, CharacterName and mana
     */
    Character() {
        System.out.println("meow");

    }

    Character(String name, int lvl, int hp, int mana){
        characterName = name;
        level = lvl;
        healthPoints = hp;
        manaPoints = mana;

    }



    /**
     * Create a Method that displays the Name of the Character
     * eg. "Character Initialized : Gandalf"
     */

    public void display(){
        System.out.println("Character Initialized: " +characterName);
        System.out.println();
    }

    /**
     * Create a method to Damage Target Character
     */
    public void damageTarget(Character enemyCharacter, int damagePoints) {
        /**
         * Deduct health points from enemy character
         */
        enemyCharacter.healthPoints -= damagePoints;
        System.out.println("enemy character HP Left = " + enemyCharacter.healthPoints);

        /**
         * Method that prompts if HP falls below 0
         */
        if (enemyCharacter.healthPoints <= 0) {

            System.out.println("Character " + enemyCharacter.characterName + " is defeated");

        }


    }





}