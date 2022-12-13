// Заполнить список названиями планет Солнечной системы в произвольном порядке с повторениями. 
// Вывести название каждой планеты и количество его повторений в списке.

package Seminar3;

import java.util.ArrayList;
import java.util.Random;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.function.Function;

public class Task_3 {
    public static void main(String[] args) {
        ArrayList<String> earth = earth1(15);
        System.out.println(earth.toString());
        System.out.println();
        find(earth);

        // Map<String, Long> frequency = earth.stream().collect(Collectors.groupingBy(
        // Function.identity(), Collectors.counting()));

        // frequency.forEach((k, v) -> System.out.println(k + ": " + v));
    }

    public static ArrayList<String> earth1(int count) {
        ArrayList<String> earth = new ArrayList<>();
        Random random = new Random();
        String[] variants = { "Earth", "Mars", "Venera", "Uran", "Neptun", "Jupiter", "Mercury", "Saturn" };
        for (int index = 0; index < count; index++) {
            earth.add(variants[random.nextInt(variants.length)]);
        }
        return earth;
    }

    public static void find(ArrayList<String> earth) {
        // ArrayList<String> earth = earth1(15);
        String[] variants = { "Earth", "Mars", "Venera", "Uran", "Neptun", "Jupiter", "Mercury", "Saturn" };
        int count = 0;
        for (String item : variants) {
            for (int index = 0; index < earth.size(); index++) {
                if (item.equals(earth.get(index))) {
                    count++;
                }
            }
            System.out.printf("%s: %d\n", item, count);
            count = 0;
        }
    }
}
