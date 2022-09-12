package kindsOfAnimals;

public abstract class Mollusca extends Animals {
    public Mollusca(String name, int age, int sizeOfAnimal) {
        super(name, age, sizeOfAnimal);
        if(age >= MAX_AGE_MOLLUSCA) {
            throw new IllegalArgumentException("Максимальний вік молюсків 100 років");
        }
    }

    @Override
    public String getInfo() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(super.getName()).append("\t\t");
        stringBuilder.append(super.getAge()).append("\t\t");
        stringBuilder.append(super.getSizeOfAnimal()).append("\t\t");
        stringBuilder.append(super.getClass().getSuperclass().getSimpleName()).append("\t");
        stringBuilder.append(super.getClass().getSimpleName()).append("\t");

        return stringBuilder.toString();
    }

}
