package org.example;

public abstract class Tool {
    private String name;
    private int id;
    private double weight;

    public Tool(String name, int id, double weight) {
        this.name = name;
        this.id = id;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }
    public int getId() {
        return id;
    }
    public double getWeight() {
        return weight;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "имя=" + name + ' ' + "id=" + id + "вес=" + weight;
    }
}