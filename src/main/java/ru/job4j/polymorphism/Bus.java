package ru.job4j.polymorphism;

public class Bus implements Transport {
    private int fuelLevel;
    private int passengerCount;
    private static final int MAXIMUM_SEATS = 55;

    @Override
    public void move() {
        if (fuelLevel > 0) {
            System.out.println("Автобус движется с максимальной скоростью - 60 км/ч");
            fuelLevel -= 3;
        } else {
            System.out.println("Недостаточно топлива для движения!");
        }
    }

    @Override
    public void passengers(int count) {
        if (count <= MAXIMUM_SEATS) {
            passengerCount = count;
            System.out.println("Автобус вмещает " + passengerCount + "пасажиров");
        } else {
            System.out.println("Превышено максимальное количество пасажиров - " + MAXIMUM_SEATS);
        }
    }

    @Override
    public int refuel(int fuel) {
        int costPerLiter = 50;
        fuelLevel -= fuel;
        return fuel * costPerLiter;
    }
}