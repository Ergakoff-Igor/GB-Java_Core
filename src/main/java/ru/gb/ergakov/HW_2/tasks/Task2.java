package ru.gb.ergakov.HW_2.tasks;
//2. Написать функцию, возвращающую разницу между самым большим и самым
//   маленьким элементами переданного не пустого массива.

public class Task2 {
    public static int diffMinMax (int [] array){
        int min = array[0];
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min){
                min = array[i];
            } else if (array[i] > max){
                max = array[i];
            }
        }
        return  max - min;
    }
}
