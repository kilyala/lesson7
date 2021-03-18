package ru.geekbrains.javaLevel1.homework7;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public boolean decreaseFood(int countEatenFood) {
        if (hasEnoughFood(countEatenFood)) {
            food -= countEatenFood;
            return true;
        }
        return false;
    }

    private boolean hasEnoughFood(int requiredCountFood) {
        return food >= requiredCountFood;
    }

    public void addFood (int countFood) {
        food += countFood;
    }
    public void info () {
        System.out.println("Plate " + food);
    }

}

