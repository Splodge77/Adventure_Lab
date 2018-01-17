import java.util.ArrayList;

import Player.*;
import Room.*;

public class Game {

    ArrayList<Room> rooms;
    ArrayList<Player> players;

    public Game(){
        rooms = new ArrayList<>();
        players = new ArrayList<>();

    }

    public void addRoom(Room newRoom) {
        this.rooms.add(newRoom);
    }

    public void addPlayer(Player newPlayer){
        this.players.add(newPlayer);
    }
}
