// Напишите метод, который составит строку, состоящую из 100 повторений слова 
// TEST и метод, который запишет эту строку в простой текстовый файл, обработайте исключения.

package Seminar2;
import java.io.FileWriter;
import java.io.IOException;

public class Task_4 {
    public static void main(String[] args) {
        String s = name();
        writeIn(s);

    }

    public static String name() {
        String c1 = "TEST";
        int n = 100;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(c1);
        }
        System.out.println(sb);
        return c1;
    }

    public static void writeIn(String toWrite) {
        try (FileWriter fw = new FileWriter("in.txt", false)) {
            fw.write(toWrite);
            fw.flush();
            fw.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
