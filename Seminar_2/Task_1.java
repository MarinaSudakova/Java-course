// Задача 1: Задайте массив из 12 элементов,
// заполненный случайными числами из промежутка [-9, 9].
// Найдите сумму отрицательных и положительных
// элементов массива.


package Seminar_2;

import java.util.Random;

public class Task_1 {
    public static int[] createArray(int size, int from, int to) {
        int[] array = new int[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            array[i] = random.ints(from, to+1).findFirst().getAsInt();}
        return array;
    }

    public static void printArray(int[] array) {
        for (int index = 0; index < array.length; index++) {
            System.out.printf("%d ", array[index]);}
    }

    public static int[] sumPosNeg(int[] array) {
        int[] result = new int[2];
        int sumPos = 0;
        int sumNeg = 0;
        for (int index = 0; index < array.length; index++) {
            if (array[index] > 0) {
                sumPos += array[index];
            } else {
                sumNeg += array[index];
            }
        }
        result[0] = sumPos;
        result[1] = sumNeg;
        return result;
    }
    public static void main(String[] args) {
        int[] arr = createArray(12, -9, 9);
        printArray(arr);
        int[] result = sumPosNeg(arr);
        System.out.printf("\nSum of positive:%d, Sum of positive:%d", result[0], result[1]);
    }
}
