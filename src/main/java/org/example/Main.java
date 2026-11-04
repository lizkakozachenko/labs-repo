package org.example;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Tool> tools = new HashMap<>();

        tools.put("Молоток столярный", new Hammer("Молоток столярный", 1, 1.2, 30.0));
        tools.put("Молоток слесарный", new Hammer("Молоток слесарный", 2, 1.5, 32.0));
        tools.put("Молоток отбойный", new Hammer("Молоток отбойный", 3, 8.0, 25.0));

        tools.put("Отвертка крестовая", new Screwdriver("Отвертка крестовая", 4, 0.15, "PH2"));
        tools.put("Отвертка плоская", new Screwdriver("Отвертка плоская", 5, 0.12, "Flat"));
        tools.put("Отвертка шестигранная", new Screwdriver("Отвертка шестигранная", 6, 0.2, "Hex"));

        tools.put("Ключ гаечный 10мм", new Wrench("Ключ гаечный 10мм", 7, 0.3, 10));
        tools.put("Ключ гаечный 17мм", new Wrench("Ключ гаечный 17мм", 8, 0.5, 17));

        System.out.println("Ключ - Значение");
        for (Map.Entry<String, Tool> entry : tools.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }

        System.out.println("\n Все ключи ");
        for (String key : tools.keySet()) {
            System.out.println(key);
        }
    }
}