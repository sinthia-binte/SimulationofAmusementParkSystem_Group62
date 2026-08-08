package Sinthia.EventCoordinator;

public class Incident {
    private String incidentID;
    private String type;
    private String location;
    private String status;

    public Incident() {}

    public Incident(String incidentID, String type, String location, String status) {
        this.incidentID = incidentID;
        this.type = type;
        this.location = location;
        this.status = status;
    }
    public String getIncidentID() { return incidentID; }
    public void setIncidentID(String incidentID) { this.incidentID = incidentID; }

    public String getType() { return type; }
    public void setType(String type) { this.type = type; }

    public String getLocation() { return location; }
    public void setLocation(String location) { this.location = location; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    public boolean createIncident() { return true; }
    public boolean updateStatus() { return true; }

    @Override
    public String toString() {
        return "Incident{" + "incidentID='" + incidentID + '\'' + ", type='" + type + '\'' + ", location='" + location + '\'' + ", status='" + status + '\'' + '}';
    }
}