import kindsOfAnimals.Mollusca;
import kindsOfAnimals.MolluscaAnimals.Snail;
import kindsOfAnimals.MolluscaAnimals.Squids;

public class Main {


    public static void main(String[] args) throws Exception {
        PetStore myPetStore = new PetStore(15);

        //Додавання тваринок в зоопарк
        Squids squids = new Squids("Сквідверд", 10, 15);
        Squids squids_2 = new Squids("Сквідверд_2", 1, 5);
        Squids squids_3 = new Squids("Сквідверд_3", 8, 10);
        Squids squids_4 = new Squids("Сквідверд_4", 17, 45);

        myPetStore.addAnimal(squids);
        myPetStore.addAnimal(squids_2);
        myPetStore.addAnimal(squids_3);
        myPetStore.addAnimal(squids_4);

        Snail snail = new Snail("Равлик", 10, 15);
        Snail snail_2 = new Snail("Равлик_2", 1, 5);

        myPetStore.addAnimal(snail);
        myPetStore.addAnimal(snail_2);

        myPetStore.printInfo(myPetStore.getAllAquariums());
    }
}