// Реализовать функцию возведения числа а в степень b. a, b ∈ Z. Сводя количество выполняемых действий к минимуму.
// Пример 1: а = 3, b = 2, ответ: 9
// Пример 2: а = 2, b = -2, ответ: 0.25
// Пример 3: а = 3, b = 0, ответ: 1
// Пример 4: а = 0, b = 0, ответ: не определено
// Пример 5
// входные данные находятся в файле input.txt в виде
// b 3
// a 10
// Результат нужно сохранить в файле output.txt
// 1000

package Seminar_1;

import java.io.*;
import java.io.IOException;

public class HW1 {

    public static int[] readFile(String name) throws Exception {
        int[] num = new int[2];
        BufferedReader br = new BufferedReader(new FileReader(name));
        try {
            String str;
            while ((str = br.readLine()) != null) {
                str = str.replace(" ", "");
                if (str.charAt(0) == 'a') {
                    num[0] = Integer.parseInt(str.substring(1));
                } else if (str.charAt(0) == 'b') {
                    num[1] = Integer.parseInt(str.substring(1));
                }
            }
        } catch (IOException e) {
            System.out.println("Error");
        }
        br.close();
        return num;
    }

    public static String powInt(int value, int powValue) {
        String out = "";
        double result = value;
        if (powValue > 1) {
            for (int i = 1; i < powValue; i++) {
                result = result * value;
                out = String.format("Result %s", result);
            }

        } else if (powValue < 0) {
            for (int i = 1; i >= powValue; i--) {
                result = result / value;
                out = String.format("Result %s", result);
            }

        } else if (powValue == 0 & value != 0) {
            out = "Result 1";
        } else if (powValue == 0 & value == 0) {
            out = "Not possible";
        }
        return out;
    }

    public static void writeOut(String name, String res) {
        try (FileWriter fw = new FileWriter(name, false)) {
            fw.write(res);
            fw.append('\n');
            fw.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static void main(String[] args) throws Exception {

        int[] array = readFile("Seminar_1/input.txt");

        int a = array[0];

        int b = array[1];

        System.out.printf("a %d , b %d\n", a, b);

        String result = powInt(a, b);

        System.out.println(result);

        writeOut("Seminar_1/output.txt", result);

    }

}
