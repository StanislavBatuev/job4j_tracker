package ru.job4j.cast;

public class Bus implements Vehicle {
    @Override
    public void move() {
        System.out.println("Автобус с пасажирами может развивать максимальную скорость - 60 км/ч");
    }

    @Override
    public void carrying() {
        System.out.println("Грузоподъёмность автобуса может доходить до 10 тонн.");
    }
}