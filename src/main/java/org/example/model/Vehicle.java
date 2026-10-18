package org.example.model;

public class Vehicle extends Item {
    private String licensePlate;
    private double mileage;

    public Vehicle(String itemId, String name, String description, double startingPrice,
                   String licensePlate, double mileage) {
        super(itemId, name, description, startingPrice);
        this.licensePlate = licensePlate;
        this.mileage = mileage;
    }

    @Override
    public String getDetails() {
        return "Vehicle: " + getName() + " | Biển số: " + licensePlate
                + " | Đã đi: " + mileage + " km"
                + " | Giá hiện tại: " + getCurrentPrice();
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public double getMileage() {
        return mileage;
    }
}
