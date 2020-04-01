public abstract class Fruit {
    private float weight;
    private static int count = 1;
    private int id;

    public Fruit(float weight) {
        this.id = count++;
        this.weight = weight;
    }

    public int getId() {
        return this.id;
    }

    public float getWeight() {
        return weight;
    }
}
