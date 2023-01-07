package Seminar5;
import java.util.HashMap;
// Написать метод, который переведет число из римского формата записи в арабский.
// Например, MMXXII = 2022

public class Task_3 {
    public static void onTask1(String arab) {
        String[] arr = arab.split("");
        HashMap<String, Integer> hashMap = new HashMap<String, Integer>();
        hashMap.put("M", 1000);
        hashMap.put("D", 500);
        hashMap.put("C", 100);
        hashMap.put("L", 50);
        hashMap.put("X", 10);
        hashMap.put("V", 5);
        hashMap.put("IV", 4);
        hashMap.put("IX", 9);
        hashMap.put("XL", 40);
        hashMap.put("XC", 90);
        hashMap.put("CD", 400);
        hashMap.put("CM", 900);
        hashMap.put("I", 1);
        int sum = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr.length-1 > i) {
                if (hashMap.containsKey(arr[i] + arr[i + 1])) {
                    sum+=hashMap.get(arr[i] + arr[i+1]);
                    i+=1;
                }
                else {
                    sum+=hashMap.get(arr[i]);
                }
            }
            else {
                sum+=hashMap.get(arr[i]);
            }
        }
        System.out.println(sum);


    }

    public static void main(String[] args) {
        String arab = "MMXXII";
        onTask1(arab);
        
    }
    
}
