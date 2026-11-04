package org.example;
import java.io.*;
import java.util.*;

public class Task4 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US); // чтобы точка как разделитель работала

        double[] currents = new double[15];
        System.out.println("Введите 15 значений силы тока (А):");
        for (int i = 0; i < 15; i++) {
            System.out.print("Значение " + (i + 1) + ": ");
            currents[i] = sc.nextDouble();
        }

        try (PrintWriter pw = new PrintWriter(new FileWriter("current.txt"))) {
            for (double v : currents) {
                pw.println(v);
            }
        }

        double sum = 0;
        int count = 0;
        try (BufferedReader br = new BufferedReader(new FileReader("current.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                sum += Double.parseDouble(line.trim());
                count++;
            }
        }

        double average = sum / count;
        System.out.printf("Средняя сила тока: %.3f А%n", average);
    }
}