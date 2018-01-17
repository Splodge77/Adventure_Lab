package Room;

public class Room<T> {

    private T item;

    public Room(T item){
        this.item = item;
    }

    public T getItem() {
        return this.item;
    }

    public boolean pass(){
        if (this.item instanceof Treasure){
            ((Treasure) this.item).findTreasure();
            return true;
        } else {
            if (this.item instanceof Enemy) {
                if (((Enemy) this.item).getHP() <= 0) {
                    return true;
                }
            }
        }

        return false;
    }
}