import kindsOfAnimals.ChordataAnimals.Frog;
import kindsOfAnimals.ChordataAnimals.Lizard;
import kindsOfAnimals.ChordataAnimals.Snake;
import kindsOfAnimals.MolluscaAnimals.Snail;
import kindsOfAnimals.MolluscaAnimals.Squids;

public class Main {


    public static void main(String[] args) throws Exception {
        PetStore myPetStore = new PetStore(15);

        //Додавання тваринок в зоопарк

        Squids squids = new Squids("Сквідверд", 10, 15);
        Squids squids_2 = new Squids("Сквідверд_2", 1, 5);

        myPetStore.addAnimal(squids);
        myPetStore.addAnimal(squids_2);

        Snail snail = new Snail("Равлик", 10, 15);
        Snail snail_2 = new Snail("Равлик_2", 1, 5);

        myPetStore.addAnimal(snail);
        myPetStore.addAnimal(snail_2);

        Frog frog = new Frog("Жабка", 8, 25);
        Frog frog_2 = new Frog("Жабка_2", 5, 14);

        myPetStore.addAnimal(frog);
        myPetStore.addAnimal(frog_2);

        Snake snake = new Snake("Змія", 30, 100);
        Snake snake_2 = new Snake("Змія_2", 50, 200);

        myPetStore.addAnimal(snake);
        myPetStore.addAnimal(snake_2);

        Lizard lizard = new Lizard("Ящірка", 12, 30);
        Lizard lizard_2 = new Lizard("Якщірка_2", 13, 32);

        myPetStore.addAnimal(lizard);
        myPetStore.addAnimal(lizard_2);


        PetStore.printInfo(myPetStore.getAllAquariums());

        var resOfFind = FindManager.findOlderThanFive(myPetStore.getAllAquariums());

        //Вивести результат, посортований за видом тварин.
        System.out.println("Результат, посортований за видом тварин.");
        PetStore.printInfo(new SortManager().sortByTypeAnimalInnerClassAhead(resOfFind));

        //Вивести результат, посортований за видом тварин   в зворотньому напрямку
        System.out.println("Результат, посортований за видом тварин   в зворотньому напрямку");
        PetStore.printInfo(SortManager.sortByTypeAnimalInnerClassBack(resOfFind));

        //Реалізувати можливість сортування знайдених тварин за обємом акваріуму
        System.out.println("Сортування знайдених тварин за обємом акваріуму");
        PetStore.printInfo(SortManager.sortByVolumeAhead(resOfFind));

        //Реалізувати можливість сортування знайдених тварин за обємом акваріуму    в зворотньому напрямку
        System.out.println("Сортування знайдених тварин за обємом акваріуму    в зворотньому напрямку");
        PetStore.printInfo(SortManager.sortByVolumeBack(resOfFind));

    }
}