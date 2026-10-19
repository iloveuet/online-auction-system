package org.example;

import org.example.factory.ItemFactory;
import org.example.manager.AuctionManager;
import org.example.model.Auction;
import org.example.model.Bidder;
import org.example.model.Item;
import org.example.model.Seller;

public class MainDemo {
    public static void main(String[] args) {
        Seller seller = new Seller("U01", "seller01", "123456", "seller@mail.com");
        Bidder bidder1 = new Bidder("U02", "bidder01", "123456", "b1@mail.com", 1000);
        Bidder bidder2 = new Bidder("U03", "bidder02", "123456", "b2@mail.com", 2000);

        Item camera = ItemFactory.createItem("electronics", "I01", "Vintage Camera", "Máy ảnh film cổ", 50);
        System.out.println(camera.getDetails());

        AuctionManager manager = AuctionManager.getInstance();
        Auction auction = manager.createAuction("A01", seller, camera, 60);
        auction.start();

        System.out.println("Bid 60: " + bidder1.placeBid(auction, 60));
        System.out.println("Bid 55 (thấp hơn giá hiện tại): " + bidder2.placeBid(auction, 55));
        System.out.println("Bid 75: " + bidder2.placeBid(auction, 75));
        System.out.println("Giá hiện tại: " + camera.getCurrentPrice());

        auction.close();
        Bidder winner = auction.determineWinner();
        System.out.println("Người thắng: " + (winner != null ? winner.getUsername() : "không có"));
        System.out.println("Số phiên thắng của winner: " + (winner != null ? winner.getTotalWin() : 0));
    }
}
