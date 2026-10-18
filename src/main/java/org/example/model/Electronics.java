package org.example.model;

public class Electronics extends Item {
    private String brand;
    private int warrantyMonths;

    public Electronics(String itemId, String name, String description, double startingPrice,
                       String brand, int warrantyMonths) {
        super(itemId, name, description, startingPrice);
        this.brand = brand;
        this.warrantyMonths = warrantyMonths;
    }

    @Override
    public String getDetails() {
        return "Electronics: " + getName() + " | Hãng: " + brand
                + " | Bảo hành: " + warrantyMonths + " tháng"
                + " | Giá hiện tại: " + getCurrentPrice();
    }

    public String getBrand() {
        return brand;
    }

    public int getWarrantyMonths() {
        return warrantyMonths;
    }
}
