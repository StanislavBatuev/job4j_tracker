package ru.job4j.oop;

public class Cat {
    public String sound() {
        return "mayrg-mayrg!";
    }

    public static void main(String[] args) {
        Cat peppy = new Cat();
        Cat sparky = new Cat();
        System.out.println("Peppy says - " + peppy.sound()
                + "\n"
                + "Peppy sparky - " + sparky.sound());
    }
}