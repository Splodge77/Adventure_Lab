package Player.Healer;

public enum HealingTool {

    POTION(20),
    MORPHINE(10),
    HOLY_HAND_GRENADE(25);

    private final int healValue;

    HealingTool (int healValue) {
        this.healValue = healValue;
    }

    public int getHealValue(){
        return this.healValue;
    }
}
