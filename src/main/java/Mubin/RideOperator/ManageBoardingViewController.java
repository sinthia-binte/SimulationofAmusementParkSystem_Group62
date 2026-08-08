package Mubin.RideOperator;

import Mubin.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;


public class ManageBoardingViewController {

    @FXML
    private TextField guestCountField;

    @FXML
    public void initialize() {
    }

    @FXML
    public void openQueueGateMBS(ActionEvent event) {
    }

    @FXML
    public void confirmBoardingMBS(ActionEvent event) {
    }

    @FXML
    public void backToDashboardMBS(ActionEvent event) {
        SceneSwitcher.switchScene(event, "RideOperatorDashboardView.fxml", "User Dashboard");
    }

    @FXML
    public void logOutButtonOA(ActionEvent event) {
        SceneSwitcher.switchScene(event, "/com/oop/simulationofamusementparksystem_group62/LoginView.fxml", "log out");
    }
}