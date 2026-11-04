package org.example;
import java.io.*;
import java.nio.file.*;

public class Main {
    public static void main(String[] args) throws IOException {
        String info = """
                Университет: Московский Государственный Университет
                Факультет: Вычислительной математики и кибернетики
                Кафедра: Информатики
                Год основания: 1755
                Адрес: г. Москва, Ленинские горы, 1
                Ректор: Садовничий Виктор Антонович
                Количество студентов: 40000
                Количество факультетов: 40
                """;

        File file = new File("university.txt");
        try (BufferedWriter bw = new BufferedWriter(
                new OutputStreamWriter(new FileOutputStream(file), "UTF-8"))) {
            bw.write(info);
        }

        System.out.println(" Данные о файле ");
        System.out.println("Имя файла: " + file.getName());
        System.out.println("Размер файла: " + file.length() + " байт");

        System.out.println("\n Содержимое файла ");
        try (BufferedReader br = new BufferedReader(
                new InputStreamReader(new FileInputStream(file), "UTF-8"))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        }
    }
}