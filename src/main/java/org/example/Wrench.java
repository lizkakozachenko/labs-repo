package org.example;

public class Wrench extends Tool {
    private int size;

    public Wrench(String name, int id, double weight, int size) {
        super(name, id, weight);
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "имя=" + getName() + ' ' + "id=" + getId() + "вес=" + getWeight() + "размер" + size;
    }
}