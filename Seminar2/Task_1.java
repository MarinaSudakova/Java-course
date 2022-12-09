// Дано четное число N (>0) и символы c1 и c2. Написать метод, который вернет строку длины N, 
// которая состоит из чередующихся символов c1 и c2, начиная с c1.

package Seminar2;

import java.util.Scanner;

public class Task_1 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = getInt();
        char[] arr = getChar();
        char c1 = arr[0];
        char c2 = arr[1];
        // char c1 = 'x';
        // char c2 = 'y';1
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(c1);
            sb.append(c2);
        }
        System.out.println(sb);
    }

    public static int getInt() {
        int num = 0;
        System.out.println("Введите число: ");
        num = sc.nextInt();
        // sc.close();
        return num;
    }

    public static char[] getChar() {
        Scanner sc = new Scanner(System.in);
        char[] arr = new char[2];
        for (int index = 0; index < 2; index++) {
            System.out.printf("Введите %d символ: ", index + 1);
            arr[index] = sc.next().charAt(0);
        }
        sc.close();
        return arr;
    }
}
