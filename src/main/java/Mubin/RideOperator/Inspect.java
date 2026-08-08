package Mubin.RideOperator;

import java.util.Date;

public class Inspect {
    private int checklistId;
    private String rideId;
    private String resultStatus;
    private Date inspectionDate;

    public Inspect(int checklistId, String rideId, String resultStatus, Date inspectionDate) {
        this.checklistId = checklistId;
        this.rideId = rideId;
        this.resultStatus = resultStatus;
        this.inspectionDate = inspectionDate;
    }

    public int getChecklistId() { return checklistId; }
    public void setChecklistId(int checklistId) { this.checklistId = checklistId; }

    public String getRideId() { return rideId; }
    public void setRideId(String rideId) { this.rideId = rideId; }

    public String getResultStatus() { return resultStatus; }
    public void setResultStatus(String resultStatus) { this.resultStatus = resultStatus; }

    public Date getInspectionDate() { return inspectionDate; }
    public void setInspectionDate(Date inspectionDate) { this.inspectionDate = inspectionDate; }

    @Override
    public String toString() {
        return "InspectionChecklist{" +
                "checklistId=" + checklistId +
                ", rideId='" + rideId + '\'' +
                ", resultStatus='" + resultStatus + '\'' +
                ", inspectionDate=" + inspectionDate +
                '}';
    }
}