package Player.Warrior;
import Player.Player;

public abstract class Warrior extends Player{

    Weapon weapon;
    int hp;

    public Warrior(String name, Weapon weapon, int healthPoints) {
        super(name);
        this.weapon = weapon;
        this.hp = healthPoints;
    }



}
