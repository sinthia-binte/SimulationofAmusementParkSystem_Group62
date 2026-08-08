package Sinthia.SecurityInCharge;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class SecurityInChargeDashBoardViewController {
    @javafx.fxml.FXML
    private Label titleLabel;
    @javafx.fxml.FXML
    private TextField goalTF;
    @javafx.fxml.FXML
    private AnchorPane mainPane;

    SecurityInChargeDashBoard dashboard =
            new SecurityInChargeDashBoard(
                    "Security Monitoring",
                    "Security Threat Management",
                    "Emergency Response",
                    "Security Report",
                    "Safety Compliance",
                    "Registration",
                    "Security Staff Training",
                    "Guest Security & Service"
            );

    @FXML
    public void goal1ButtonOA(ActionEvent actionEvent) {
        goalTF.setText("1");
    }

    @FXML
    public void goal2ButtonOA(ActionEvent actionEvent) {
        goalTF.setText("2");
    }

    @FXML
    public void goal3ButtonOA(ActionEvent actionEvent) {
        goalTF.setText("3");
    }

    @FXML
    public void goal4ButtonOA(ActionEvent actionEvent) {
        goalTF.setText("4");
    }

    @FXML
    public void goal5ButtonOA(ActionEvent actionEvent) {
        goalTF.setText("5");
    }

    @FXML
    public void goal6ButtonOA(ActionEvent actionEvent) {
        goalTF.setText("6");
    }

    @FXML
    public void goal7ButtonOA(ActionEvent actionEvent) {
        goalTF.setText("7");
    }

    @FXML
    public void goal8ButtonOA(ActionEvent actionEvent) {
        goalTF.setText("8");
    }

    @FXML
    public void openGoalOA(ActionEvent actionEvent) throws IOException {

        String goal = goalTF.getText();

        String fxmlFile = "";

        if (goal.equals("1")) {

            dashboard.securityMonitoring();

            fxmlFile =
                    "/com/oop/simulationofamusementparksystem_group62/" +
                            "Sinthia/SecurityInCharge/SecurityMonitor.fxml";

        } else if (goal.equals("2")) {

            dashboard.securityThreatManagement();

            fxmlFile =
                    "/com/oop/simulationofamusementparksystem_group62/" +
                            "Sinthia/SecurityInCharge/SecurityThreatManagement.fxml";

        } else if (goal.equals("3")) {

            dashboard.emergencyResponse();

            fxmlFile =
                    "/com/oop/simulationofamusementparksystem_group62/" +
                            "Sinthia/SecurityInCharge/EmergencyResponseManagement.fxml";

        } else if (goal.equals("4")) {

            dashboard.securityReport();

            fxmlFile =
                    "/com/oop/simulationofamusementparksystem_group62/" +
                            "Sinthia/SecurityInCharge/SecurityReport.fxml";

        } else if (goal.equals("5")) {

            dashboard.safetyCompliance();

            fxmlFile =
                    "/com/oop/simulationofamusementparksystem_group62/" +
                            "Sinthia/SecurityInCharge/SafetyComplianceManagement.fxml";

        } else if (goal.equals("6")) {

            dashboard.registration();

            fxmlFile =
                    "/com/oop/simulationofamusementparksystem_group62/" +
                            "Sinthia/SecurityInCharge/Registration.fxml";

        } else if (goal.equals("7")) {

            dashboard.securityStaffTraining();

            fxmlFile =
                    "/com/oop/simulationofamusementparksystem_group62/" +
                            "Sinthia/SecurityInCharge/SecurityStaffTrainingManagement.fxml";

        } else if (goal.equals("8")) {

            dashboard.guestSecurityService();

            fxmlFile =
                    "/com/oop/simulationofamusementparksystem_group62/" +
                            "Sinthia/SecurityInCharge/GuestSecurity&ServiceManagement.fxml";

        } else {

            goalTF.setText("Enter 1-8");
            return;
        }


        FXMLLoader loader =
                new FXMLLoader(getClass().getResource(fxmlFile));

        Parent root = loader.load();

        mainPane.getChildren().clear();
        mainPane.getChildren().add(root);
    }
}
