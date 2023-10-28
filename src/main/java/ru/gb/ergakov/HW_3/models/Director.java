package ru.gb.ergakov.HW_3.models;

public class Director extends Employee{
    public Director(String surname, String firstName, String lastName, String post, String phoneNumber, int salary, String birthDate) {
        super(surname, firstName, lastName, post, phoneNumber, salary, birthDate);
    }

    public static Employee[] increaseSalary(Employee[] company) {
        for (Employee employee:
                company) {
            if (employee.getAge() >= 45 && employee.getClass() != Director.class){
                employee.salary += 5000;
            }
        }
        return company;
    }
}
