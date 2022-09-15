import kindsOfAquariums.Aquarium;

import java.util.ArrayList;

public class FindManager {
    public static ArrayList<Aquarium> findOlderThanFive(ArrayList<Aquarium> animalsArrayList) {
        var resList = new ArrayList<Aquarium>();
        for (Aquarium aquarium : animalsArrayList) {
            if (aquarium.getAnimal().getAge() > 5) {
                resList.add(aquarium);
            }
        }

        return resList;
    }
}
