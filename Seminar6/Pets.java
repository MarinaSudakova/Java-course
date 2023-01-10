// 1. Реализуйте 1 из вариантов класса Cat из предыдущего задания, 
// можно использовать не все придуманные поля и методы. Создайте несколько экземпляров этого класса, выведите их в консоль.
// 2. Добейтесь того, чтобы при выводе в консоль объекта типа Cat,
//  выводилась его кличка, цвет и возраст (или другие параметры на ваше усмотрение).


package Seminar6;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.io.ObjectStreamClass;

public class Pets {
    private String name;
    private String color;
    private int age;
    private List<String> injections;
    private String breed;

    public Pets(String name, int age, String breed, String color) {
        this.name = name;
        this.age = age;
        this.breed = breed;
        this.color = color;
        this.injections = new ArrayList<String>();
    }

    public void addInjection() {
        this.injections.add(String.valueOf(LocalDateTime.now()));
        
    }

    public List<String> getInjections() {
        return this.injections;
    }

    public void addAge() {
        this.age++;
    }

    @Override
    public String toString() {
        return String.format("Кличка: %s, цвет: %s, возраст: %d", this.name, this.color, this.age);
    }
    
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Pets) {  
            Pets cat = (Pets) obj;
            return cat.age == this.age && cat.breed.equals(this.breed) && cat.injections.equals(this.injections) && cat.color.equals(this.color) && cat.name.equals(this.name);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.age, this.name, this.injections, this.breed, this.color);
    }
}
