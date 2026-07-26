package Veronica.TourGuide;

public class TourCompletion {

    private int CompleteId,guestCount;
    private String tourSession,attendance,during,summary,status;

    public TourCompletion(int completeId, int guestCount, String tourSession, String attendance, String during, String summary, String status) {
        CompleteId = completeId;
        this.guestCount = guestCount;
        this.tourSession = tourSession;
        this.attendance = attendance;
        this.during = during;
        this.summary = summary;
        this.status = status;
    }


    public int getCompleteId() {
        return CompleteId;
    }

    public void setCompleteId(int completeId) {
        CompleteId = completeId;
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

    public String getDuring() {
        return during;
    }

    public void setDuring(String during) {
        this.during = during;
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
}
