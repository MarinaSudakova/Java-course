// Дан массив nums = [3,2,2,3] и число val = 3. 
// Если в массиве есть числа, равные заданному, нужно перенести эти элементы в конец массива. 
// Таким образом, первые несколько (или все) элементов массива должны быть отличны от заданного, а остальные - равны ему.

package Lesson1;

public class Task_3 {

    public static int[] replace(int[] array, int find) {
        int temp = 0;
        int count = 0;
        for (int index = 0; index < array.length - count; index++) {
            if (array[index] == find) {
                temp = array[index];
                array[index] = array[array.length - count - 1];
                array[array.length - count - 1] = temp;
                count++;
            }
        }
        return array;
    }

    public static void printArray(int[] arr) {
        for (int index = 0; index < arr.length; index++) {
            System.out.printf("%d ", arr[index]);
        }

    }

    public static void main(String[] args) {
        int[] workArr = {4, 3, 2, 2, 1, 7, 3, 7, 8, 3};
        replace(workArr, 3);
        printArray(workArr);
    }
}
