// Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
// Создать множество ноутбуков.
// Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и 
// выведет ноутбуки, отвечающие фильтру. 
// Критерии фильтрации можно хранить в Map. 
// Например: “Введите цифру, соответствующую необходимому критерию: 1 - ОЗУ
// 2 - Объем ЖД
// 3 - Операционная система
// 4 - Цвет …
// Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры 
// фильтрации можно также в Map.
// Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.

package Seminar6.HW;
import java.util.HashSet;
import java.util.HashMap;
import java.util.Scanner;


public class Task_1 {
    public static void main(String[] args) {
        HashSet<Notebooks> laptops = new HashSet<Notebooks>();

        laptops.add(new Notebooks("MacOS", "black", 20, 200, 445));
        laptops.add(new Notebooks("Linux", "white", 30, 150, 812));
        laptops.add(new Notebooks("Windows", "silver", 40, 150, 447));
        laptops.add(new Notebooks("Linux", "gold", 30, 250, 238));
        laptops.add(new Notebooks("Windows", "gray", 20, 80, 544));

        System.out.println("Количество ноутбуков: " + laptops.size());

        var parametres = getParam();
        var forChoice = filter(laptops, parametres);
        if (forChoice.size() == 0)
        {
            System.out.println("Нет ноутбуков, удовлетворяющих заданному критерию");
        }
        else for (Notebooks note : forChoice) {
            System.out.println(note);
        }    
    }

    public static HashMap<String, String> getParam() {
        Scanner scanner = new Scanner(System.in);

        HashMap<String, String> parametres = new HashMap<>();

        System.out.println("Введите цифру, соответствующую необходимому критерию:");
        System.out.println("1 - Операционная система (Linux, MacOS, Windows)");
        System.out.println("2 - Цвет (black, white, silver, gray, gold)");
        System.out.println("3 - Объем памяти (20-40)");
        System.out.println("4 - Цена (80-250)");

        int choice = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Введите минимальное значение:");
        String minValue = scanner.nextLine();
        scanner.close();

        switch (choice) {
            case 1:
                parametres.put("operSys", minValue);
                break;
            case 2:
                parametres.put("color", minValue);
                break;
            case 3:
                parametres.put("memory", minValue);
                break;
            case 4:
                parametres.put("price", minValue);
                break;
        }

        return parametres;
    }

    public static HashSet<Notebooks> filter(HashSet<Notebooks> laptops, HashMap<String, String> parametres) {
        HashSet<Notebooks> forChoice = new HashSet<Notebooks>();
        for (Notebooks laptop : laptops) {
            boolean isMatch = true;
            for (HashMap.Entry<String, String> entry : parametres.entrySet()) {
                switch (entry.getKey()) {
                    case "operSys":
                        if (laptop.getoperSys().equals(entry.getValue())) {
                            isMatch = false;
                        }
                        break;
                    case "memory":
                        if (laptop.getmemory() < Integer.parseInt(entry.getValue())) {
                            isMatch = false;
                        }
                        break;
                    case "price":
                        if (laptop.getprice() < Integer.parseInt(entry.getValue())) {
                            isMatch = false;
                        }
                        break;
                    case "color":
                        if (!laptop.getcolor().equals(entry.getValue())) {
                            isMatch = false;
                        }
                        break;
                }
                if (!isMatch) {
                    break;
                }
            }
            if (isMatch) {
                forChoice.add(laptop);
            }
        }
        return forChoice;
    }

}
