// Напишите метод, который сжимает строку. Пример: вход aaaabbbcdd.

package Seminar2;

public class Task_2 {
    public static void main(String[] args) {
        String str = "aaaabbbcdd";
        String rle = "";
        int count = 1;

        for (int index = 1; index < str.length(); index++) {
            if (str.charAt(index) == str.charAt(index - 1)) {
                count++;
            } else {
                rle = rle + str.charAt(index - 1) + count;
                count = 1;
            }
           
        }
        rle = rle + str.charAt(str.length()-1) + count; 
        System.out.println(rle);
    }
}
