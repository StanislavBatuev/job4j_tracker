package ru.job4j.strategy.shape;

public class Square implements Shape {

    @Override
    public String draw() {
        String ln = System.lineSeparator();
        return    " ____ " + ln
                + "|    |" + ln
                + "|____|" + ln;
    }
}