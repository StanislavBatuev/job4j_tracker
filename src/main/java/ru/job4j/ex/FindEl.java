package ru.job4j.ex;

public class FindEl {
    public static int indexOf(String[] value, String key) throws ElementNotFoundException {
        int result = -1;
        for (int i = 0; i < value.length; i++) {
            if (value[i].equals(key)) {
                result = i;
                break;
            }
        }
        if (result == -1) {
            throw new ElementNotFoundException("Запрашиваемый элемент отсутствует.");
        }
        return result;
    }

    public static void main(String[] args) {
        String[] array = {"Папа", "Мама", "Сын"};
        try {
            int index = indexOf(array, "Дочь");
            System.out.println("Запрашиваемый элемент найден под индексом: " + index);
        } catch (ElementNotFoundException e) {
            e.printStackTrace();
        }
    }
}
