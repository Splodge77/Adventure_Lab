import Player.Magicians.MythicalCreature;
import Player.Magicians.Spell;
import Player.Magicians.Warlock;
import org.junit.Before;

import Room.Room;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RoomTest {

    Room<Warlock> room;
    Warlock warlock;

    @Before
    public void before() {
        warlock = new Warlock("Enemy", Spell.LIGHTNING, MythicalCreature.UNICORN);
        room = new Room(warlock);
    }

    @Test
    public void hasItem() {
        assertEquals(warlock, room.getItem());
    }
}
