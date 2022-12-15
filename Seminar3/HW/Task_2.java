// Пусть дан произвольный список целых чисел, удалить из него четные числа


package Seminar3.HW;
import java.util.Random;
import java.util.ArrayList;

public class Task_2 {
    public static void main(String[] args) {
        ArrayList<Integer> newList = createList(1, 100);
        System.out.printf("Origin: %s\n", newList.toString());
        newList.removeIf(i -> (i % 2 == 0));
        // deleteInts(newList);
        System.out.printf("Changed: %s", newList.toString());
    }

    public static ArrayList<Integer> createList(int from, int to) {
        ArrayList<Integer> newList = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            newList.add(random.ints(from, to+1).findFirst().getAsInt());

        }
        return newList;
    }

}
