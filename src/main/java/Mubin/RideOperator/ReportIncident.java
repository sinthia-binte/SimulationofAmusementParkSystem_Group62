package Mubin.RideOperator;

import java.time.LocalDateTime;

public class ReportIncident {
    private int incidentId;
    private String rideId;
    private LocalDateTime time;
    private String natureOfIncident;
    private String actionsTaken;

    public ReportIncident(int incidentId, String rideId, LocalDateTime time, String natureOfIncident, String actionsTaken) {
        this.incidentId = incidentId;
        this.rideId = rideId;
        this.time = time;
        this.natureOfIncident = natureOfIncident;
        this.actionsTaken = actionsTaken;
    }

    public int getIncidentId() { return incidentId; }
    public void setIncidentId(int incidentId) { this.incidentId = incidentId; }

    public String getRideId() { return rideId; }
    public void setRideId(String rideId) { this.rideId = rideId; }

    public LocalDateTime getTime() { return time; }
    public void setTime(LocalDateTime time) { this.time = time; }

    public String getNatureOfIncident() { return natureOfIncident; }
    public void setNatureOfIncident(String natureOfIncident) { this.natureOfIncident = natureOfIncident; }

    public String getActionsTaken() { return actionsTaken; }
    public void setActionsTaken(String actionsTaken) { this.actionsTaken = actionsTaken; }

    @Override
    public String toString() {
        return "IncidentReport{" +
                "incidentId=" + incidentId +
                ", rideId='" + rideId + '\'' +
                ", time=" + time +
                ", natureOfIncident='" + natureOfIncident + '\'' +
                ", actionsTaken='" + actionsTaken + '\'' +
                '}';
    }{}
}