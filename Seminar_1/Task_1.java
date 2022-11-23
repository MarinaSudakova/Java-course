// На вход некоторому исполнителю
// подаётся два числа (a, b).

// У исполнителя есть две команды
// - команда 1 (к1): увеличить в с раз (xC), а умножается на c
// - команда 2 (к2): увеличить на d ( +d ), к a прибавляется d
// написать программу, которая выдаёт общее количество
// возможных преобразований a в b.

// a < b; a, b, c, d - натуральные

// Пример 1: а = 2, b = 7, c = 2, d = 1 ответ 3

// Подумать как можно показать хотя бы один маршрут преобразования

// ответ: (+1) (x2) (+1) или (х2) (+1) (+1) (+1)
// Пример 2: а = 11, b = 7, c = 2, d = 1
// ответ: нет решения.



package Seminar_1;
import java.util.Scanner;

public class Task_1 {
    
    static int taskOne(int a, int b){
        int c = 2;
        int d = 1;
        if (a == b) return 1;
        if (a > b) return 0;
        else return taskOne(a+d, b) + taskOne(a*c, b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("int a:");
        int a = sc.nextInt();
        System.out.println("int b:");
        int b = sc.nextInt();
        sc.close();
        System.out.println(taskOne(a,b) );
    }
}
