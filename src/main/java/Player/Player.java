package Player;

import Behaviours.IDamageable;

public abstract class Player implements IDamageable {

    private String username;
    private int hp;

    public Player(String username, int hp){
        this.username = username;
        this.hp = hp;
    }

    public String getUsername() {
        return this.username;
    }

    public int getHP() {
        return this.hp;
    }

    public void setHP(int hp) {
        this.hp = hp;
    }


}
