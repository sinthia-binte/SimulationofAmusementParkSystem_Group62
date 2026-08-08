package Mubin.RideOperator;

import Mubin.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;


public class RideOperatorViewDashboadController {

    @FXML
    public void initialize() {
    }

    @FXML
    public void operateRideOA(ActionEvent event) {
        SceneSwitcher.switchScene(event, "OperateRideView.fxml", "Operate Ride");
    }

    @FXML
    public void manageBoardingOA(ActionEvent event) {
        SceneSwitcher.switchScene(event, "ManageBoardingView.fxml", "Manage Boarding");
    }

    @FXML
    public void manageRideCycleOA(ActionEvent event) {
        SceneSwitcher.switchScene(event, "ManageRideCycleView.fxml", "Manage Ride Cycle");
    }

    @FXML
    public void viewScheduleButtonOA(ActionEvent event) {
        SceneSwitcher.switchScene(event, "ViewScheduleView.fxml", "View Schedule");
    }

    @FXML
    public void reportIncidentOA(ActionEvent event) {
        SceneSwitcher.switchScene(event, "ReportIncidentView.fxml", "Report Incident");
    }

    @FXML
    public void enforceRestrictionsOA(ActionEvent event) {
        SceneSwitcher.switchScene(event, "EnforceRestrictionsView.fxml", "Enforce Restrictions");
    }

    @FXML
    public void inspectRideOA(ActionEvent event) {
        SceneSwitcher.switchScene(event, "InspectView.fxml", "Inspect Ride");
    }

    @FXML
    public void manageQueueOA(ActionEvent event) {
        SceneSwitcher.switchScene(event, "ManageQueueView.fxml", "Manage Queue");
    }

    @FXML
    public void logOutButtonOA(ActionEvent event) {
        SceneSwitcher.switchScene(event, "/com/oop/simulationofamusementparksystem_group62/LoginView.fxml", "log out");
    }
}