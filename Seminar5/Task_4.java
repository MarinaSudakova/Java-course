package Seminar5;
// перевести елое число в римское число
import java.util.LinkedHashMap;

public class Task_4 {
    public static void onTask1(Integer number) {
        LinkedHashMap<Integer, String> hashMap = new LinkedHashMap<Integer, String>();
        hashMap.put(1000, "M");
        hashMap.put(900, "CM");
        hashMap.put(500, "D");
        hashMap.put(400, "CD");
        hashMap.put(100, "C");
        hashMap.put(90, "XC");
        hashMap.put(50, "L");
        hashMap.put(40, "XL");
        hashMap.put(10, "X");
        hashMap.put(9, "IX");
        hashMap.put(5, "V");
        hashMap.put(4, "IV");
        hashMap.put(1, "I");
        while (number != 0) {
            for(int i : hashMap.keySet()) {
                while (i <= number) { //1000 <= 954
                    number -= i;
                    System.out.print(hashMap.get(i));
                }
            }
        }

    }

    public static void main(String[] args) {
        Integer number = 2022;
        onTask1(number);
        
    }
    
    
}
