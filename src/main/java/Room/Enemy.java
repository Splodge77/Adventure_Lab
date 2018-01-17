package Room;

import Behaviours.IAttack;
import Behaviours.IDamageable;

public class Enemy implements IDamageable, IAttack {

    private String name;
    private int hp;
    private int hitValue;

    public Enemy(String name, int hp, int hitValue){
        this.name = name;
        this.hp = hp;
        this.hitValue = hitValue;
    }

    public String getName() {
        return this.name;
    }

    public int getHP() {
        return this.hp;
    }

    public void setHP(int hp) {
        this.hp = hp;
    }

    public int getHitValue(){
        return this.hitValue;
    }


        public void inflictDamage(IDamageable character) {
            character.takeDamage(this.getHitValue());
        }

        public void takeDamage(int damage) {
            setHP(getHP() - damage);
        }
    }


