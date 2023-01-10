package Seminar6.HW;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.io.ObjectStreamClass;

public class Notebooks {
    private String operSys;
    private String color;
    private int memory;
    private int price;
    private int serNumber;

    public Notebooks (String operSys, String color, int memory, int price, int serNumber) {
        this.operSys = operSys;
        this.color = color;
        this.memory = memory;
        this.price = price;
        this.serNumber = serNumber;
    }

    public String getoperSys() {
        return operSys;
    }

    public String getcolor() {
        return color;
    }

    public int getprice() {
        return price;
    }

    public int getmemory() {
        return memory;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Notebooks laptop = (Notebooks) o;
        return operSys == laptop.operSys && color == laptop.color && Objects.equals(price, laptop.price) && Objects.equals(memory, laptop.memory);
    }

    
    @Override
    public String toString() {
        return String.format("Серийный номер: %d, цвет: %s, объем оп. памяти: %d, оп. система: %s, цена: %d", this.serNumber, this.color, this.memory, this.operSys, this.price);
    }
}
