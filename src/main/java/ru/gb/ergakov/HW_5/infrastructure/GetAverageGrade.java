package ru.gb.ergakov.HW_5.infrastructure;

import java.util.List;

public class GetAverageGrade {
    public static double getAverageGrade(List<Double> grades) {
        return grades.stream()
                .mapToDouble(n -> n)
                .average()
                .orElseThrow();
    }
}
