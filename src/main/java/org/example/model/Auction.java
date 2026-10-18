package org.example.model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Auction {
    private String auctionId;
    private Item item;
    private Seller seller;
    private List<Bid> bids;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private AuctionStatus status;

    public Auction(String auctionId, Item item, Seller seller, long durationMinutes) {
        this.auctionId = auctionId;
        this.item = item;
        this.seller = seller;
        this.bids = new ArrayList<>();
        this.startTime = LocalDateTime.now();
        this.endTime = startTime.plusMinutes(durationMinutes);
        this.status = AuctionStatus.OPEN;
    }

    public void start() {
        status = AuctionStatus.RUNNING;
    }

    // Bản cơ bản tuần 6: kiểm tra trạng thái + giá phải cao hơn giá hiện tại.
    // Tuần 7 sẽ bổ sung Observer (báo bid mới) và khóa chống race condition.
    public boolean placeBid(Bidder bidder, double amount) {
        if (status != AuctionStatus.RUNNING) {
            return false;
        }
        if (amount <= item.getCurrentPrice()) {
            return false;
        }
        bids.add(new Bid("BID-" + (bids.size() + 1), bidder, amount));
        item.setCurrentPrice(amount);
        return true;
    }

    public void close() {
        status = AuctionStatus.FINISHED;
    }

    // Bid được chấp nhận luôn cao hơn bid trước, nên bid cuối là bid thắng
    public Bidder determineWinner() {
        if (bids.isEmpty()) {
            return null;
        }
        Bidder winner = bids.get(bids.size() - 1).getBidder();
        winner.addWin();
        return winner;
    }

    public String getAuctionId() {
        return auctionId;
    }

    public Item getItem() {
        return item;
    }

    public Seller getSeller() {
        return seller;
    }

    public List<Bid> getBids() {
        return bids;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    public AuctionStatus getStatus() {
        return status;
    }

    public void setStatus(AuctionStatus status) {
        this.status = status;
    }
}
