package org.example.model;

public class Admin extends User {

    public Admin(String userId, String username, String password, String email) {
        super(userId, username, password, email);
    }

    public void cancelAuction(Auction auction) {
        auction.setStatus(AuctionStatus.CANCELED);
    }

    @Override
    public String getRole() {
        return "Admin";
    }
}
