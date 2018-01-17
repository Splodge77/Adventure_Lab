package Player.Magicians;

import Behaviours.IAttack;
import Behaviours.IDamageable;

public enum MythicalCreature {

    DRAGON(100),
    OGRE(40),
    UNICORN(250);

    private final int hitValue;

    MythicalCreature(int hitValue) {
        this.hitValue = hitValue;
    }

    public int getHitValue(){
        return this.hitValue;
    }

}

