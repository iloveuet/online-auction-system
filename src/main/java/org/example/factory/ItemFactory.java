package org.example.factory;

import org.example.model.Art;
import org.example.model.Electronics;
import org.example.model.Item;
import org.example.model.Vehicle;

public class ItemFactory {

    public static Item createItem(String type, String itemId, String name,
                                  String description, double startingPrice) {
        return switch (type.toLowerCase()) {
            case "electronics" -> new Electronics(itemId, name, description, startingPrice, "Unknown", 12);
            case "art" -> new Art(itemId, name, description, startingPrice, "Unknown", 2024);
            case "vehicle" -> new Vehicle(itemId, name, description, startingPrice, "", 0);
            default -> throw new IllegalArgumentException("Loại item không hợp lệ: " + type);
        };
    }
}
