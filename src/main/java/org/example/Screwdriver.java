package org.example;

public class Screwdriver extends Tool {
    private String tipType;

    public Screwdriver(String name, int id, double weight, String tipType) {
        super(name, id, weight);
        this.tipType = tipType;
    }

    public String getTipType() {
        return tipType;
    }

    public void setTipType(String tipType) {
        this.tipType = tipType;
    }

    @Override
    public String toString() {
        return "имя=" + getName() + ' ' + "id=" + getId() + "вес=" + getWeight() + "тип" + tipType;

    }
}