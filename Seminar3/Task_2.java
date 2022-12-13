// Заполнить список десятью случайными числами. 
// Отсортировать список методом sort() и вывести его на экран.


package Seminar3;
import java.util.Random;
import java.util.ArrayList;
public class Task_2 {
    public static void main(String[] args) {
        ArrayList<Integer> newList = createList(1, 100);
        newList.sort(null);
        System.out.println(newList.toString());
    }

    public static ArrayList<Integer> createList(int from, int to) {
        ArrayList<Integer> newList = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            newList.add(random.ints(from, to+1).findFirst().getAsInt());
            // arr.add(new Random().nextInt(100));

        }
        return newList;
    }
}
