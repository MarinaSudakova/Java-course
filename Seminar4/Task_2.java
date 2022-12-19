// Реализовать консольное приложение, которое:
// Принимает от пользователя и “запоминает” строки.
// Если введено print, выводит строки так, чтобы последняя введенная была первой в списке, а первая - последней.
// Если введено revert, удаляет предыдущую введенную строку из памяти.

package Seminar4;

import java.util.Scanner;
import java.util.LinkedList;

public class Task_2 {
    public static void main(String[] args) {
        LinkedList<String> arrlink = new LinkedList<String>();

        Scanner sc = new Scanner(System.in);
            
        while (true) {
            System.out.println("Write string or print,or revert, or exit : ");
            String input = sc.next();

            if (input.equals("exit")) {
                System.out.println(arrlink);
                break;
            } else if (input.equals("print")) {
                System.out.println(arrlink);
            } else if (input.equals("revert")) {
                if (arrlink.size() > 0) {
                    arrlink.removeFirst();
                    System.out.println(arrlink);
                } else {
                    System.out.println("List is empty");
                }
            }
            arrlink.addFirst(input);

        }
        sc.close();
    }

}
