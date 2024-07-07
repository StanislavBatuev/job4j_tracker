package ru.job4j.oop;

public class Cat {
    private String food;
    private String name;

    public void giveNick(String nick) {
        this.name = nick;
    }

    public void show() {
        System.out.println(this.name + " " + this.food);
    }

    public void eat(String meat) {
        this.food = meat;
    }

    public String sound() {
        return "mayrg-mayrg!";
    }

    public static void main(String[] args) {
        Cat peppy = new Cat();
        Cat sparky = new Cat();
        Cat gav = new Cat();
        Cat black = new Cat();
        System.out.println("Peppy says - " + peppy.sound()
                + "\n"
                + "Peppy sparky - " + sparky.sound());
        System.out.println("There is gav's food.");
        gav.eat("Steak");
        gav.giveNick("Gav");
        gav.show();
        System.out.println("There is black's food.");
        black.giveNick("Black");
        black.eat("Fish");
        black.show();
    }
}