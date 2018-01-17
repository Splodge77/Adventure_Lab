import Player.Magicians.MythicalCreature;
import Player.Magicians.Spell;
import Player.Magicians.Warlock;
import Player.Magicians.Wizard;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MagicianTest {

    Warlock amy;
    Wizard harry;

    @Before
    public void before(){
        amy = new Warlock("Amy", Spell.FIREBALL, MythicalCreature.OGRE);
        harry = new Wizard("Harry", Spell.STUPIFY, MythicalCreature.DRAGON);

    }

    @Test
    public void canChangeSpell(){
        amy.setSpell(Spell.STUPIFY);
        assertEquals(Spell.STUPIFY, amy.getSpell());
    }

    @Test
    public void canChangeCreature(){
        harry.setCreature(MythicalCreature.OGRE);
        assertEquals(MythicalCreature.OGRE, harry.getCreature());
    }
}
