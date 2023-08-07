import java.util.Scanner;

/* Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), 
и возвращает введенное значение.
 Ввод текста вместо числа не должно приводить к падению приложения, 
 вместо этого, необходимо повторно запросить у пользователя ввод данных.
 */

public class HW1 {
    public static void main(String[] args) {
        double db = getFL();
        System.out.println("Вы ввели число " + db);
    }

    public static double getFL() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите  дробное число через запятую : ");
        double num;
        String res = sc.nextLine();
        while (checknullException(res)) {
            System.out.println("Вы не ввели дробное число. Поробуйте еще раз : ");
            res = sc.nextLine();
            checknullException(res);
        }
        num = sc.nextDouble();
        sc.close();
        return num;
    }

    public static boolean checknullException(String value) {
        try {
            Double.valueOf(value);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

}

