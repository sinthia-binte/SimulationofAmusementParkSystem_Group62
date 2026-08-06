package Veronica.MaintenanceTechnician;

import java.io.Serializable;
import java.time.LocalDate;

public class RideInspection implements Serializable {

    private int reportId;
    private String rideId,rideName,safetyHistory,status,findings,conditionStatus,notes,inspectedBy;
    private LocalDate inspectionDate,lastMaintenanceDate;

    public RideInspection(int reportId, String rideId, String rideName, String safetyHistory, String status, String findings, String conditionStatus, String notes, String inspectedBy, LocalDate inspectionDate, LocalDate lastMaintenanceDate) {
        this.reportId = reportId;
        this.rideId = rideId;
        this.rideName = rideName;
        this.safetyHistory = safetyHistory;
        this.status = status;
        this.findings = findings;
        this.conditionStatus = conditionStatus;
        this.notes = notes;
        this.inspectedBy = inspectedBy;
        this.inspectionDate = inspectionDate;
        this.lastMaintenanceDate = lastMaintenanceDate;
    }

    public int getReportId() {
        return reportId;
    }


    public void setReportId(int reportId) {
        this.reportId = reportId;
    }


    public String getRideId() {
        return rideId;
    }


    public void setRideId(String rideId) {
        this.rideId = rideId;
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


    public LocalDate getLastMaintenanceDate() {
        return lastMaintenanceDate;
    }


    public void setLastMaintenanceDate(LocalDate lastMaintenanceDate) {
        this.lastMaintenanceDate = lastMaintenanceDate;
    }


    public String getStatus() {
        return status;
    }


    public void setStatus(String status) {
        this.status = status;
    }


    public String getFindings() {
        return findings;
    }


    public void setFindings(String findings) {
        this.findings = findings;
    }


    public String getConditionStatus() {
        return conditionStatus;
    }


    public void setConditionStatus(String conditionStatus) {
        this.conditionStatus = conditionStatus;
    }


    public String getNotes() {
        return notes;
    }


    public void setNotes(String notes) {
        this.notes = notes;
    }


    public String getInspectedBy() {
        return inspectedBy;
    }


    public void setInspectedBy(String inspectedBy) {
        this.inspectedBy = inspectedBy;
    }


    public LocalDate getInspectionDate() {
        return inspectionDate;
    }


    public void setInspectionDate(LocalDate inspectionDate) {
        this.inspectionDate = inspectionDate;
    }


    @Override
    public String toString() {
        return "Report ID: " + reportId +
                ", Ride ID: " + rideId +
                ", Ride Name: " + rideName +
                ", Status: " + status +
                ", Condition: " + conditionStatus +
                ", Findings: " + findings +
                ", Date: " + inspectionDate;
    }
}