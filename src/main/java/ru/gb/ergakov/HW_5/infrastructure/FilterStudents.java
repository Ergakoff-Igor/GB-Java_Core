package ru.gb.ergakov.HW_5.infrastructure;

import ru.gb.ergakov.HW_5.models.Student;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class FilterStudents {

    public static ArrayList<Student> filterInformatics (ArrayList<Student> students){
        return (ArrayList<Student>) students.stream()
                .filter((s) -> s.getSpecialty().equals("Информатика") && s.getAverGrade() > 4.5)
                .limit(5)
                .sorted((o1, o2) -> -o1.getAverGrade().compareTo(o2.getAverGrade()))
                .collect(Collectors.toList());
    }
}
