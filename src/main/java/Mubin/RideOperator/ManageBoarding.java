package Mubin.RideOperator;

import java.time.LocalDateTime;

public class ManageBoarding {
    private int boardingId;
    private String rideId;
    private int guestCount;
    private LocalDateTime boardingTime;
    private String operatorId;

    public ManageBoarding(int boardingId, String rideId, int guestCount, LocalDateTime boardingTime, String operatorId) {
        this.boardingId = boardingId;
        this.rideId = rideId;
        this.guestCount = guestCount;
        this.boardingTime = boardingTime;
        this.operatorId = operatorId;
    }

    public int getBoardingId() { return boardingId; }
    public void setBoardingId(int boardingId) { this.boardingId = boardingId; }

    public String getRideId() { return rideId; }
    public void setRideId(String rideId) { this.rideId = rideId; }

    public int getGuestCount() { return guestCount; }
    public void setGuestCount(int guestCount) { this.guestCount = guestCount; }

    public LocalDateTime getBoardingTime() { return boardingTime; }
    public void setBoardingTime(LocalDateTime boardingTime) { this.boardingTime = boardingTime; }

    public String getOperatorId() { return operatorId; }
    public void setOperatorId(String operatorId) { this.operatorId = operatorId; }

    @Override
    public String toString() {
        return "Boarding{" +
                "boardingId=" + boardingId +
                ", rideId='" + rideId + '\'' +
                ", guestCount=" + guestCount +
                ", boardingTime=" + boardingTime +
                ", operatorId='" + operatorId + '\'' +
                '}';
    }
}