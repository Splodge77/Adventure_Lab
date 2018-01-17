package Player.Warrior;
import Player.Player;

public abstract class Warrior extends Player{

    Weapon weapon;

    public Warrior(String name, Weapon weapon, int hp) {
        super(name, hp);
        this.weapon = weapon;
    }


    public Weapon getWeapon() {
        return this.weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }
}
