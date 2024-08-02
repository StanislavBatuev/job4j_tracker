package ru.job4j.strategy;

import ru.job4j.strategy.shape.Shape;
import ru.job4j.strategy.shape.Square;
import ru.job4j.strategy.shape.Triangle;

public class Paint {
    public void draw(Shape shape) {
        System.out.println(shape.draw());
    }

    public static void main(String[] args) {
        Paint context = new Paint();
        context.draw(new Triangle());
        context.draw(new Square());
    }
}