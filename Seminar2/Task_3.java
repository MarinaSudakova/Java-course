package Seminar2;

public class Task_3 {
    public static void main(String[] args) {
        String str = "12321";
        boolean flag = true;
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i))
                flag = false;
        }
        System.out.println(flag);

    }
}
