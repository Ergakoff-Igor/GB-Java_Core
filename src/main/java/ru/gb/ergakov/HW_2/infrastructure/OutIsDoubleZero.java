package ru.gb.ergakov.HW_2.infrastructure;

public class OutIsDoubleZero {
    public static void out (boolean isDoubleZero){
        if (isDoubleZero){
            System.out.println("В переданном массиве есть два соседних элемента, с нулевым значением.");
        } else {
            System.out.println("В переданном массиве нет двух соседних элемента, с нулевым значением.");
        }
    }
}
