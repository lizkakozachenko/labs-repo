package org.example;

public class Main {
    public static void main(String[] args) {
        Computer base = new Computer("BasePC", 8, 256);
        GamingPC gaming = new GamingPC("Alienware", 32, 2000, "RTX 4090");
        OfficePC office = new OfficePC("HP ProDesk", 16, 512, 24.0);

        System.out.println("\nПереопределение (статический полиморфизм)");

        System.out.println("base (Computer)");
        base.run();
        base.run("Chrome");
        base.run(15);

        System.out.println("\ngaming (GamingPC) ");
        gaming.run();
        gaming.run("CS2");
        gaming.run(50);
        gaming.run("Cyberpunk", 120);
        gaming.run(144, "Dota2");

        System.out.println("\noffice (OfficePC)");
        office.run();
        office.run("report.docx", true);
        office.run(3);

        System.out.println("\nПереопределение (динамический полиморфизм)");
        Computer[] computers = { base, gaming, office };

        for (Computer c : computers) {
            c.displayInfo();
            System.out.println("Производительность (через родителя): " + c.getPerformance());
            System.out.println();
        }

        System.out.println("Сравнение");

        System.out.println("Статический (run):");
        base.run();
        base.run("test");

        System.out.println("\nДинамический (getPerformance):");
        Computer ref = gaming;
        System.out.println("Ссылка Computer, объект GamingPC: " + ref.getPerformance());
        ref = office;
        System.out.println("Ссылка Computer, объект OfficePC: " + ref.getPerformance());
    }
}