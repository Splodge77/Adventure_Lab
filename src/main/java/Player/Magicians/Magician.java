package Player.Magicians;

import Behaviours.IAttack;
import Behaviours.IDamageable;
import Player.Player;

public abstract class Magician extends Player implements IAttack {

    private Spell spell;
    private MythicalCreature creature;

    public Magician(String username, int hp, Spell spell, MythicalCreature creature) {
        super(username, hp);
        this.spell = spell;
        this.creature = creature;
    }

    public void setSpell(Spell spell) {
        this.spell = spell;
    }


    public Spell getSpell() {
        return this.spell;
    }

    public MythicalCreature getCreature() {
        return this.creature;
    }

    public void setCreature(MythicalCreature creature){
        this.creature = creature;
    }


    public void inflictDamage(IDamageable character) {

    }

    public void takeDamage(int damage) {

    }
}

