import kindsOfAnimals.Animals;
import kindsOfAquariums.*;

import java.util.ArrayList;

public class PetStore {

    private int capacityOfAnimals;
    private int countOfAnimal = 0;
    private static int onlyOnePetStore = 0;
    private ArrayList<Aquarium> allAquariums;

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

    //Пізніше реалізувати
    public boolean deleteAnimal(Animals animals) {
        return false;
    }

    public void printInfo(ArrayList<Aquarium> all) {
        //Назва тварини   Вік тварини   Розмір тварини   Батьківський тип   Тип тварини   Розмір акваріума
        StringBuilder str = new StringBuilder("Name\t\t\tAge\tAnimal size\tParent type\tAnimal type\tAquarium size\n");
        for (int i = 0; i < all.size(); i++) {
            Aquarium tmp_aquarium = all.get(i);
            Animals tmp_animal = tmp_aquarium.getAnimal();

            str.append(tmp_animal.getInfo());
            str.append("\t\t");
            str.append(tmp_aquarium.getSize());
            str.append("\n");
        }
        System.out.println(str);


    }
}
