package ru.gb.ergakov.HW_4;

import ru.gb.ergakov.HW_4.task_1.InputLoginPassword;
import ru.gb.ergakov.HW_4.task_2.App;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задание № 1");
        System.out.println(InputLoginPassword.input());
        System.out.println("Задание № 2");
        new App().buttonClick();


    }
}
