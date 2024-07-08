package ru.job4j.oop;

public class Jar {
    private int value;
    private String mark;

    public Jar(int size, String mark) {
        this.value = size;
        this.mark = mark;
    }

    public void pour(Jar another) {
        this.value += another.value;
        another.value = 0;
    }

    public static void main(String[] args) {
        Jar first = new Jar(10, "Вода");
        Jar second = new Jar(5, "Масло");
        System.out.println("first : " + first.value + " " + first.mark + ". second : " + second.value + " " + second.mark);
        first.pour(second);
        System.out.println("first : " + first.value + ". second : " + second.value);

    }
}