package Player.Magicians;

public enum MythicalCreature {

    DRAGON(100, 700),
    OGRE(40, 600),
    UNICORN(250, 25);

    private final int hitValue;
    private final int healthValue;

    MythicalCreature(int hitValue, int healthValue) {
        this.hitValue = hitValue;
        this.healthValue = healthValue;
    }

    public int getHitValue(){
        return this.hitValue;
    }

    public int getHealthValue(){
        return this.healthValue;
    }

}

