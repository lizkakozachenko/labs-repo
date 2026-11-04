package org.example;

public class Hammer extends Tool {
    private double handleLength;

    public Hammer(String name, int id, double weight, double handleLength) {
        super(name, id, weight);
        this.handleLength = handleLength;
    }

    public double getHandleLength() {
        return handleLength;
    }

    public void setHandleLength(double handleLength) {
        this.handleLength = handleLength;
    }

    @Override
    public String toString() {
        return "имя=" + getName() + ' ' + "id=" + getId() + "вес=" + getWeight() + "длинна" + handleLength;
    }
}