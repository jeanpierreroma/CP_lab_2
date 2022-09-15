package kindsOfAnimals;

public abstract class Mollusca extends Animals {
    private final boolean isPredator;
    public Mollusca(String name, int age, int sizeOfAnimal, boolean isPredator) {
        super(name, age, sizeOfAnimal);
        this.isPredator = isPredator;
    }

    @Override
    public String toString() {
        return super.toString() + String.format("%-20s", "Predator: " + isPredator);
    }
}
