package org.example;

import java.io.*;
import java.util.Random;

public class Task5 {
    public static void main(String[] args) throws IOException {
        Random rnd = new Random();

        // Создание
        try (PrintWriter pw = new PrintWriter("f.txt")) {
            for (int i = 0; i < 10; i++) {
                int v;
                if (rnd.nextInt(3) == 0) v = 0;
                else v = rnd.nextInt(101) - 50;
                pw.println(v);
            }
        }

        // Чтение и подсчёт
        int nonZero = 0;
        StringBuilder all = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new FileReader("f.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                int n = Integer.parseInt(line.trim());
                all.append(n).append(" ");
                if (n != 0) nonZero++;
            }
        }

        System.out.println("Числа в файле: " + all);
        System.out.println("Количество чисел, не равных нулю: " + nonZero);
    }
}
