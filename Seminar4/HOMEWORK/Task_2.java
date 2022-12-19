// Реализуйте очередь с помощью LinkedList со следующими методами:
// enqueue() - помещает элемент в конец очереди, dequeue() - возвращает первый элемент из очереди и удаляет его, 
// first() - возвращает первый элемент из очереди, не удаляя.

package Seminar4.HOMEWORK;

import java.util.LinkedList;

public class Task_2 {
    public static void main(String[] args) {
        LinkedList<Object> arrlink = new LinkedList<Object>();
        arrlink.add("Start");
        arrlink.add(2);
        arrlink.add(3);
        arrlink.add(4);
        arrlink.add(5);
        arrlink.add("End");
        System.out.println(arrlink);
        enqueue(arrlink, "to end");
        System.out.println(arrlink);
        first(arrlink);
        dequeue(arrlink);
        System.out.println(arrlink);

    }

    public static LinkedList<Object> enqueue(LinkedList<Object> myList, Object elem) {
        /*
         * помещает элемент в конец очереди
         */
        myList.addLast(elem);
        return myList;
    }

    public static LinkedList<Object> dequeue(LinkedList<Object> myList) {
        /*
         * возвращает первый элемент из очереди и удаляет его
         */
        System.out.println(myList.pollFirst());
        return myList;
    }

    public static void first(LinkedList<Object> myList) {
        /*
         * возвращает первый элемент из очереди, не удаляя
         */
        System.out.println(myList.getFirst());
        // System.out.println(myList.peek());
    }
}
