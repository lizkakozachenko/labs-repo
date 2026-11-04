package org.example;

import java.util.List;

public class Hotel {
    private int id;
    private String name;
    private String city;
    private int stars;
    private List<Integer> guestRatings;

    public Hotel(int id, String name, String city, int stars, List<Integer> guestRatings) {
        this.id = id;
        this.name = name;
        this.city = city;
        this.stars = stars;
        this.guestRatings = guestRatings;
    }

    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getCity() {
        return city;
    }
    public int getStars() {
        return stars;
    }
    public List<Integer> getGuestRatings() {
        return guestRatings;
    }

    public void setStars(int stars) {
        this.stars = stars;
    }

    public double getAverageRating() {
        if (guestRatings == null || guestRatings.isEmpty()) {
            return 0.0;
        }
        int sum = 0;
        for (int r : guestRatings) {
            sum += r;
        }
        return (double) sum / guestRatings.size();
    }

    @Override
    public String toString() {
        return "id" + id + "название" + name + "город" + city + "количество звезд" + stars +
                "средний рейтинг=" + String.format("%.2f", getAverageRating()) +
                '}';
    }
}