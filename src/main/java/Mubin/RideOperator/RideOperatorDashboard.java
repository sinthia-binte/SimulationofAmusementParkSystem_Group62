package Mubin.RideOperator;

public class RideOperatorDashboard {
    private String operatorId;
    private String assignedRide;

    public RideOperatorDashboard(String operatorId, String assignedRide) {
        this.operatorId = operatorId;
        this.assignedRide = assignedRide;
    }

    public String getOperatorId() { return operatorId; }
    public void setOperatorId(String operatorId) { this.operatorId = operatorId; }

    public String getAssignedRide() { return assignedRide; }
    public void setAssignedRide(String assignedRide) { this.assignedRide = assignedRide; }

    @Override
    public String toString() {
        return "RideOperatorDashboard{" +
                "operatorId='" + operatorId + '\'' +
                ", assignedRide='" + assignedRide + '\'' +
                '}';
    }
}