package Player.Healer;

import Player.Player;

public class Cleric extends Player {

    private HealingTool tool;

    public Cleric(String username, HealingTool tool) {
        super(username, 215);
        this.tool = tool;
    }

    public HealingTool getHealingTool() {
        return this.tool;
    }

    public void setHealingTool(HealingTool tool) {
        this.tool = tool;
    }


    public void takeDamage(int damage) {

    }
}

