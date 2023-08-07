import java.util.Scanner;

/* Разработайте программу, которая выбросит Exception, 
когда пользователь вводит пустую строку. 
Пользователю должно показаться сообщение, что пустые строки вводить нельзя.
 */

public class HW2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите  любое значение : ");
        String anwser = sc.nextLine();
        sc.close();
        if (anwser.isEmpty()) {
            throw new NullPointerException(" Пустая строка (((");
        } else {
            System.out.println("Вы ввели " + anwser);
        }
        }
            
    }

