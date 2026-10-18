package org.example.model;

public class Seller extends User {

    public Seller(String userId, String username, String password, String email) {
        super(userId, username, password, email);
    }

    public Auction createAuction(String auctionId, Item item, long durationMinutes) {
        return new Auction(auctionId, item, this, durationMinutes);
    }

    @Override
    public String getRole() {
        return "Seller";
    }
}
