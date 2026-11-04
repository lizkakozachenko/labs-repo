package org.example;

public class Book {

    private String title;
    private String author;
    private int year;

    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    public boolean isOld() {
        int currentYear = 2026;
        return (currentYear - this.year) > 50;
    }

    public static void main(String[] args) {

        Book[] books = new Book[3];

        books[0] = new Book("Война и мир", "Лев Толстой", 1869);
        books[1] = new Book("Гарри Поттер и философский камень", "Дж. К. Роулинг", 1997);
        books[2] = new Book("Мастер и Маргарита", "Михаил Булгаков", 1967);

        System.out.println("Старые книги");

        for (Book book : books) {
            if (book.isOld()) {
                System.out.println("Название: " + book.getTitle() + ", Автор: " + book.getAuthor() + ", Год: " + book.getYear());
            }
        }
    }
}
