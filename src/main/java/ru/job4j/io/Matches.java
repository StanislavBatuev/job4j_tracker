package ru.job4j.io;

import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Игра 11.");
        boolean turn = true;
        int count = 11;
        while (count > 0) {
            String payer = turn ? "первый игрок." : "второй игрок.";
            System.out.println("Ходит " + payer + " Заберите спички со стола от 1-ой до 3-х");
            int matches = Integer.parseInt(input.nextLine());
            if (matches < 1 || matches > 3) {
                System.out.println(System.lineSeparator() + "Необходимо взять только от 1-ой до 3-х");
            } else {
                turn = !turn;
                count -= matches;
                System.out.println("Всего осталось спчек: " + count);
            }
        }
        if (!turn) {
            System.out.println("Выиграл первый игрок");
        } else {
            System.out.println("Выиграл второй игрок");
        }
    }
}