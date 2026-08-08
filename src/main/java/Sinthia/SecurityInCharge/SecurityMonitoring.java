package Sinthia.SecurityInCharge;

public class SecurityMonitoring {

    private String securityStatus;
    private String cctvAlert;
    private String securityRecord;
    private String patrolArea;
    private String incidentDetails;
    private String accessPermission;

    public SecurityMonitoring() {
    }
    public SecurityMonitoring(String securityStatus, String cctvAlert,
                              String securityRecord, String patrolArea,
                              String incidentDetails, String accessPermission) {
        this.securityStatus = securityStatus;
        this.cctvAlert = cctvAlert;
        this.securityRecord = securityRecord;
        this.patrolArea = patrolArea;
        this.incidentDetails = incidentDetails;
        this.accessPermission = accessPermission;
    }

    public String getSecurityStatus() {
        return securityStatus;
    }

    public void setSecurityStatus(String securityStatus) {
        this.securityStatus = securityStatus;
    }

    public String getCctvAlert() {
        return cctvAlert;
    }

    public void setCctvAlert(String cctvAlert) {
        this.cctvAlert = cctvAlert;
    }

    public String getSecurityRecord() {
        return securityRecord;
    }

    public void setSecurityRecord(String securityRecord) {
        this.securityRecord = securityRecord;
    }

    public String getPatrolArea() {
        return patrolArea;
    }

    public void setPatrolArea(String patrolArea) {
        this.patrolArea = patrolArea;
    }

    public String getIncidentDetails() {
        return incidentDetails;
    }

    public void setIncidentDetails(String incidentDetails) {
        this.incidentDetails = incidentDetails;
    }

    public String getAccessPermission() {
        return accessPermission;
    }

    public void setAccessPermission(String accessPermission) {
        this.accessPermission = accessPermission;
    }


    public void recordIncident(String incident) {
        this.incidentDetails = incident;
    }

    public void updateSecurityStatus(String status) {
        this.securityStatus = status;
    }

    public boolean isSecurityAlertActive() {
        return cctvAlert != null && !cctvAlert.isEmpty();
    }

    @Override
    public String toString() {
        return "SecurityMonitoring{" +
                "securityStatus='" + securityStatus + '\'' +
                ", cctvAlert='" + cctvAlert + '\'' +
                ", securityRecord='" + securityRecord + '\'' +
                ", patrolArea='" + patrolArea + '\'' +
                ", incidentDetails='" + incidentDetails + '\'' +
                ", accessPermission='" + accessPermission + '\'' +
                '}';
    }
}