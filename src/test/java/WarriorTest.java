import Player.Warrior.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WarriorTest {

    Dwarf alison;
    Barbarian zsolt;
    Knight eric;

    @Before
    public void before(){
        alison = new Dwarf("Alison", Weapon.CROSSBOW, 500 );
        zsolt = new Barbarian("Zsolt", Weapon.CLUB);
        eric = new Knight("Eric", Weapon.SWORD, 650 );
    }

    @Test
    public void hasName(){
        assertEquals("Eric", eric.getUsername());
    }

    @Test
    public void hasWeapon(){
        assertEquals(Weapon.CLUB, zsolt.getWeapon());
    }

    @Test
    public void setWeapon(){
        zsolt.setWeapon(Weapon.SWORD);
        assertEquals(Weapon.SWORD, zsolt.getWeapon());
    }

    @Test
    public void alisonAttackEric(){
        int healthValue = eric.getHP();
        alison.inflictDamage(eric);
        int hitValue = alison.getWeapon().getHitValue();
        int newHealthValue = healthValue - hitValue;
        assertEquals(newHealthValue, eric.getHP());
    }
}
