package ru.gb.ergakov.Seminar_5;

import ru.gb.ergakov.Seminar_3.Person;

import java.util.Optional;

public class PersonRepository {
    public Optional<Person> findById(String id) {
        if (id.equals("id")) {
            return Optional.of(new Person("Timofei", 99, 100));
        }
        return Optional.empty();
    }
}
