package Mubin.RideOperator;

import Mubin.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;


public class ManageQueueViewController {

    @FXML
    private Label queueLengthLabel;

    @FXML
    private Label waitTimeLabel;

    @FXML
    private Label confirmationLabel;

    @FXML
    public void initialize() {
    }

    @FXML
    public void loadQueueStatusOA(ActionEvent event) {
    }

    @FXML
    public void requestCrowdControlOA(ActionEvent event) {
    }

    @FXML
    public void addWaitTimeOA(ActionEvent event) {
    }

    @FXML
    public void backToDashboardOA(ActionEvent event) {
        SceneSwitcher.switchScene(event, "RideOperatorDashboardView.fxml", "User Dashboard");
    }

    @FXML
    public void logOutOA(ActionEvent event) {
        SceneSwitcher.switchScene(event, "/com/oop/simulationofamusementparksystem_group62/LoginView.fxml", "log out");
    }
}