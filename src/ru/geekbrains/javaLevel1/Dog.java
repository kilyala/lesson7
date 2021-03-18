package ru.geekbrains.javaLevel1;

public class Dog extends Animal {

    @Override
    public boolean canSwim(int distanceSwim) {
        return false;
    }

    @Override
    public boolean canRun(int distanceRun) {
        return false;
    }
}
