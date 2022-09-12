package kindsOfAnimals;

public abstract class Animals implements Actions{

    public static final int MAX_AGE_MOLLUSCA = 100;
    public static final int MAX_AGE_CHORDATA = 50;
    public static final int MAX_AGE_Arthropoda = 70;

    private String name;
    private int age;
    private int sizeOfAnimal;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getSizeOfAnimal() {
        return sizeOfAnimal;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    protected void setSizeOfAnimal(int sizeOfAnimal) {
        this.sizeOfAnimal = sizeOfAnimal;
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
}
