package org.example.model;

public abstract class Item {
    private String itemId;
    private String name;
    private String description;
    private double startingPrice;
    private double currentPrice;

    protected Item(String itemId, String name, String description, double startingPrice) {
        this.itemId = itemId;
        this.name = name;
        this.description = description;
        this.startingPrice = startingPrice;
        this.currentPrice = startingPrice;
    }

    public abstract String getDetails();

    public String getItemId() {
        return itemId;
    }
    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getStartingPrice() {
        return startingPrice;
    }

    public double getCurrentPrice() {
        return currentPrice;
    }

    public void setCurrentPrice(double currentPrice) {
        this.currentPrice = currentPrice;
    }
}
