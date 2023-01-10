// 1. Реализуйте 1 из вариантов класса Cat из предыдущего задания, 
// можно использовать не все придуманные поля и методы. Создайте несколько экземпляров этого класса, выведите их в консоль.
// 2. Добейтесь того, чтобы при выводе в консоль объекта типа Cat,
//  выводилась его кличка, цвет и возраст (или другие параметры на ваше усмотрение).

package Seminar6;

public class Task_3 {
    public static void main(String[] args) {
        Pets cat1 = new Pets("Барсик", 30, "сиамский", "светлый");
        cat1.addInjection();
        cat1.addAge();
        System.out.println("Прививки: ");
        System.out.println(cat1.getInjections());
        System.out.println(cat1);
    }
    
}
