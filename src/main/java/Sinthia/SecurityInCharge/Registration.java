package Sinthia.SecurityInCharge;

import javafx.event.ActionEvent;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Registration {
    private String registrationID;
    private String participantName;
    private String status;

    public Registration() {}

    public Registration(String registrationID, String participantName, String status) {
        this.registrationID = registrationID;
        this.participantName = participantName;
        this.status = status;
    }
    public String getRegistrationID() { return registrationID; }
    public void setRegistrationID(String registrationID) { this.registrationID = registrationID; }

    public String getParticipantName() { return participantName; }
    public void setParticipantName(String participantName) { this.participantName = participantName; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    public boolean register() { return true; }
    public boolean cancelRegistration() { return true; }

    @Override
    public String toString() {
        return "Registration{" + "registrationID='" + registrationID + '\'' + ", participantName='" + participantName + '\'' + ", status='" + status + '\'' + '}';
    }

    public static class SecurityReportVeiwcontroller {
        @javafx.fxml.FXML
        private TextField reportIdTF;
        @javafx.fxml.FXML
        private TextArea summaryTA;
        @javafx.fxml.FXML
        private Label securityReportLabel;
        @javafx.fxml.FXML
        private DatePicker DateDP;

        @javafx.fxml.FXML
        public void reportGenerateButtonOA(ActionEvent actionEvent) {
        }
    }
}
