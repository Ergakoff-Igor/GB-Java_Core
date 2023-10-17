package ru.gb.ergakov.Seminar_2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
//        int[] arrayNumber = createArray();
//        System.out.println(Arrays.toString(arrayNumber));
//        System.out.printf("Максимально число %d\n", searchMax(arrayNumber));
//        System.out.printf("Минимальное число %d", searchMin(arrayNumber));
//        printArray(task_2(10));
//        int[] newArray = task_4(arrayNumber, 5);
//        System.out.println(Arrays.toString(newArray));
        RandomSet randomSet = new RandomSet();
        randomSet.add(3);
        randomSet.add(2);
        randomSet.add(1);
        randomSet.add(4);
        randomSet.add(5);
        System.out.println(randomSet.contains(5));
        System.out.println(randomSet.getRandom());
        randomSet.remove(1);


    }
//    Задать одномерный массив. Написать методы поиска в нём
//    минимального и максимального элемента;

    public static int[] createArray() {
        Random random = new Random();
        int[] arrayNumber = new int[6];
        for (int i = 0; i < arrayNumber.length; i++) {
            arrayNumber[i] = random.nextInt(1, 5);
        }
        return arrayNumber;
    }

    public static int searchMax(int[] arrayNumber) {
        int max = arrayNumber[0];
        for (int i = 1; i < arrayNumber.length; i++) {
            if (max < arrayNumber[i]) {
                max = arrayNumber[i];
            }
        }
        return max;
    }

    public static int searchMin(int[] arrayNumber) {
        int min = arrayNumber[0];
        for (int i = 1; i < arrayNumber.length; i++) {
            if (min > arrayNumber[i]) {
                min = arrayNumber[i];
            }
        }
        return min;
    }

    //    Задача: Создать квадратный целочисленный массив (количество строк и
//            столбцов одинаковое), заполнить его диагональные элементы единицами,
//    используя цикл(ы)
    public static int[][] task_2(int size) {
        int[][] numberArray = new int[size][size];
        for (int i = 0, j = numberArray.length - 1; i < size; i++, j--) {
            numberArray[i][i] = 1;
            numberArray[i][j] = 1;
        }
        return numberArray;
    }

    public static void printArray(int[][] numberArray) {
//        for (int i = 0; i < numberArray.length; i++) {
//            for (int j = 0; j < numberArray.length; j++) {
//                System.out.print(numberArray[i][j]);
//            }
//            System.out.println();
//        }
        for (int[] row : numberArray) {
            System.out.println(Arrays.toString(row));
        }
    }

    //    Задача: Написать метод, в который передается не пустой одномерный
//    целочисленный массив, метод должен вернуть true если в массиве есть
//    место, в котором сумма левой и правой части массива равны. Примеры:
//    checkBalance([1, 1, 1, || 2, 1]) → true,
//    checkBalance([2, 1, 1, 2, 1]) → false,
//    checkBalance([10, || 1, 2, 3, 4]) → true.
//    Абстрактная граница показана символами ||, эти символы в массив не
//    входят.
    public static boolean task_3(int[] numberArray) {
        int sum = Arrays.stream(numberArray).sum();
        // проходим по массиву ещё раз и собираем сумму на каждой итерации (правую часть массива)
        int rightSum = 0;
        for (int i = 0; i < numberArray.length; i++) {
            // добавляем текущее значение в сумму правой части
            rightSum += numberArray[i];
            // вычитаем из суммы всего массива, сумму текущей правой части,
            // и если они равны, значит баланс найден.
            if (rightSum == sum - rightSum) {
                return true;
            }
        }
        return false;
    }

    public static int[] task_4(int[] numberArray, int number) {
        int[] newArray = new int[numberArray.length + 1];
        newArray[numberArray.length] = number;
        System.arraycopy(numberArray, 0, newArray, 0, numberArray.length);
        return newArray;
    }
//    Написать структуру данных, хранящую целые числа и поддерживающую следующие операции:
//    добавление значения в множество
//    проверка есть ли значение в множестве
//    удаление значения из множества
//    получение равномерно случайного значения из множества.
//    все операции O(1)

}

class RandomSet {
    HashSet<Integer> hashSet = new HashSet<>();

    public void add(int val) {
        hashSet.add(val);
    }


    public boolean contains(int val) {
        int size = hashSet.size();
        hashSet.add(val);
        if (hashSet.size() == size)
            return true;
        else return false;
    }

    public int getRandom() {
        Integer[] arr = hashSet.toArray(new Integer[hashSet.size()]);
        Random random = new Random();
        return arr[random.nextInt(hashSet.size())];
    }

    public void remove(int val) {
        if (contains(val) == true)
            hashSet.remove(val);
        else System.out.println("Такого значения нету");
    }
}
