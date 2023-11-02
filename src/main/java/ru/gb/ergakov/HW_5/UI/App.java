package ru.gb.ergakov.HW_5.UI;

import ru.gb.ergakov.HW_5.infrastructure.FilterStudents;
import ru.gb.ergakov.HW_5.models.Student;

import java.util.ArrayList;
import java.util.Arrays;

public class App {

    public static void buttonClick() {
        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student("Иван", new ArrayList<>(Arrays.asList(4.0, 5.0, 4.0, 5.0, 5.0, 5.0)), "Информатика"));
        students.add(new Student("Эльвира", new ArrayList<>(Arrays.asList(5.0, 5.0, 5.0, 5.0, 5.0, 5.0 , 5.0)), "Информатика"));
        students.add(new Student("Антон", new ArrayList<>(Arrays.asList(5.0, 5.0, 5.0, 5.0, 5.0)), "Математика"));
        students.add(new Student("Алексей", new ArrayList<>(Arrays.asList(4.0, 5.0, 5.0, 5.0, 4.0)), "Физика"));
        students.add(new Student("Ирина", new ArrayList<>(Arrays.asList(5.0, 5.0, 5.0, 4.0, 5.0)), "Физика"));
        students.add(new Student("Григорий", new ArrayList<>(Arrays.asList(4.0, 5.0, 5.0, 4.0, 5.0)), "Информатика"));
        students.add(new Student("Сергей", new ArrayList<>(Arrays.asList(3.0, 3.0, 3.0, 4.0, 5.0)), "Информатика"));
        students.add(new Student("Анатолий", new ArrayList<>(Arrays.asList(4.0, 5.0, 5.0, 4.0, 5.0, 5.0)), "Информатика"));
        students.add(new Student("Семён", new ArrayList<>(Arrays.asList(5.0, 5.0, 5.0, 4.0, 5.0)), "Информатика"));
        students.add(new Student("Константин", new ArrayList<>(Arrays.asList(5.0, 5.0, 5.0, 4.0, 5.0)), "Информатика"));

        FilterStudents.filterInformatics(students)
                .forEach(System.out::println);
    }
}
