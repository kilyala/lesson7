package ru.geekbrains.javaLevel1;

import java.util.Scanner;

public class Main {

//    final: переменные, поля, параметры методов- гарантия, что значение не будет изменено
//    final: методы - гарантия, что метод не будет переопределён
//    final: класс - гарантия, что класс не сможет быть унаследован
//    Иммутабельный класс - класс, который нельзя изменить после создания

    public static void main(String[] args) {

    }

    public void runAll(Runnable[] runnables) {
        for (Runnable runnable : runnables) {
            runnable.canRun(100);

        }
    }


}
