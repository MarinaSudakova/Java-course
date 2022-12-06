package Lesson1;

public class Task_3_1 {
    public static void main(String[] args) {
        int[] array = new int[] { 3, 2, 1, 2, 3 };
        int last = array.length - 1;
        int value = 3;
        while (last > 0 && array[last] == value)
            last--;
        for (int i = 0; i < last; i++)
            if (array[i] == value) {
                for (int j = 0; j < last; j++)
                    array[j] = array[j + 1];
                array[last] = value;
                last--;
            }
        for (int element : array)
            System.out.print(String.format("%d ", element));
    }


}

