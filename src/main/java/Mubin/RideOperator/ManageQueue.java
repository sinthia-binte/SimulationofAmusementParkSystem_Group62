package Mubin.RideOperator;

public class ManageQueue {
    private int queueId;
    private String rideId;
    private int guestCount;
    private int estWaitTime;
    private int throughput;

    public ManageQueue(int queueId, String rideId, int guestCount, int estWaitTime, int throughput) {
        this.queueId = queueId;
        this.rideId = rideId;
        this.guestCount = guestCount;
        this.estWaitTime = estWaitTime;
        this.throughput = throughput;
    }

    public int getQueueId() { return queueId; }
    public void setQueueId(int queueId) { this.queueId = queueId; }

    public String getRideId() { return rideId; }
    public void setRideId(String rideId) { this.rideId = rideId; }

    public int getGuestCount() { return guestCount; }
    public void setGuestCount(int guestCount) { this.guestCount = guestCount; }

    public int getEstWaitTime() { return estWaitTime; }
    public void setEstWaitTime(int estWaitTime) { this.estWaitTime = estWaitTime; }

    public int getThroughput() { return throughput; }
    public void setThroughput(int throughput) { this.throughput = throughput; }

    @Override
    public String toString() {
        return "Queue{" +
                "queueId=" + queueId +
                ", rideId='" + rideId + '\'' +
                ", guestCount=" + guestCount +
                ", estWaitTime=" + estWaitTime +
                ", throughput=" + throughput +
                '}';
    }
}