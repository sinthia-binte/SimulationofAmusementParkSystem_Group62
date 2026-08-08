package Mubin.RideOperator;

import java.util.Date;

public class OperateRide {
    private String rideId;
    private String rideName;
    private String status;
    private int capacity;
    private Date lastMaintDate;

    public OperateRide(String rideId, String rideName, String status, int capacity, Date lastMaintDate) {
        this.rideId = rideId;
        this.rideName = rideName;
        this.status = status;
        this.capacity = capacity;
        this.lastMaintDate = lastMaintDate;
    }

    public String getRideId() { return rideId; }
    public void setRideId(String rideId) { this.rideId = rideId; }

    public String getRideName() { return rideName; }
    public void setRideName(String rideName) { this.rideName = rideName; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    public int getCapacity() { return capacity; }
    public void setCapacity(int capacity) { this.capacity = capacity; }

    public Date getLastMaintDate() { return lastMaintDate; }
    public void setLastMaintDate(Date lastMaintDate) { this.lastMaintDate = lastMaintDate; }

    @Override
    public String toString() {
        return "Ride{" +
                "rideId='" + rideId + '\'' +
                ", rideName='" + rideName + '\'' +
                ", status='" + status + '\'' +
                ", capacity=" + capacity +
                ", lastMaintDate=" + lastMaintDate +
                '}';
    }
}