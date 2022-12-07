// найти н треугольно число

package Lesson1.HW;

import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        try (Scanner tru = new Scanner(System.in)) {
            System.out.println("Enter number");
            int number = Integer.parseInt(tru.nextLine());
            tru.close();
            int res = (number + 1) * number / 2;
            System.out.printf("Result is %d", res);
        }
    }
}
