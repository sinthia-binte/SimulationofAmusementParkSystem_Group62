package Veronica.MaintenanceTechnician;

import java.time.LocalDate;

public class FaultReport {
    private String reportId,rideId, equipmentName,faultDescription,severity,observedIssue,supportingNotes,imagePath,reportedBy,status;
    private LocalDate reportDate;


    public FaultReport(String reportId, String rideId, String equipmentName, String faultDescription, String severity, String observedIssue, String supportingNotes, String imagePath, String reportedBy, String status, LocalDate reportDate) {
        this.reportId = reportId;
        this.rideId = rideId;
        this.equipmentName = equipmentName;
        this.faultDescription = faultDescription;
        this.severity = severity;
        this.observedIssue = observedIssue;
        this.supportingNotes = supportingNotes;
        this.imagePath = imagePath;
        this.reportedBy = reportedBy;
        this.status = status;
        this.reportDate = reportDate;
    }

    public String getReportId() {
        return reportId;
    }

    public void setReportId(String reportId) {
        this.reportId = reportId;
    }

    public String getRideId() {
        return rideId;
    }

    public void setRideId(String rideId) {
        this.rideId = rideId;
    }

    public String getEquipmentName() {
        return equipmentName;
    }

    public void setEquipmentName(String equipmentName) {
        this.equipmentName = equipmentName;
    }

    public String getFaultDescription() {
        return faultDescription;
    }

    public void setFaultDescription(String faultDescription) {
        this.faultDescription = faultDescription;
    }

    public String getSeverity() {
        return severity;
    }

    public void setSeverity(String severity) {
        this.severity = severity;
    }

    public String getObservedIssue() {
        return observedIssue;
    }

    public void setObservedIssue(String observedIssue) {
        this.observedIssue = observedIssue;
    }

    public String getSupportingNotes() {
        return supportingNotes;
    }

    public void setSupportingNotes(String supportingNotes) {
        this.supportingNotes = supportingNotes;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public String getReportedBy() {
        return reportedBy;
    }

    public void setReportedBy(String reportedBy) {
        this.reportedBy = reportedBy;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDate getReportDate() {
        return reportDate;
    }

    public void setReportDate(LocalDate reportDate) {
        this.reportDate = reportDate;
    }
}
