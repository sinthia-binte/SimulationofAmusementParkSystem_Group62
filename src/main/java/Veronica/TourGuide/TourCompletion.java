package Veronica.TourGuide;

import java.io.Serializable;

public class TourCompletion implements Serializable {

    private int completeId,guestCount;
    private String tourSession,attendance,duration,summary,status;


    public TourCompletion(int completeId, int guestCount, String tourSession, String attendance, String duration, String summary, String status) {
        this.completeId = completeId;
        this.guestCount = guestCount;
        this.tourSession = tourSession;
        this.attendance = attendance;
        this.duration = duration;
        this.summary = summary;
        this.status = status;
    }

    public int getCompleteId() {
        return completeId;
    }

    public void setCompleteId(int completeId) {
        this.completeId = completeId;
    }


    public int getGuestCount() {
        return guestCount;
    }

    public void setGuestCount(int guestCount) {
        this.guestCount = guestCount;
    }


    public String getTourSession() {
        return tourSession;
    }

    public void setTourSession(String tourSession) {
        this.tourSession = tourSession;
    }


    public String getAttendance() {
        return attendance;
    }

    public void setAttendance(String attendance) {
        this.attendance = attendance;
    }


    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }


    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }


    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }


    @Override
    public String toString() {
        return tourSession;
    }
}
