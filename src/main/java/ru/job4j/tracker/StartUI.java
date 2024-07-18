package ru.job4j.tracker;

import ru.job4j.Item;
import java.time.LocalDateTime;

public class StartUI {
    public static void main(String[] args) {
        String name = "Stas";
        LocalDateTime current = LocalDateTime.now();
        Item item = new Item(1, name, current);
        System.out.println(item);
    }
}