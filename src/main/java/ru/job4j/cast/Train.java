package ru.job4j.cast;

public class Train implements Vehicle {
    @Override
    public void move() {
        System.out.println("Максимальная скорость поезда около 200км/ч.");
    }

    @Override
    public void carrying() {
        System.out.println("Грузоподбёмность поезда 100 тонн");
    }
}
