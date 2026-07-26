package Veronica.TourGuide;

public class Registration {
    private int registrationId,sessionId,numberOfGuests;
    private String groupName,guestDetails,contact,paymentInfo;

    public Registration(int registrationId, int sessionId, int numberOfGuests, String groupName, String guestDetails, String contact, String paymentInfo) {
        this.registrationId = registrationId;
        this.sessionId = sessionId;
        this.numberOfGuests = numberOfGuests;
        this.groupName = groupName;
        this.guestDetails = guestDetails;
        this.contact = contact;
        this.paymentInfo = paymentInfo;
    }

    public int getRegistrationId() {
        return registrationId;
    }

    public void setRegistrationId(int registrationId) {
        this.registrationId = registrationId;
    }

    public int getSessionId() {
        return sessionId;
    }

    public void setSessionId(int sessionId) {
        this.sessionId = sessionId;
    }

    public int getNumberOfGuests() {
        return numberOfGuests;
    }

    public void setNumberOfGuests(int numberOfGuests) {
        this.numberOfGuests = numberOfGuests;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String getGuestDetails() {
        return guestDetails;
    }

    public void setGuestDetails(String guestDetails) {
        this.guestDetails = guestDetails;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getPaymentInfo() {
        return paymentInfo;
    }

    public void setPaymentInfo(String paymentInfo) {
        this.paymentInfo = paymentInfo;
    }
}
