package Veronica.TourGuide;

public class Attendance {

    private int attendanceId;
    private int sessionId;
    private String guestName;
    private String status;


    public Attendance() {
    }


    public Attendance(int attendanceId, int sessionId,
                      String guestName, String status) {

        this.attendanceId = attendanceId;
        this.sessionId = sessionId;
        this.guestName = guestName;
        this.status = status;
    }


    public int getAttendanceId() {
        return attendanceId;
    }

    public void setAttendanceId(int attendanceId) {
        this.attendanceId = attendanceId;
    }


    public int getSessionId() {
        return sessionId;
    }

    public void setSessionId(int sessionId) {
        this.sessionId = sessionId;
    }


    public String getGuestName() {
        return guestName;
    }

    public void setGuestName(String guestName) {
        this.guestName = guestName;
    }


    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
