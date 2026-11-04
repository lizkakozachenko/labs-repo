package org.example;

public class Ship extends Transport {
    private double tonnage;

    public double getTonnage() {
        return tonnage;
    }
    public void setTonnage(double tonnage) {
        this.tonnage = tonnage;
    }

    public Ship(int capacity, double speed, double fuel, double tonnage) {
        super(capacity, speed, fuel);
        this.tonnage = tonnage;
    }

    @Override
    public String deliver() {
        return "Доставляет груз по воде";
    }

    @Override
    public double calculateTime(double distance) {
        return distance / (getSpeed() * 0.8);
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Тоннаж: " + tonnage + " т");
    }


}