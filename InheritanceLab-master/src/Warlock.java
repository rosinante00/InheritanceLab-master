public class Warlock extends Character {
    Warlock(String name, int lvl, int hp, int mana){
        super(name, lvl, hp, mana);
    }

    public void Rasengan(Character enemyCharacter) {

        System.out.println(super.characterName + " attacks " + enemyCharacter.characterName + " with Rasengan (Damage - 60)");
        int damagePoints = 60;
        damageTarget(enemyCharacter, damagePoints);

    }









}
