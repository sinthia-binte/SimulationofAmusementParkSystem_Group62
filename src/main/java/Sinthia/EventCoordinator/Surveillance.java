package Sinthia.EventCoordinator;

public class Surveillance {
    private String cameraID;
    private String zone;
    private String status;

    public Surveillance() {}

    public Surveillance(String cameraID, String zone, String status) {
        this.cameraID = cameraID;
        this.zone = zone;
        this.status = status;
    }
    public String getCameraID() { return cameraID; }
    public void setCameraID(String cameraID) { this.cameraID = cameraID; }

    public String getZone() { return zone; }
    public void setZone(String zone) { this.zone = zone; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    public boolean monitorCamera() { return true; }
    public boolean detectThreat() { return false; }

    @Override
    public String toString() {
        return "Surveillance{" + "cameraID='" + cameraID + '\'' + ", zone='" + zone + '\'' + ", status='" + status + '\'' + '}';
    }
}