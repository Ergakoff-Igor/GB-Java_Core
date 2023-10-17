package ru.gb.ergakov.HW_2.infrastructure;

import java.util.Random;

public class CreateRandArray {
    public static int[] createArray(int size, int min, int max) {
        Random random = new Random();
        int[] arrayNumber = new int[size];
        for (int i = 0; i < arrayNumber.length; i++) {
            arrayNumber[i] = random.nextInt(min, max);
        }
        return arrayNumber;
    }
}
