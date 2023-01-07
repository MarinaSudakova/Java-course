package Seminar5;

//Написать программу, определяющую правильность расстановки скобок в выражении.
// Пример 1: a+(d*3) - истина
// Пример 2: [a+(1*3) - ложь
// Пример 3: [6+(3*3)] - истина
// Пример 4: {a}[+]{(d*3)} - истина
// Пример 5: <{a}+{(d*3)}> - истина
// Пример 6: {a+]}{(d*3)} - ложь

import java.util.Stack;
import java.util.ArrayList;
import java.util.Arrays;

public class Task_5 {
    public static boolean checkParentheses(String s) {
        Stack<Character> st = new Stack<Character>();
        ArrayList<Character> parentheses = new ArrayList<Character>(
                Arrays.asList('(', ')', '[', ']', '{', '}', '<', '>'));
        for (int index = 0; index < s.length(); index++) {
            if (parentheses.contains(s.charAt(index))) {
                switch (s.charAt(index)) {
                    case '(', '[', '{', '<':
                        st.push(s.charAt(index));
                        break;
                    case ')', ']', '}', '>':
                        if (st.isEmpty())
                            return false;
                        char top = st.pop();
                        if (s.charAt(index) != parentheses.get(parentheses.indexOf(top) + 1)) {
                            return false;
                        }
                        break;
                }
            }

        }
        if (!st.isEmpty())
            return false;
        return true;
    }

    public static void main(String[] args) {

        System.out.println(checkParentheses("a+(d*3)"));
    }

}
