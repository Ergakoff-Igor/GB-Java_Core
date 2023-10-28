package ru.gb.ergakov.HW_3.UI;

import ru.gb.ergakov.HW_3.models.Director;
import ru.gb.ergakov.HW_3.models.Employee;

import java.util.Arrays;

public class App {

    public void buttonClick (){
        Employee[] company = new Employee[]{
                new Employee("Иванов", "Иван", "Иванович", "Разработчик", "123456789", 100_000, "1992-07-30"),
                new Employee("Сергеев", "Сергей", "Сергеевич", "Тимлид", "987654321", 200_000, "1963-09-10"),
                new Employee("Екатеринова", "Екатерина", "Владимировна", "Аналитик", "369852147", 80_000, "1995-01-28"),
                new Employee("Антонов", "Антон", "Антонович", "Скрам-мастер", "147852369", 150_000, "1986-05-25"),
                new Employee("Щетина", "Семён", "Иванович", "Дизайнер", "951357852", 90_000, "1975-12-30"),
                new Director("Щербак", "Константин", "Игоревич", "Руководитель", "951357465", 300_000, "1970-01-01")
        };

        System.out.println("Исходный массив:");
        System.out.println(Arrays.toString(company));

        System.out.println("После сортировки:");
        Arrays.sort(company);
        System.out.println(Arrays.toString(company));

        System.out.println("После поднятия ЗП:");
        System.out.println(Arrays.toString(Director.increaseSalary(company)));


    }
}
