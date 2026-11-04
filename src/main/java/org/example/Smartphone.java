package org.example;

public class Smartphone {
    private String brand;
    private double price;
    private int batteryLife;

    public Smartphone(String brand, double price, int batteryLife) {
        this.brand = brand;
        this.price = price;
        this.batteryLife = batteryLife;
    }

    public String getBrand() {
        return brand;
    }

    public double getPrice() {
        return price;
    }

    public int getBatteryLife() {
        return batteryLife;
    }

    public static void main(String[] args) {
        Smartphone[] phones = {
                new Smartphone("Samsung", 799.99, 5000),
                new Smartphone("Apple", 999.00, 3200),
                new Smartphone("Xiaomi", 499.50, 6000),
                new Smartphone("Google", 899.00, 4500),
                new Smartphone("OnePlus", 649.00, 5500)
        };

        Smartphone maxBattery = phones[0];
        for (Smartphone p : phones) {
            if (p.getBatteryLife() > maxBattery.getBatteryLife()) {
                maxBattery = p;
            }
        }
        System.out.println("Смартфон с максимальной батареей: " + maxBattery);

        double sum = 0;
        for (Smartphone p : phones) {
            sum += p.getPrice();
        }
        double averagePrice = sum / phones.length;
        System.out.println("Средняя цена: " + averagePrice);
    }
}
