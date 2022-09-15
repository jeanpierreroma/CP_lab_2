import kindsOfAquariums.Aquarium;

import java.util.ArrayList;
import java.util.Comparator;

public class SortManager {


    class InnerSort implements Comparator<Aquarium> {
        @Override
        public int compare(Aquarium o1, Aquarium o2) {
            return o1.getAnimal().getClass().getSimpleName().compareTo(o2.getAnimal().getClass().getSimpleName());
        }
    }

    static class StaticInnerSort implements Comparator<Aquarium> {
        @Override
        public int compare(Aquarium o1, Aquarium o2) {
            return o2.getAnimal().getClass().getSimpleName().compareTo(o1.getAnimal().getClass().getSimpleName());
        }
    }

    //Через внутрішній клас (Сортує тип тварини)
    public ArrayList<Aquarium> sortByTypeAnimalInnerClassAhead(ArrayList<Aquarium> aquariumArrayList) {
        var resList = new ArrayList<>(aquariumArrayList);

        resList.sort(new InnerSort());

        return resList;
    }

    //Через статичний клас (Сортує тип тварини в зворотньому напрямку)
    public static ArrayList<Aquarium> sortByTypeAnimalInnerClassBack(ArrayList<Aquarium> aquariumArrayList) {
        var resList = new ArrayList<>(aquariumArrayList);

        resList.sort(new StaticInnerSort());

        return resList;
    }

    //Анонімний клас (Сортує об'єм акваріума)
    public static ArrayList<Aquarium> sortByVolumeAhead(ArrayList<Aquarium> aquariumArrayList) {
        var resList = new ArrayList<>(aquariumArrayList);

        resList.sort(new Comparator<>() {
            @Override
            public int compare(Aquarium o1, Aquarium o2) {
               return o1.getSize() - o2.getSize();
            }
        });

        return resList;
    }

    //Використовуючи лямбда-вираз (Сортує об'єм акваріума в зворотньому напрямку)
    public static ArrayList<Aquarium> sortByVolumeBack(ArrayList<Aquarium> aquariumArrayList) {
        var resList = new ArrayList<>(aquariumArrayList);

        resList.sort((Aquarium a1, Aquarium a2) -> a2.getSize() - a1.getSize());

        return resList;
    }
}
