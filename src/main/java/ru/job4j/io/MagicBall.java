package ru.job4j.io;

import java.util.Random;
import java.util.Scanner;

public class MagicBall {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Я великий оракул !"
                + System.lineSeparator()
                + "\t Задай любой вопрос и получишь ответ.");
        input.nextLine();
        int answer = new Random().nextInt(3);
        switch (answer) {
            case 0 :  System.out.println("Ответ на твой вопрос - Да!");
            break;
            case 1 :  System.out.println("Ответ на твой вопрос - Нет!");
                break;
            default:
                System.out.println("Ответ на твой вопрос - Может быть!");
        }
    }
}