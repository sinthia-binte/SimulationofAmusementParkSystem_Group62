package Mubin.RideOperator;

import java.time.LocalDateTime;

public class ManageRideCycle {
    private int cycleId;
    private String rideId;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private int duration;

    public ManageRideCycle(int cycleId, String rideId, LocalDateTime startTime, LocalDateTime endTime, int duration) {
        this.cycleId = cycleId;
        this.rideId = rideId;
        this.startTime = startTime;
        this.endTime = endTime;
        this.duration = duration;
    }

    public int getCycleId() { return cycleId; }
    public void setCycleId(int cycleId) { this.cycleId = cycleId; }

    public String getRideId() { return rideId; }
    public void setRideId(String rideId) { this.rideId = rideId; }

    public LocalDateTime getStartTime() { return startTime; }
    public void setStartTime(LocalDateTime startTime) { this.startTime = startTime; }

    public LocalDateTime getEndTime() { return endTime; }
    public void setEndTime(LocalDateTime endTime) { this.endTime = endTime; }

    public int getDuration() { return duration; }
    public void setDuration(int duration) { this.duration = duration; }

    @Override
    public String toString() {
        return "RideCycle{" +
                "cycleId=" + cycleId +
                ", rideId='" + rideId + '\'' +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                ", duration=" + duration +
                '}';
    }
}