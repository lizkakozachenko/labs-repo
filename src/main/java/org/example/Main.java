package org.example;

public class Main {
    public static void main(String[] args) {
        double distance = 500;

        Transport[] fleet = new Transport[] {
                new Truck(20, 80, 300, 15),
                new Truck(15, 60, 200, 10),
                new Truck(25, 70, 400, 20),
                new Ship(1000, 40, 5000, 800),
                new Ship(1500, 50, 8000, 1200)
        };

        System.out.println("Доставка на расстояние " + distance + " км ===\n");

        for (Transport t : fleet) {
            t.displayInfo();
            System.out.println("Время доставки: " + t.calculateTime(distance) + " ч");
            System.out.println();
        }

        // нельзя инстанцировать
        //Transport t = new Transport(10, 50, 100);
    }
}