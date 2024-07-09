package ru.job4j.oop;

public class Calculator {
    private static int x = 5;

    public static int minus(int y) {
        return y - x;
    }

    public int divide(int y) {
        return y / x;
    }

    public int sum(int y) {
        return x + y;
    }

    public int multiply(int y) {
        return x * y;
    }

    public int sumAllOperation(int y) {
        return minus(y) + divide(y) + sum(y) + multiply(y);
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int result = calculator.sumAllOperation(10);
        System.out.println(result);
        result = minus(100);
        System.out.println(result);
        result = calculator.divide(10);
        System.out.println(result);
        result = calculator.sum(10);
        System.out.println(result);
        result = calculator.multiply(10);
        System.out.println(result);
    }
}