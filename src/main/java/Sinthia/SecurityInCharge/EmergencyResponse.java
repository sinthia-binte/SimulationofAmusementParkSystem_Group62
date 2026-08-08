package Sinthia.SecurityInCharge;

import java.time.LocalDate;

public class EmergencyResponse {

    private String emergencyPlan;
    private LocalDate drillDate;
    private String drillType;
    private String participants;
    private String emergencyType;
    private String responseAction;
    private String evacuationRescue;

    public EmergencyResponse() {
    }
    public EmergencyResponse(String emergencyPlan, LocalDate drillDate,
                             String drillType, String participants,
                             String emergencyType, String responseAction,
                             String evacuationRescue) {
        this.emergencyPlan = emergencyPlan;
        this.drillDate = drillDate;
        this.drillType = drillType;
        this.participants = participants;
        this.emergencyType = emergencyType;
        this.responseAction = responseAction;
        this.evacuationRescue = evacuationRescue;
    }

    public String getEmergencyPlan() {
        return emergencyPlan;
    }

    public void setEmergencyPlan(String emergencyPlan) {
        this.emergencyPlan = emergencyPlan;
    }

    public LocalDate getDrillDate() {
        return drillDate;
    }

    public void setDrillDate(LocalDate drillDate) {
        this.drillDate = drillDate;
    }

    public String getDrillType() {
        return drillType;
    }

    public void setDrillType(String drillType) {
        this.drillType = drillType;
    }

    public String getParticipants() {
        return participants;
    }

    public void setParticipants(String participants) {
        this.participants = participants;
    }

    public String getEmergencyType() {
        return emergencyType;
    }

    public void setEmergencyType(String emergencyType) {
        this.emergencyType = emergencyType;
    }

    public String getResponseAction() {
        return responseAction;
    }

    public void setResponseAction(String responseAction) {
        this.responseAction = responseAction;
    }

    public String getEvacuationRescue() {
        return evacuationRescue;
    }

    public void setEvacuationRescue(String evacuationRescue) {
        this.evacuationRescue = evacuationRescue;
    }

    public void conductDrill() {
        System.out.println("Emergency drill conducted: " + drillType);
    }

    public void respondToEmergency(String action) {
        this.responseAction = action;
    }

    public boolean hasEmergencyPlan() {
        return emergencyPlan != null && !emergencyPlan.isEmpty();
    }

    @Override
    public String toString() {
        return "EmergencyResponse{" +
                "emergencyPlan='" + emergencyPlan + '\'' +
                ", drillDate=" + drillDate +
                ", drillType='" + drillType + '\'' +
                ", participants='" + participants + '\'' +
                ", emergencyType='" + emergencyType + '\'' +
                ", responseAction='" + responseAction + '\'' +
                ", evacuationRescue='" + evacuationRescue + '\'' +
                '}';
    }
}