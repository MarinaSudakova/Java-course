// Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл.

package Seminar2.HOMEWORK;


import java.util.logging.*;

public class Task_2 {
    public static void main(String[] args) {
        int[] array = { 5, 7, 15, 44, 78, 3, 6 };
        sortArr(array);
        printArr(array);

    }

    public static int[] sortArr(int[] array) {
        String mes = " ";
        int temp = 0;
        int findInd = 0;
        for (int index = 0; index < array.length; index++) {
            int max = 0;
            for (int j = 0; j < array.length - index; j++) {
                if (array[j] > max) {
                    max = array[j];
                    findInd = j;
                }
            }
            mes = String.format("Find max %d", max);
            loggs(mes);
            temp = max;
            array[findInd] = array[array.length - index - 1];
            array[array.length - index - 1] = temp;
            mes = String.format("Change %d with %d", array[findInd], array[array.length - index - 1]);
            loggs(mes);
        }
        return array;

    }

    public static void printArr(int[] arr) {
        for (int index = 0; index < arr.length; index++) {
            System.out.println(arr[index]);
        }
    }

    public static void loggs(String mes) {

        Logger logger = Logger.getLogger(Task_2.class.getName());
        ConsoleHandler fh = new ConsoleHandler();
        logger.addHandler(fh);
        SimpleFormatter sFormat = new SimpleFormatter();
        fh.setFormatter(sFormat);
        logger.log(Level.INFO, mes);

    }
}
