package ru.job4j.oop;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.offset;

public class TriangleTest {
    @Test
    public void when00and40and04Then8() {
        Point a = new Point(0, 0);
        Point b = new Point(4, 0);
        Point c = new Point(0, 4);
        Triangle triangle = new Triangle(a, b, c);
        double result = triangle.area();
        double expected = 8;
        assertThat(result).isCloseTo(expected, offset(0.001));
    }

    @Test
    public void when00and80and08Then31Dot999() {
        Point a = new Point(0, 0);
        Point b = new Point(8, 0);
        Point c = new Point(0, 8);
        Triangle triangle = new Triangle(a, b, c);
        double result = triangle.area();
        double expected = 31.999;
        assertThat(result).isCloseTo(expected, offset(0.001));
    }

    @Test
    public void when10000and00and00ThenMinus1() {
        Point a = new Point(100, 0);
        Point b = new Point(0, 0);
        Point c = new Point(0, 0);
        Triangle triangle = new Triangle(a, b, c);
        double result = triangle.area();
        double expected = -1;
        assertThat(result).isCloseTo(expected, offset(0.001));
    }
}