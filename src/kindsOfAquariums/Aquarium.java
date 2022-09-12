package kindsOfAquariums;

import kindsOfAnimals.Animals;

public class Aquarium {
    private int size;

    private Animals animal;
    public Aquarium(Animals animal) {
        if(animal == null)
            throw new IllegalArgumentException("Поле тварина не може бути пустим!");
        else {
            this.animal = animal;
            this.size = animal.getSizeOfAnimal() - (animal.getSizeOfAnimal() % 5) + 5;
        }
    }

    public int getSize() {
        return size;
    }
    public Animals getAnimal() {
        return animal;
    }
}
