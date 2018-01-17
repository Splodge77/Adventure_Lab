import Player.Healer.Cleric;
import Player.Healer.HealingTool;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HealerTest {

    Cleric cleric;

    @Before
    public void before(){
        cleric = new Cleric("Olga", HealingTool.POTION);
    }

    @Test
    public void hasName(){
        assertEquals("Olga", cleric.getUsername());
    }

    @Test
    public void hasTool(){
        assertEquals(HealingTool.POTION, cleric.getHealingTool());
    }

    @Test
    public void canSetTool(){
        cleric.setHealingTool(HealingTool.HOLY_HAND_GRENADE);
        assertEquals(HealingTool.HOLY_HAND_GRENADE, cleric.getHealingTool());
    }
}
