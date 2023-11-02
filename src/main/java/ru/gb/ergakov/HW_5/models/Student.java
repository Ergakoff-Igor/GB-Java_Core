package ru.gb.ergakov.HW_5.models;

import lombok.*;

import java.util.List;

import static java.util.stream.Collectors.joining;

@Getter
@Setter
public class Student {
    private String name;
    private List<Double> grades;
    private String specialty;
    private Double averGrade;

    public Student (String name, List<Double> grades, String specialty){
        this.name = name;
        this.grades = grades;
        this.specialty = specialty;
        this.averGrade = getAverageGrade(grades);
    }

    private double getAverageGrade(List<Double> grades) {
        return grades.stream()
                .mapToDouble(n -> n)
                .average()
                .orElseThrow();
    }

    private String gradesToString(){
        return grades.stream()
                .map(item -> " " + item)
                .map(s -> s.replace(".0", ""))
                .collect(joining("; "));
    }

    @Override
    public String toString() {
        return String.format("Имя: %-15.15s Оценки: %-30.30s Специальность: %-15.15s Средний балл: %.1f", name, gradesToString(), specialty, averGrade);
    }
}
