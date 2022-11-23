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
import java.io.FileWriter;
import java.io.IOException;



public class HW {
    
    public static int[] readFile(String name) throws Exception{
        int[] num = new int[2];
        try {
            BufferedReader br = new BufferedReader(new FileReader(name));
            String str;
            // int[] num = new int[2];
            while ((str = br.readLine()) != null) {
                if (str.charAt(0) == 'a') {
                    num[0] = Integer.parseInt(str.substring(2, str.length()));
                }
                if (str.charAt(0) == 'b') {
                    num[1] = Integer.parseInt(str.substring(2, str.length()));
                }
            br.close();
            // return num;
            }
        } catch (IOException e) {
            System.out.println("Error");
        }
        return num;
    }


    public static int powInt(int value, int powValue) {
        int result = 1;
        for (int i = 1; i <= powValue; i++) {
            result = result * value;
        }
        return result;
    }

    public static void writeOut(String name, int res) {
        String towrite = String.format("Result %res", res);
        try (FileWriter fw = new FileWriter(name, false)) {
            fw.write(towrite);
            fw.append('\n');
            fw.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    // public static void main(String[] args) {

    //     int[] array = readFile("input.txt");
    //     int a = array[0];
    //     int b = array[1];
    //     System.out.printf("%a , %b", a, b);
    //     int res = powInt(a, b); 
    //     System.out.println(res);
    //     writeOut("input.txt", res);
    // }
    public static void main(String[] args) throws Exception {

        int[] array = readFile("Seminar_1/input.txt");
        int a = array[0];
        int b = array[1];
        System.out.printf("%a , %b", a, b);
        int res = powInt(a, b); 
        System.out.println(res);
        writeOut("Seminar_1/output.txt", res);
    }
}
