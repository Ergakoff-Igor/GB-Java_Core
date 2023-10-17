package ru.gb.ergakov.HW_2.tasks;

//3. Написать функцию, возвращающую истину, если в переданном
//   массиве есть два соседних элемента, с нулевым значением.
public class Task3 {
    public static boolean isDoubleZero(int[] array) {
        for (int i = 1; i < array.length; i++) {
            if (array[i] == 0 && array[i - 1] == 0) {
                return true;
            }
        }
        return false;
    }
}
