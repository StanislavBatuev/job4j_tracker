package ru.job4j.tracker;

import ru.job4j.Item;
import ru.job4j.Tracker;

public class ReplaceAction implements UserAction {
    private final Output output;

    public ReplaceAction(Output output) {
        this.output = output;
    }

    @Override
    public String name() {
        return "Изменить заявку";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        output.println("=== Редактирование заявки ===");
        int id = input.askInt("Введите id:");
        String name = input.askStr("Введите Имя:");
        Item item = new Item(name);
        if (tracker.replace(id, item)) {
            output.println("Замена прошла успешно");
        } else {
            output.println("Ошибка замены заявки.");
        }
        return true;
    }
}
