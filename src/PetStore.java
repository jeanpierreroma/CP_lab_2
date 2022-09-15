import kindsOfAnimals.Animals;
import kindsOfAquariums.*;

import java.util.ArrayList;

public class PetStore {

    private final int capacityOfAnimals;
    private int countOfAnimal = 0;
    private static int onlyOnePetStore = 0;
    private final ArrayList<Aquarium> allAquariums;

    public ArrayList<Aquarium> getAllAquariums() {
        return allAquariums;
    }

    public PetStore(int capacityOfAnimals) throws Exception {
        if(onlyOnePetStore == 0) {
            this.capacityOfAnimals = capacityOfAnimals;
            allAquariums = new ArrayList<>(capacityOfAnimals);

            onlyOnePetStore++;
        }
        else
            throw new Exception("Можливий лише один зоомагазин!");
    }

    public boolean addAnimal(Animals animals) {
        boolean res = false;

        if(animals != null && countOfAnimal < capacityOfAnimals) {
            Aquarium aquarium = new Aquarium(animals);
            allAquariums.add(aquarium);

            countOfAnimal++;
            res = true;
        }

        return res;
    }

    public static void printInfo(ArrayList<Aquarium> all) {
        //Назва тварини   Вік тварини   Розмір тварини   Батьківський тип   Тип тварини   Розмір акваріума
        StringBuilder str = new StringBuilder(String.format("\n%-15s%-15s%-15s%-15s%-15s%-15s%-20s\n",
                "Name", "Age", "Animal size", "Parent type", "Animal type", "Type features", "Aquarium size"));
        for (Aquarium aquarium : all) {
            str.append(aquarium.getAnimal().toString());
            str.append(String.format("%-15s\n", aquarium.getSize()));
        }
        System.out.println(str);
    }
}
