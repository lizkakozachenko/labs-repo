package org.example;

public class GamingPC extends Computer {
    private String videoCard;

    public String getVideoCard() {
        return videoCard;
    }
    public void setVideoCard(String videoCard) {
        this.videoCard = videoCard;
    }

    public GamingPC(String model, int ram, int storage, String videoCard) {
        super(model, ram, storage);
        this.videoCard = videoCard;
    }


    public void run(String game, int fps) {
        System.out.println("Запускает игру " + game + " на " + fps + " FPS");
    }

    public void run(int fps, String game) {
        System.out.println("Игра " + game + " идёт на " + fps + " FPS");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Видеокарта: " + videoCard);
    }
    @Override
    public String getPerformance() {
        return "Высокая";
    }

}