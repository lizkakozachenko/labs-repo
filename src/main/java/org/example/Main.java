package org.example;

public class Main {
    public static void main(String[] args) {

        Novel n1 = new Novel("Мастер и Маргарита", "Булгаков", 480, true);
        Novel n2 = new Novel("1984", "Оруэлл", 320, true);
        Novel n3 = new Novel("Преступление и наказание", "Достоевский", 672, false);

        Textbook t1 = new Textbook("Алгебра", "Иванов", 250, "Математика", true);
        Textbook t2 = new Textbook("Физика", "Петров", 400, "Физика", true);

        Readable[] books = { n1, n2, n3, t1, t2 };

         for (Readable r : books) {
            r.read();
             if (r instanceof Lendable l) {
                 l.lend();
             }
         }


    }
}