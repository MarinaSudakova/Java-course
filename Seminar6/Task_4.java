// 1. Создайте множество, в котором будут храниться экземпляры класса Cat - HashSet<Cat>. 
// Поместите в него некоторое количество объектов.
// 2. Создайте 2 или более котов с одинаковыми параметрами в полях. 
// Поместите их во множество. Убедитесь, что все они сохранились во множество.
// 3. Создайте метод public boolean equals(Object o)
// Пропишите в нём логику сравнения котов по параметрам, хранимым в полях. 
// То есть, метод должен возвращать true, только если значения во всех полях сравниваемых объектов равны.
// 4. Создайте метод public int hashCode()
// который будет возвращать hash, вычисленный на основе полей класса Cat. (Можно использовать Objects.hash(...))
// 5. Выведите снова содержимое множества из пункта 2, убедитесь, что дубликаты удалились

package Seminar6;

import java.util.HashSet;

public class Task_4 {
    public static void main(String[] args) {
        Pets cat1 = new Pets("Барсик", 30, "сиамский", "светлый");
        Pets cat2 = new Pets("Василий", 10, "невский", "серый");
        Pets cat3 = new Pets("Игнат", 5, "персидский", "рыжий");
        Pets cat4 = new Pets("Барсик", 30, "сиамский", "светлый");

        HashSet<Pets> cats = new HashSet<Pets>();
        cats.add(cat1);
        cats.add(cat2);
        cats.add(cat3);
        cats.add(cat4);
        for (Pets c : cats) {
            System.out.println(c);
        }

        System.out.println(cat4.equals(cat1));
        System.out.println(cat4.hashCode() == cat1.hashCode());
        System.out.println(cat1.hashCode());
        System.out.println(cat2.hashCode());

    }

}
