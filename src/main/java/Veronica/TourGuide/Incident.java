package Veronica.TourGuide;

public class Incident {
    private int incidentId;
    private String TourGuide,guestId,time,location,description,evidence,status;

    public Incident(int incidentId, String tourGuide, String guestId, String time, String location, String description, String evidence, String status) {
        this.incidentId = incidentId;
        TourGuide = tourGuide;
        this.guestId = guestId;
        this.time = time;
        this.location = location;
        this.description = description;
        this.evidence = evidence;
        this.status = status;
    }

    public int getIncidentId() {
        return incidentId;
    }

    public void setIncidentId(int incidentId) {
        this.incidentId = incidentId;
    }

    public String getTourGuide() {
        return TourGuide;
    }

    public void setTourGuide(String tourGuide) {
        TourGuide = tourGuide;
    }

    public String getGuestId() {
        return guestId;
    }

    public void setGuestId(String guestId) {
        this.guestId = guestId;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getEvidence() {
        return evidence;
    }

    public void setEvidence(String evidence) {
        this.evidence = evidence;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }


}
