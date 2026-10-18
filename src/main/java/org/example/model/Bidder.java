package org.example.model;

public class Bidder extends User {
    private double balance;
    private int totalWin;

    public Bidder(String userId, String username, String password, String email, double balance) {
        super(userId, username, password, email);
        this.balance = balance;
        this.totalWin = 0;
    }

    public boolean placeBid(Auction auction, double amount) {
        return auction.placeBid(this, amount);
    }

    public void addWin() {
        totalWin++;
    }

    @Override
    public String getRole() {
        return "Bidder";
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getTotalWin() {
        return totalWin;
    }
}
