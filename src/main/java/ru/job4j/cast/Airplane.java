package ru.job4j.cast;

public class Airplane implements Vehicle {
    @Override
    public void move() {
        System.out.println("Максимальная скорость пасожирского самолёта - 1350км/ч");
    }

    @Override
    public void carrying() {
        System.out.println("Грузоподъёмность пасожирского самолёта 200 тонн.");
    }
}
