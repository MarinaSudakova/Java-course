// Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.

package Seminar4.HOMEWORK;
import java.util.LinkedList;
import java.util.Collections;


public class Task_1 {
    public static void main(String[] args) {
        LinkedList<Object> arrlink = new LinkedList<Object>();
        arrlink.add("Start");
        arrlink.add(2);
        arrlink.add(3);
        arrlink.add(4);
        arrlink.add(5);
        arrlink.add("End");
        System.out.println(arrlink.toString());
        revertList(arrlink);
        System.out.println(arrlink);
    }


    public static LinkedList<Object> revertList(LinkedList<Object> myList) {
        Collections.reverse(myList);
        return myList;
    }
            

}
