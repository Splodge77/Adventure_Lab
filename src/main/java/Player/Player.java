package Player;

import Behaviours.IDamageable;

public abstract class Player implements IDamageable {

    String username;
    int hp;

    public Player(String username, int hp){
        this.username = username;
        this.hp = hp;
    }

    public String getUsername() {
        return this.username;
    }

    public void takeDamage(int damage){
        this.hp -= damage;
    }

}
