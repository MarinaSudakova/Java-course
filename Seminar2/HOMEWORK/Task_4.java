// К калькулятору из предыдущего дз добавить логирование

package Seminar2.HOMEWORK;

import java.util.Scanner;
import java.util.logging.*;

public class Task_4 {
    static Scanner scanner = new Scanner(System.in);
    static Logger logger = Logger.getLogger(Task_4.class.getName());
    // static FileHandler fh = new FileHandler("log.txt");
    static ConsoleHandler fh = new ConsoleHandler();
    static SimpleFormatter sFormatter = new SimpleFormatter();



    public static void main(String[] args) {

        int num1 = getInt();
        int num2 = getInt();
        char operation = getOperation();
        int result = calc(num1, num2, operation);
        System.out.println("Результат операции: " + result);
    }

    public static int getInt() {
        logger.addHandler(fh);
        fh.setFormatter(sFormatter);
        System.out.println("Введите число:");
        int num;
        if (scanner.hasNextInt()) {
            num = scanner.nextInt();
            logger.log(Level.INFO, "Get number");
        } else {
            System.out.println("Вы допустили ошибку при вводе числа. Попробуйте еще раз.");
            logger.log(Level.INFO, "Error");
            scanner.next();// рекурсия
            num = getInt();
        }
        return num;
    }

    public static char getOperation() {
        logger.addHandler(fh);
        fh.setFormatter(sFormatter);
        System.out.println("Введите операцию:");
        char operation;
        if (scanner.hasNext()) {
            operation = scanner.next().charAt(0);
            logger.log(Level.INFO, "Get char");
        } else {
            System.out.println("Вы допустили ошибку при вводе операции. Попробуйте еще раз.");
            logger.log(Level.INFO, "Error");
            scanner.next();// рекурсия
            operation = getOperation();
        }
        return operation;
    }

    public static int calc(int num1, int num2, char operation) {
        logger.addHandler(fh);
        fh.setFormatter(sFormatter);
        int result;
        switch (operation) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            default:
                System.out.println("Операция не распознана. Повторите ввод.");
                logger.log(Level.INFO, "Error");
                result = calc(num1, num2, getOperation());// рекурсия
        }
        logger.log(Level.INFO, "Find result");
        return result;
    }
}
