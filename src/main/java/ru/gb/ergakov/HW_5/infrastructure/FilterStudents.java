package ru.gb.ergakov.HW_5.infrastructure;

import ru.gb.ergakov.HW_5.models.Student;

import java.util.ArrayList;

public class FilterStudents {
    public static void filterInformatics (ArrayList<Student> students){
        students.stream()
                .filter((s) -> s.getSpecialty().equals("Информатика") && GetAverageGrade.getAverageGrade(s.getGrades()) > 4.5)
                .limit(5)
                .forEach(System.out::println);
    }
}
