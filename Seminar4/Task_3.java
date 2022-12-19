// 1) Написать метод, который принимает массив элементов, помещает их в стэк и выводит на консоль содержимое стэка.
// 2) Написать метод, который принимает массив элементов, помещает их в очередь и выводит на консоль содержимое очереди.


package Seminar4;
import java.util.Stack;
import java.util.LinkedList;
import java.util.Queue;

public class Task_3 {
    public static void customStack(Object[] arr) {
        Stack<Object> st = new Stack<Object>();
        for (Object elem : arr) {
            st.push(elem);
        }
        while(!st.empty()) {
            System.out.println(st.pop());
        }
        
    }

    public static void customQAdd(Object[] arr) {
        Queue<Object> q = new LinkedList<Object>();
        for (Object elem : arr) {
            q.add(elem);
        }
        while(q.size() > 0) {
            System.out.println(q.poll());
        }
        
    }
    public static void main(String[] args) {
        Object[] arr = {1, 2, 3, 4, "End"};
        customStack(arr);
        System.out.println();
        customQAdd(arr);

    }
    
}
