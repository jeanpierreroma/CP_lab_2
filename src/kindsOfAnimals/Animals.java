package kindsOfAnimals;

public abstract class Animals{
    private final String name;
    private final int age;
    private final int sizeOfAnimal;
    public int getAge() {
        return age;
    }

    public int getSizeOfAnimal() {
        return sizeOfAnimal;
    }

    public Animals(String name, int age, int sizeOfAnimal) {
        if(name == null || name.length() == 0)
            throw new IllegalArgumentException("Ім'я не може бути пустим!");
        else
            this.name = name;

        if(age <= 0)
            throw new IllegalArgumentException("Вік не може бути недотатнім!");
        else
            this.age = age;

        if(sizeOfAnimal <= 0)
            throw new IllegalArgumentException("Розмір тварини не може бути від'ємний!");
        else
            this.sizeOfAnimal = sizeOfAnimal;
    }

    @Override
    public String toString() {
        return String.format("%-15s%-15s%-15s%-15s%-15s", name, age, sizeOfAnimal,
                super.getClass().getSuperclass().getSimpleName(), super.getClass().getSimpleName());
    }
}
