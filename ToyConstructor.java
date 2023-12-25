class ToyConstructor implements Comparable<ToyConstructor> {
    private String id;
    private int weight;

    public ToyConstructor(String id, String name, int weight) {
        this.id = id;
        this.weight = weight;
    }

    public String getId() {
        return id;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public int compareTo(ToyConstructor toy) {
        return Integer.compare(toy.getWeight(), this.weight);
    }
}
