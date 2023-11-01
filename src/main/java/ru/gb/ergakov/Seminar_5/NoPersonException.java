package ru.gb.ergakov.Seminar_5;

import ru.gb.ergakov.Seminar_3.Person;

public class NoPersonException extends RuntimeException {
    public NoPersonException(String id) {
        super("Отстуствует пользователь с id " + id);
    }
}
