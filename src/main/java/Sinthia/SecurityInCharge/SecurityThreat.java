package Sinthia.SecurityInCharge;

public class SecurityThreat {

    private String incidentType;
    private String incidentLocation;
    private String frequency;
    private String highRiskArea;
    private String assignedPersonnel;
    private String correctiveAction;

    public SecurityThreat() {
    }
    public SecurityThreat(String incidentType, String incidentLocation,
                          String frequency, String highRiskArea,
                          String assignedPersonnel, String correctiveAction) {
        this.incidentType = incidentType;
        this.incidentLocation = incidentLocation;
        this.frequency = frequency;
        this.highRiskArea = highRiskArea;
        this.assignedPersonnel = assignedPersonnel;
        this.correctiveAction = correctiveAction;
    }

    public String getIncidentType() {
        return incidentType;
    }

    public void setIncidentType(String incidentType) {
        this.incidentType = incidentType;
    }

    public String getIncidentLocation() {
        return incidentLocation;
    }

    public void setIncidentLocation(String incidentLocation) {
        this.incidentLocation = incidentLocation;
    }

    public String getFrequency() {
        return frequency;
    }

    public void setFrequency(String frequency) {
        this.frequency = frequency;
    }

    public String getHighRiskArea() {
        return highRiskArea;
    }

    public void setHighRiskArea(String highRiskArea) {
        this.highRiskArea = highRiskArea;
    }

    public String getAssignedPersonnel() {
        return assignedPersonnel;
    }

    public void setAssignedPersonnel(String assignedPersonnel) {
        this.assignedPersonnel = assignedPersonnel;
    }

    public String getCorrectiveAction() {
        return correctiveAction;
    }

    public void setCorrectiveAction(String correctiveAction) {
        this.correctiveAction = correctiveAction;
    }

    public void assignPersonnel(String personnel) {
        this.assignedPersonnel = personnel;
    }

    public void addCorrectiveAction(String action) {
        this.correctiveAction = action;
    }

    public boolean isHighRisk() {
        return highRiskArea != null && !highRiskArea.isEmpty();
    }

    @Override
    public String toString() {
        return "SecurityThreat{" +
                "incidentType='" + incidentType + '\'' +
                ", incidentLocation='" + incidentLocation + '\'' +
                ", frequency='" + frequency + '\'' +
                ", highRiskArea='" + highRiskArea + '\'' +
                ", assignedPersonnel='" + assignedPersonnel + '\'' +
                ", correctiveAction='" + correctiveAction + '\'' +
                '}';
    }
}