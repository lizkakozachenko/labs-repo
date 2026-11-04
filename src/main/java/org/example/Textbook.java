package org.example;

public class Textbook implements Readable, Lendable {
    private String title;
    private String author;
    private int pages;
    private String subject;
    private boolean available;

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getTitle() {
        return title;
    }

    public Textbook(String title, String author, int pages, String subject, boolean available) {
        this.title = title;
        this.author = author;
        this.pages = pages;
        this.subject = subject;
        this.available = available;
    }

    @Override
    public void read() {
        System.out.println("Читаем учебник \"" + title + "\" по предмету " + subject);
    }

    @Override
    public int getPages() {
        return pages;
    }

    @Override
    public void lend() {
        if (available) {
            available = false;
            System.out.println("Учебник \"" + title + "\" выдан");
        } else {
            System.out.println("Учебник \"" + title + "\" уже выдан");
        }
    }

    @Override
    public void returnBook() {
        available = true;
        System.out.println("Учебник \"" + title + "\" возвращён");
    }

    @Override
    public boolean isAvailable() {
        return available;
    }

    @Override
    public void print(){
        System.out.print("Привет");
    };

    


}