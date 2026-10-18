package org.example.model;

import java.time.LocalDateTime;

public class Bid {
    private String bidId;
    private Bidder bidder;
    private double amount;
    private LocalDateTime timestamp;

    public Bid(String bidId, Bidder bidder, double amount) {
        this.bidId = bidId;
        this.bidder = bidder;
        this.amount = amount;
        this.timestamp = LocalDateTime.now();
    }

    public String getBidId() {
        return bidId;
    }

    public Bidder getBidder() {
        return bidder;
    }

    public double getAmount() {
        return amount;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }
}
