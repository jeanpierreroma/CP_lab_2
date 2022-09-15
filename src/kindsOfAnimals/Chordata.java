package kindsOfAnimals;

public abstract class Chordata extends Animals {

    private final int countOfLegs;
    public Chordata(String name, int age, int sizeOfAnimal, int countOfLegs) {
        super(name, age, sizeOfAnimal);
        this.countOfLegs = countOfLegs;
    }

    @Override
    public String toString() {
        return super.toString() + String.format("%-20s", "Legs: " + countOfLegs);
    }
}
