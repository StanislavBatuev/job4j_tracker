package ru.job4j.tracker.action;

import ru.job4j.Tracker;
import ru.job4j.tracker.input.Input;

public interface User {
    String name();

    boolean execute(Input input, Tracker tracker);
}