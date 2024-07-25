package ru.job4j.cast;

public class TotalAnalysis {
    public static void main(String[] args) {
        Vehicle train = new Train();
        Vehicle airplane = new Airplane();
        Vehicle bus = new Bus();
        Vehicle[] vehicles = new Vehicle[]{train, airplane, bus};
        for (Vehicle obj : vehicles) {
            obj.move();
            obj.carrying();
        }
    }
}