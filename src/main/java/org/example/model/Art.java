package org.example.model;

public class Art extends Item {
    private String artist;
    private int year;

    public Art(String itemId, String name, String description, double startingPrice,
               String artist, int year) {
        super(itemId, name, description, startingPrice);
        this.artist = artist;
        this.year = year;
    }

    @Override
    public String getDetails() {
        return "Art: " + getName() + " | Họa sĩ: " + artist
                + " | Năm: " + year
                + " | Giá hiện tại: " + getCurrentPrice();
    }

    public String getArtist() {
        return artist;
    }

    public int getYear() {
        return year;
    }
}
