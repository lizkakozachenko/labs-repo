package org.example;

public class Computer {
    protected String processor;
    protected int ram;
    protected int storage;

    public String getProcessor() {
        return processor;
    }
    public int getRam() {
        return ram;
    }
    public int getStorage() {
        return storage;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }
    public void setRam(int ram) {
        this.ram = ram;
    }
    public void setStorage(int storage) {
        this.storage = storage;
    }

    public Computer(String processor, int ram, int storage) {
        this.processor = processor;
        this.ram = ram;
        this.storage = storage;
    }

    public String getPerformance() {
        return "Производительность неизвестна";
    }

    public void displayInfo() {
        System.out.println("Процессор: " + processor);
        System.out.println("ОЗУ: " + ram + " ГБ");
        System.out.println("Накопитель: " + storage + " ГБ");
        System.out.println("Производительность: " + getPerformance());
    }
}