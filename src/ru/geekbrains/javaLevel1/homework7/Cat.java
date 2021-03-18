package ru.geekbrains.javaLevel1.homework7;

public class Cat {
    private String name;
    private int appetite;
    private boolean fedUp;


    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public void eat(Plate plate) {
        fedUp = plate.decreaseFood(appetite);
        System.out.println(getName() + " ate " + appetite);
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", appetite=" + appetite +
                ", fedUp=" + fedUp +
                '}';
    }

    public String getName() {
        return name;
    }

}
