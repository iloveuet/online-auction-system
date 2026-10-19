package org.example.manager;

import org.example.model.Auction;
import org.example.model.AuctionStatus;
import org.example.model.Item;
import org.example.model.Seller;

import java.util.ArrayList;
import java.util.List;

public class AuctionManager {
    private static AuctionManager instance;
    private final List<Auction> auctions = new ArrayList<>();

    private AuctionManager() {
    }

    public static synchronized AuctionManager getInstance() {
        if (instance == null) {
            instance = new AuctionManager();
        }
        return instance;
    }

    public Auction createAuction(String auctionId, Seller seller, Item item, long durationMinutes) {
        Auction auction = seller.createAuction(auctionId, item, durationMinutes);
        auctions.add(auction);
        return auction;
    }

    public List<Auction> getActiveAuctions() {
        List<Auction> active = new ArrayList<>();
        for (Auction auction : auctions) {
            if (auction.getStatus() == AuctionStatus.RUNNING) {
                active.add(auction);
            }
        }
        return active;
    }

    public List<Auction> getAllAuctions() {
        return auctions;
    }
}
