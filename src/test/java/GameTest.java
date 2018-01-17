import Player.Magicians.MythicalCreature;
import Player.Magicians.Spell;
import Player.Magicians.Warlock;
import Room.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GameTest {

    Game game;
    Room<Enemy> fluffy;
    Room<Treasure> treasureRoom;
    Treasure ruby;
    Enemy fluffyMonster;
    Warlock player1;

    @Before
    public void before(){
        game = new Game();
        fluffyMonster = new Enemy("Fluffy", 100, 40);
        fluffy = new Room(fluffyMonster);
        game.addRoom(fluffy);
        ruby = new Treasure();
        treasureRoom = new Room(ruby);
        player1 = new Warlock("Max", Spell.FIREBALL, MythicalCreature.DRAGON);

    }

    @Test
    public void hasTreasure(){
        assertEquals(ruby, treasureRoom.getItem());
    }

    @Test
    public void hasEnemy(){
        assertEquals(fluffyMonster, fluffy.getItem());
    }

    @Test
    public void playerCanDefeatRoom(){
        assertTrue(treasureRoom.pass());
    }

//    @Test
//    public void playerCanEnterRoom(){
//        player1.enterRoom(treasureRoom);
//
//    }
}
