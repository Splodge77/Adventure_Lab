import Player.Warrior.*;
import org.junit.Before;

public class WarriorTest {

    Dwarf alison;
    Barbarian zsolt;
    Knight eric;

    @Before
    public void before(){

        alison = new Dwarf("Alison", Weapon.CROSSBOW, 500 );
        zsolt = new Barbarian("Zsolt", Weapon.CLUB, 450);
        eric = new Knight("Eric", Weapon.SWORD, 650 );

    }
}
