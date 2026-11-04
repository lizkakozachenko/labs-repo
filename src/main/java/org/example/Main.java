package org.example;

public class Main {
    public static void main(String[] args) {
        GamingPC gaming = new GamingPC("Intel Core i9", 32, 2000, "RTX 4090");
        OfficePC office = new OfficePC("Intel Core i5", 16, 512, 24.0);
Computer computer= new OfficePC("Intel Core i5", 16, 512, 24.0);
        System.out.println("Игровой ПК");
        gaming.displayInfo();
        gaming.playGame();

        System.out.println("\nОфисный ПК");
        office.displayInfo();
        office.printDocument();
    }
}