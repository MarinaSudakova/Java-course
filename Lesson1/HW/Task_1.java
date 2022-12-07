//Вывести простые числа от одного до 1000

package Lesson1.HW;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Task_1 {

    public static List<Integer> getPrimes(int count) {
        List<Integer> primes = new ArrayList<>();
        primes.add(2);
        for (int i = 3; i < count; i += 2) {
            if (isPrime(i, primes)) {
                primes.add(i);
            }
        }
        return primes;
    }

    public static boolean isPrime(int number, List<Integer> primes) {
        double sqrt = Math.sqrt(number);
        for (int n : primes) {
            if (n > sqrt) {
                return true;
            }
            if (number % n == 0) {
                return false;
            }

        }
        return true;
    }

    public static void main(String[] args) {
        try (Scanner tru = new Scanner(System.in)) {
            System.out.println("Enter number");
            int number = Integer.parseInt(tru.nextLine());
            tru.close();
            System.out.println(getPrimes(100));
        }
    }
}
