package Veronica.TourGuide;

import java.io.Serializable;

public class Attendance implements Serializable {

    private String guestName;
    private String tourSession;
    private String status;


    public Attendance(String guestName,
                      String tourSession,
                      String status) {

        this.guestName = guestName;
        this.tourSession = tourSession;
        this.status = status;
    }


    public String getGuestName() {
        return guestName;
    }


    public void setGuestName(String guestName) {
        this.guestName = guestName;
    }


    public String getTourSession() {
        return tourSession;
    }


    public void setTourSession(String tourSession) {
        this.tourSession = tourSession;
    }


    public String getStatus() {
        return status;
    }


    public void setStatus(String status) {
        this.status = status;
    }


    @Override
    public String toString() {
        return "Guest: " + guestName +
                "\nTour Session: " + tourSession +
                "\nStatus: " + status;
    }
}
