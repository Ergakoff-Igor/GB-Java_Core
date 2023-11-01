package ru.gb.ergakov.HW_5.models;

import lombok.*;

import java.util.List;

import static java.util.stream.Collectors.joining;

@Getter
@Setter
@AllArgsConstructor
public class Student {
    private String name;
    private List<Double> grades;
    private String specialty;

    @Override
    public String toString() {
        return String.format("Имя: %-15.15s Оценки: %-30.30s Предмет: %-15.15s", name, gradesToString(), specialty);
    }

    private String gradesToString(){
        return grades.stream()
                .map(item -> " " + item)
                .map(s -> s.replace(".0", ""))
                .collect(joining("; "));
    }
}
