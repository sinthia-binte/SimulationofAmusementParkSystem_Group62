package Sinthia.SecurityInCharge;

public class GuestSecurityService {

    private String guestComplaint;
    private String assistanceType;
    private String assignedTeam;
    private String serviceResponse;
    private String guestFeedback;
    private String serviceQuality;

    public GuestSecurityService() {
    }
    public GuestSecurityService(String guestComplaint,
                                String assistanceType,
                                String assignedTeam,
                                String serviceResponse,
                                String guestFeedback,
                                String serviceQuality) {
        this.guestComplaint = guestComplaint;
        this.assistanceType = assistanceType;
        this.assignedTeam = assignedTeam;
        this.serviceResponse = serviceResponse;
        this.guestFeedback = guestFeedback;
        this.serviceQuality = serviceQuality;
    }

    // Getters and Setters

    public String getGuestComplaint() {
        return guestComplaint;
    }

    public void setGuestComplaint(String guestComplaint) {
        this.guestComplaint = guestComplaint;
    }

    public String getAssistanceType() {
        return assistanceType;
    }

    public void setAssistanceType(String assistanceType) {
        this.assistanceType = assistanceType;
    }

    public String getAssignedTeam() {
        return assignedTeam;
    }

    public void setAssignedTeam(String assignedTeam) {
        this.assignedTeam = assignedTeam;
    }

    public String getServiceResponse() {
        return serviceResponse;
    }

    public void setServiceResponse(String serviceResponse) {
        this.serviceResponse = serviceResponse;
    }

    public String getGuestFeedback() {
        return guestFeedback;
    }

    public void setGuestFeedback(String guestFeedback) {
        this.guestFeedback = guestFeedback;
    }

    public String getServiceQuality() {
        return serviceQuality;
    }

    public void setServiceQuality(String serviceQuality) {
        this.serviceQuality = serviceQuality;
    }


    public void recordComplaint(String complaint) {
        this.guestComplaint = complaint;
    }

    public void assignTeam(String team) {
        this.assignedTeam = team;
    }

    public void provideAssistance(String response) {
        this.serviceResponse = response;
    }

    public void recordFeedback(String feedback) {
        this.guestFeedback = feedback;
    }

    public boolean hasComplaint() {
        return guestComplaint != null &&
                !guestComplaint.isEmpty();
    }

    @Override
    public String toString() {
        return "GuestSecurityService{" +
                "guestComplaint='" + guestComplaint + '\'' +
                ", assistanceType='" + assistanceType + '\'' +
                ", assignedTeam='" + assignedTeam + '\'' +
                ", serviceResponse='" + serviceResponse + '\'' +
                ", guestFeedback='" + guestFeedback + '\'' +
                ", serviceQuality='" + serviceQuality + '\'' +
                '}';
    }
}