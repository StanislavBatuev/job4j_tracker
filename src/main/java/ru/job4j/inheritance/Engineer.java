package ru.job4j.inheritance;

public class Engineer extends Profession {
    private int experience;

    public Engineer(String programLanguage, int experience, boolean degree) {
        super(degree);
        this.experience = experience;
    }
}
