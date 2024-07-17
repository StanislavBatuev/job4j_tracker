package ru.job4j;

import java.util.Arrays;

public class Tracker {
    private final Item[] items = new Item[100];
    private int ids = 1;
    private int size = 0;

    public Item add(Item item) {
        item.setId(ids++);
        items[size++] = item;
        return item;
    }

    public Item[] findAll() {
        Item[] result = new Item[size];
        int resultSize = 0;
        for (int index = 0; index < size; index++) {
            if (items[index] != null) {
                result[resultSize++] = items[index];
            }
        }
        return Arrays.copyOf(result, size);
    }

    public Item[] findByName(String key) {
        Item[] result = new Item[size];
        int resultSize = 0;
        for (int index = 0; index < size; index++) {
            if (items[index].getName().equals(key)) {
                result[resultSize++] = items[index];
            }
        }
        return Arrays.copyOf(result, resultSize);
    }

    public Item findById(int id) {
        for (int index = 0; index < size; index++) {
            if (items[index].getId() == id) {
                return items[index];
            }
        }
        return null;
    }
}