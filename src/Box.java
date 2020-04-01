import java.util.ArrayList;
import java.util.Collection;

public class Box <E extends Fruit> {
    private float weight;
    private ArrayList<E> list;

    public static <E extends Fruit> Box<E> getOneBox () {
        Box box = new Box();
        box.list = new ArrayList<E>();
        box.weight = 0;
        return box;
    }

    public void addFruit (E e) {
        this.list.add(e);
        this.weight += e.getWeight();
    }

    public void pourOutFruits (Box<E> anotherBox) {
        anotherBox.list.addAll(list);
        for (E e : this.list) {
            anotherBox.weight += e.getWeight();
        }
        this.list.clear();
        this.weight = 0;
    }

    public float getWeight() {
        return weight;
    }

    public boolean compare(Box<?> anotherBox) {
        return (this.weight == anotherBox.weight);
    }
}
