// сравнить строки с помощью object

package Seminar3;

public class Task_1 {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "hello";
        String s3 = s1;
        String s4 = "h" + "e" + "l" + "l" + "o";
        String s5 = new String("hello");
        String s6 = new String(new char[] { 'h', 'e', 'l', 'l', 'o' });
        System.out.println(s1==s5);
        System.out.println();
        System.out.println(s1.equals(s5));
    }
}
