package ru.gb.ergakov.HW_2.UI;

import ru.gb.ergakov.HW_2.infrastructure.*;
import ru.gb.ergakov.HW_2.tasks.*;

import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void buttonClick(){
        int size = 0;
        int min = 0;
        int max = 0;
        try (Scanner in = new Scanner(System.in)) {
            System.out.print("Введите размер массива: ");
            size = in.nextInt();
            System.out.print("Введите минимальное значение для автоматического заполнения: ");
            min = in.nextInt();
            System.out.print("Введите максимальное значение для автоматического заполнения: ");
            max = in.nextInt();
        } catch (Exception e) {
            System.out.println("Введено не число");
        }

        int[] arrayNumber = CreateRandArray.createArray(size, min, max);
        System.out.println("Исходный массив:");
        System.out.println(Arrays.toString(arrayNumber));
        System.out.println();
        System.out.println("Задание № 1");
        System.out.printf("Количество четных элементов в массиве -> %d\n",Task1.countEvenNumber(arrayNumber));
        System.out.println("Задание № 2");
        System.out.printf("Разница между минимальным и максимальным элементами -> %d\n",Task2.diffMinMax(arrayNumber));
        System.out.println("Задание № 3");
        OutIsDoubleZero.out(Task3.isDoubleZero(arrayNumber));

    }
}
