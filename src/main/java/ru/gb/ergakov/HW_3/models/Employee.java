package ru.gb.ergakov.HW_3.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import ru.gb.ergakov.HW_3.Infrastructure.DateFormater;

import java.time.LocalDate;
import java.time.Period;

@Data
@AllArgsConstructor
public class Employee implements Comparable<Employee> {

    private String surname;
    private String firstName;
    private String lastName;
    private String post;
    private String phoneNumber;
    protected int salary;
    private String birthDate;

    public int getAge() {
        LocalDate birth = DateFormater.StringToLocalDateTime(birthDate);
        return Period.between(birth, LocalDate.now()).getYears();
    }

    @Override
    public String toString() {
        return String.format(
                "%-15.15s %-15.15s %-15.15s, Должность: %-15.15s, Тел. %-10.10s, ЗП: %d руб., Дата рождения: %s\n",
                this.surname, this.firstName, this.lastName, this.post,
                this.phoneNumber, this.salary, this.birthDate);
    }

    @Override
    public int compareTo(Employee o) {
        return DateFormater.StringToLocalDateTime(this.birthDate).compareTo(DateFormater.StringToLocalDateTime(o.birthDate));
    }
}

