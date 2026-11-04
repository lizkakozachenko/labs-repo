package org.example;
import java.io.*;
import java.util.*;

public class Task2 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[10];

        System.out.println("Введите 10 целых чисел:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Число " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
        }

        // Запись
        try (PrintWriter pw = new PrintWriter(new FileWriter("f.txt"))) {
            for (int n : numbers) {
                pw.println(n);
            }
        }

        // Чтение
        List<Integer> readNumbers = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader("f.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                readNumbers.add(Integer.parseInt(line.trim()));
            }
        }

        System.out.println("\nЧисла из файла: " + readNumbers);

        int max = Collections.max(readNumbers);
        int min = Collections.min(readNumbers);
        int diff = max - min;

        System.out.println("Максимальное: " + max);
        System.out.println("Минимальное: " + min);
        System.out.println("Разность: " + diff);
    }
}