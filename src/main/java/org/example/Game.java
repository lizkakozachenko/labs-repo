package org.example;

public class Game {
    private String name;
    private String genre;
    private int rating;

    static int totalGames = 0;
    static int totalRating = 0;
    private int kolvo;
    public int getKolvo (){
        return kolvo;
    }
    public void setKolvo (){
        this.kolvo = kolvo;
    }
    public Game (String name, String genre, int rating, int kolvo ){
        this(name, genre, rating);
        this.kolvo=kolvo;
    }
    public static void print (Game g){
        System.out.print( "Название" + g.name);
        System.out.print( "жанр" + g.genre);
        System.out.print( "рейтинг" + g.rating);
        System.out.print( "количество" + g.kolvo);
        System.out.print( "игры" + totalGames);
        System.out.print( "рейтинг1" + totalRating);
    }
























    public Game(String name, String genre, int rating) {
        this.name = name;
        this.genre = genre;
        this.rating = rating;
        totalGames++;
        totalRating += rating;
    }

    public String getName() {
        return name;
    }

    public String getGenre() {
        return genre;
    }

    public int getRating() {
        return rating;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setRating(int rating) {
        if (rating >= 1 && rating <= 10) {
            this.rating = rating;
        } else {
            System.out.println("Рейтинг должен быть от 1 до 10");
        }
    }


    static double getAverageRating() {
        return (double) totalRating / totalGames;
    }

    public static void main(String[] args) {
        Game g1 = new Game("Dota2", "RPG", 10);
        Game g2 = new Game("Minecraft", "Sandbox", 9);
        Game g3 = new Game("CS2", "Shooter", 8);
        Game g4 = new Game("FIFA", "Sports", 7);
        Game g5 = new Game("WarCraft", "RPG", 8);
        Game g6 = new Game("Among Us", "Party", 6);

        System.out.println("Средний рейтинг: " + getAverageRating());
    }
}