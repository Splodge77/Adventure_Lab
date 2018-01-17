package Room;

public class Room<T> {

    private T item;

    public Room(T item){
        this.item = item;
    }

    public T getItem() {
        return this.item;
    }
}