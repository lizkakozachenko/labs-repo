package org.example;

import java.util.*;

public class Main {

    public static void printHotels(List<Hotel> hotels, int stars) {
        System.out.println(" Отели с " + stars + " звёздами");
        boolean found = false;
        for (Hotel h : hotels) {
            if (h.getStars() == stars) {
                System.out.println(h);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Нет отелей с " + stars + " звёздами");
        }
    }

    public static void main(String[] args) {
        List<Hotel> hotels = new ArrayList<>(Arrays.asList(
                new Hotel(1, "Sunny Beach", "Сочи", 3, Arrays.asList(2, 3, 2, 3)),
                new Hotel(2, "Grand Palace", "Москва", 4, Arrays.asList(5, 4, 5, 4)),
                new Hotel(3, "Sea View", "Ялта", 2, Arrays.asList(1, 2, 2, 3)),
                new Hotel(4, "Mountain Resort", "Сочи", 5, Arrays.asList(5, 5, 4, 5)),
                new Hotel(5, "City Hotel", "Казань", 3, Arrays.asList(3, 3, 2, 2)),
                new Hotel(6, "Aurora", "Москва", 4, Arrays.asList(4, 4, 3, 5))
        ));

        System.out.println(" Отели со средним рейтингом < 3 ");
        for (Hotel h : hotels) {
            if (h.getAverageRating() < 3) {
                System.out.println(h);
            }
        }

        System.out.println("\n Повышение звездности (рейтинг >= 4) ");

        Iterator<Hotel> it = hotels.iterator();
        while (it.hasNext()) {
            Hotel h = it.next();
            if (h.getAverageRating() >= 4) {
                System.out.println("Было: " + h.getName() + " - " + h.getStars());
                h.setStars(h.getStars() + 1);
                System.out.println("Стало: " + h.getName() + " - " + h.getStars());
            }
        }

        System.out.println();
        printHotels(hotels, 3);

        System.out.println("\n Отели по убыванию рейтинга ");
        hotels.sort((a, b) -> {
            int byRating = Double.compare(a.getAverageRating(), b.getAverageRating());
            if (byRating != 0) return byRating;
            return b.getName().compareTo(a.getName());
        });

        System.out.printf("%-5s %-20s %-10s%n", "ID", "Название", "Ср. рейтинг");
        for (Hotel h : hotels) {
            System.out.printf("%-5d %-20s %-10.2f%n",
                    h.getId(), h.getName(), h.getAverageRating());
        }
    }
}