package Veronica.TourGuide;

import java.io.Serializable;

public class Incident implements Serializable {

    private int incidentId;
    private String tourGuide, guestName, time, location, description, status;


    public Incident(int incidentId, String tourGuide, String guestName, String time, String location, String description, String status) {
        this.incidentId = incidentId;
        this.tourGuide = tourGuide;
        this.guestName = guestName;
        this.time = time;
        this.location = location;
        this.description = description;
        this.status = status;
    }


    public int getIncidentId() {
        return incidentId;
    }

    public void setIncidentId(int incidentId) {
        this.incidentId = incidentId;
    }

    public String getTourGuide() {
        return tourGuide;
    }

    public void setTourGuide(String tourGuide) {
        this.tourGuide = tourGuide;
    }

    public String getGuestName() {
        return guestName;
    }

    public void setGuestName(String guestName) {
        this.guestName = guestName;
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}

