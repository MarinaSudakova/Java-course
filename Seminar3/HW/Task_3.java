// Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.

package Seminar3.HW;
import java.util.ArrayList;
import java.util.Random;

public class Task_3 {
    public static void main(String[] args) {
        ArrayList<Integer> newList = createList(1, 100);
        System.out.printf("Origin: %s\n", newList.toString());
        int[] res = findMinMax(newList);
        System.out.printf("Min is: %d, Max is: %d, Med is: %d", res[0], res[1], res[2]);
    }

    public static ArrayList<Integer> createList(int from, int to) {
        ArrayList<Integer> newList = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            newList.add(random.ints(from, to+1).findFirst().getAsInt());

        }
        return newList;
    }

    public static int[] findMinMax (ArrayList<Integer> myList) {
        int[] result = new int[3];
        int min = myList.get(0);
        int max = 0;
        int med = 0;
        for (int index = 0; index < myList.size(); index++) {
            if (myList.get(index) > max) {
                max = myList.get(index);
            } else if (myList.get(index) < min) {
                min = myList.get(index);
            }
            med += myList.get(index);
        }
        result[0] = min;
        result[1] = max;
        result[2] = med / myList.size();
        return result;
    }
    
}
