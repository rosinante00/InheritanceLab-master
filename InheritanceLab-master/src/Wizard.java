public class Wizard extends Character {

    Wizard(String name, int lvl, int hp, int mana){
        super(name, lvl, hp, mana);
    }

    public void fireStorm(Character enemyCharacter){

        System.out.println(super.characterName + " attacks " + enemyCharacter.characterName + " with Firestorm (Damage - 50)");
        int damagePoints = 50;
        damageTarget(enemyCharacter, damagePoints);

    }

    /**
    * Method that recovers hp and mana of the character
     */
    public void recover () {

        healthPoints += 30;
        manaPoints += 20;

    }

}
