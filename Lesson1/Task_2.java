// максимальное количствео друг за другом единиц

package Lesson1;

public class Task_2 {

    public static int[] findNum(int[] array) {
        int[] info = new int[array.length];
        int count = 0;
        int temp = 0;
        for (int index = 0; index < array.length; index++) {
            for (int k = 0 + temp; k < array.length; k++) {
                if (array[k] == 1) {
                    count++;
                } else if (array[k] == 0) {
                    temp = k;
                    info[index] = count;
                    count = 0;
                }
            }  
        }
        return info;
    }

    public static int maxEl(int[] array) {
        int max = array[0];
        for (int index = 1; index < array.length; index++) {
            if (array[index] > max) {
                max = array[index]; 
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] arr = {1, 1, 0, 1, 1, 1, 1};
        int[] elements = findNum(arr);
        System.out.println(elements);
        int max = maxEl(elements);
        System.out.println(max);
    }
}
