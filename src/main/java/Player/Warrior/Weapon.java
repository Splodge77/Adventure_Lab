package Player.Warrior;

public enum Weapon {

    CROSSBOW(20),
    CLUB(10),
    SWORD(25);

    private final int hitValue;

    Weapon(int hitValue) {
        this.hitValue = hitValue;
    }

    public int getHitValue(){
        return this.hitValue;
    }
}
