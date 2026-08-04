package Veronica.MaintenanceTechnician;

import java.io.Serializable;
import java.time.LocalDate;

public class FaultReport implements Serializable {

    private String faultId, rideId, rideName, faultDescription, severity, observedIssue, reportedBy;
    private LocalDate reportDate;


    public FaultReport(String faultId,
                       String rideId,
                       String rideName,
                       String faultDescription,
                       String severity,
                       String observedIssue,
                       String reportedBy) {

        this.faultId = faultId;
        this.rideId = rideId;
        this.rideName = rideName;
        this.faultDescription = faultDescription;
        this.severity = severity;
        this.observedIssue = observedIssue;
        this.reportedBy = reportedBy;
        this.reportDate = LocalDate.now();

    }


    public String getFaultId() {
        return faultId;
    }


    public String getRideId() {
        return rideId;
    }


    public String getRideName() {
        return rideName;
    }


    public String getFaultDescription() {
        return faultDescription;
    }


    public String getSeverity() {
        return severity;
    }


    public String getObservedIssue() {
        return observedIssue;
    }


    public String getReportedBy() {
        return reportedBy;
    }


    public LocalDate getReportDate() {
        return reportDate;
    }


    @Override
    public String toString() {

        return "Fault ID: " + faultId +
                "\nRide: " + rideName +
                "\nDescription: " + faultDescription +
                "\nSeverity: " + severity +
                "\nObserved Issue: " + observedIssue +
                "\nReported By: " + reportedBy +
                "\nDate: " + reportDate;

    }
}