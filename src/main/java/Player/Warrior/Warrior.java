package Player.Warrior;
import Behaviours.IAttack;
import Behaviours.IDamageable;
import Player.Player;

public abstract class Warrior extends Player implements IAttack {

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


    public void inflictDamage(IDamageable character) {
        character.takeDamage(this.weapon.getHitValue());

    }

    public void takeDamage(int damage) {
        setHP(getHP() - damage);

    }

}
