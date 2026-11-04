package org.example;

public class OfficePC extends Computer {
    private double monitorSize;

    public double getMonitorSize() {
        return monitorSize;
    }
    public void setMonitorSize(double monitorSize) {
        this.monitorSize = monitorSize;
    }

    public OfficePC(String processor, int ram, int storage, double monitorSize) {
        super(processor, ram, storage);
        this.monitorSize = monitorSize;
    }

    @Override
    public String getPerformance() {
        return "Средняя производительность";
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Размер монитора: " + monitorSize + "\"");
    }

    public void printDocument() {
        System.out.println("Печатаем документ...");
    }

}