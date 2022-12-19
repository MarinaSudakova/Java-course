package Seminar4;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * Принимает от пользователя строку вида text~num, сплити ее и ставит текст на
 * позиию
 * нам в связ список
 */
public class Task_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Write string format text~num or exit : ");
            String input = sc.next();
            if (input.equals("exit")) {
                break;
            }

            int num = Integer.parseInt(input.split("~")[1]);
            LinkedList<String> arrlink = new LinkedList<String>(Collections.nCopies(num + 1, "0"));

            String text = input.split("~")[0];
            // for(int i = 0; i <= num; i++) {
            // if(num != i) {
            // arrlink.add(i, "0");
            // }
            // else {
            // arrlink.add(i, text);
            // }
            // }

            arrlink.add(num, text);
            System.out.println(arrlink);
            if (arrlink.get(num).equals("print")) {
                System.out.println(arrlink.get(num));
                arrlink.remove(num);
            }
            System.out.println(arrlink);
        }
        sc.close();
    }

}