package org.example;
import java.io.*;
import java.util.*;

public class Task3 {
    public static void main(String[] args) throws IOException {
        Random rnd = new Random();
        List<Integer> numbers = new ArrayList<>();

        // Создание
        try (PrintWriter pw = new PrintWriter(new FileWriter("f.txt"))) {
            for (int i = 0; i < 20; i++) {
                int n = rnd.nextInt(201) - 100;
                numbers.add(n);
                pw.println(n);
            }
        }

        List<Integer> mult7 = new ArrayList<>();
        List<Integer> others = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader("f.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                int n = Integer.parseInt(line.trim());
                if (n % 7 == 0) mult7.add(n);
                else others.add(n);
            }
        }

        try (PrintWriter pw = new PrintWriter(new FileWriter("g.txt"))) {
            for (int n : mult7) pw.println(n);
        }
        try (PrintWriter pw = new PrintWriter(new FileWriter("h.txt"))) {
            for (int n : others) pw.println(n);
        }

        System.out.println("Исходные числа: " + numbers);
        System.out.println("Файл g (кратные 7, " + mult7.size() + " шт.): " + mult7);
        System.out.println("Файл h (остальные, " + others.size() + " шт.): " + others);
    }
}