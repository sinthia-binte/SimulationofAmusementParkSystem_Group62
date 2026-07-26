package Veronica.MaintenanceTechnician;

public class RideInspection {
    private int reportId;
    private String rideName,safetyHistory;


    public RideInspection(int reportId, String rideName, String safetyHistory) {
        this.reportId = reportId;
        this.rideName = rideName;
        this.safetyHistory = safetyHistory;
    }

    public int getReportId() {
        return reportId;
    }

    public void setReportId(int reportId) {
        this.reportId = reportId;
    }

    public String getRideName() {
        return rideName;
    }

    public void setRideName(String rideName) {
        this.rideName = rideName;
    }

    public String getSafetyHistory() {
        return safetyHistory;
    }

    public void setSafetyHistory(String safetyHistory) {
        this.safetyHistory = safetyHistory;
    }
}
