package org.example;

public class OfficePC extends Computer {
    private double monitorSize;

    public double getMonitorSize() {
        return monitorSize;
    }
    public void setMonitorSize(double monitorSize) {
        this.monitorSize = monitorSize;
    }

    public OfficePC(String model, int ram, int storage, double monitorSize) {
        super(model, ram, storage);
        this.monitorSize = monitorSize;
    }

    @Override
    public String getPerformance() {
        return "Средняя";
    }

    public void run(String doc, boolean print) {
        System.out.println("Открывает документ " + doc + (print ? " и печатает" : ""));
    }

    public void run(int copies) {
        System.out.println("Печатает " + copies + " копий");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Монитор: " + monitorSize + "\"");
    }
}