package Mubin.RideOperator;

import Mubin.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;


public class OperateRideViewController {

    @FXML
    public void initialize() {
    }

    @FXML
    public void startRideButtonOA(ActionEvent event) {
    }

    @FXML
    public void stopRideButtonOA(ActionEvent event) {
    }

    @FXML
    public void emergencyStopButtonOA(ActionEvent event) {
    }

    @FXML
    public void backToDashboardButtonOA(ActionEvent event) {
        SceneSwitcher.switchScene(event, "RideOperatorDashboardView.fxml", "User Dashboard");
    }

    @FXML
    public void logOUTButtonOA(ActionEvent event) {
        SceneSwitcher.switchScene(event, "/com/oop/simulationofamusementparksystem_group62/LoginView.fxml", "log out");
    }
}