package Veronica.MaintenanceTechnician;

import java.io.Serializable;
import java.time.LocalDate;

public class MaintenanceRecord implements Serializable {
    private int recordId,rideId;
    private String technicianName,rideName,workDescription,partsReplaced,issuesFixed,maintenanceStatus;
    private LocalDate maintenanceDate;


    public MaintenanceRecord(int recordId, int rideId, String technicianName, String rideName, String workDescription, String partsReplaced, String issuesFixed, String maintenanceStatus, LocalDate maintenanceDate) {
        this.recordId = recordId;
        this.rideId = rideId;
        this.technicianName = technicianName;
        this.rideName = rideName;
        this.workDescription = workDescription;
        this.partsReplaced = partsReplaced;
        this.issuesFixed = issuesFixed;
        this.maintenanceStatus = maintenanceStatus;
        this.maintenanceDate = maintenanceDate;
    }


    public int getRecordId() {
        return recordId;
    }

    public void setRecordId(int recordId) {
        this.recordId = recordId;
    }

    public int getRideId() {
        return rideId;
    }

    public void setRideId(int rideId) {
        this.rideId = rideId;
    }

    public String getTechnicianName() {
        return technicianName;
    }

    public void setTechnicianName(String technicianName) {
        this.technicianName = technicianName;
    }

    public String getRideName() {
        return rideName;
    }

    public void setRideName(String rideName) {
        this.rideName = rideName;
    }

    public String getWorkDescription() {
        return workDescription;
    }

    public void setWorkDescription(String workDescription) {
        this.workDescription = workDescription;
    }

    public String getPartsReplaced() {
        return partsReplaced;
    }

    public void setPartsReplaced(String partsReplaced) {
        this.partsReplaced = partsReplaced;
    }

    public String getIssuesFixed() {
        return issuesFixed;
    }

    public void setIssuesFixed(String issuesFixed) {
        this.issuesFixed = issuesFixed;
    }

    public String getMaintenanceStatus() {
        return maintenanceStatus;
    }

    public void setMaintenanceStatus(String maintenanceStatus) {
        this.maintenanceStatus = maintenanceStatus;
    }

    public LocalDate getMaintenanceDate() {
        return maintenanceDate;
    }

    public void setMaintenanceDate(LocalDate maintenanceDate) {
        this.maintenanceDate = maintenanceDate;
    }
}
