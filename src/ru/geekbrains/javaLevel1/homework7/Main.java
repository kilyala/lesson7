package ru.geekbrains.javaLevel1.homework7;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Cat[] hungryCats = { new Cat("Tom", 10), new Cat("Bob", 20),
                new Cat("Fatman", 50), new Cat("Jim", 30) };

        Plate plate = new Plate(100);

        System.out.println(Arrays.toString(hungryCats));
        for (Cat cat : hungryCats) {
            cat.eat(plate);
            plate.info();
        }
        System.out.println(Arrays.toString(hungryCats));
        plate.addFood(50);
        plate.info();
    }
}
