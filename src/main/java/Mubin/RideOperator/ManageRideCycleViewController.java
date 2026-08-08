package Mubin.RideOperator;

import Mubin.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;


public class ManageRideCycleViewController {

    @FXML
    public void initialize() {
    }

    @FXML
    public void confirmStopButtonOA(ActionEvent event) {
    }

    @FXML
    public void releaseRestraintsButtonOA(ActionEvent event) {
    }

    @FXML
    public void guestExitOA(ActionEvent event) {
    }

    @FXML
    public void confirmReadyButtonOA(ActionEvent event) {
    }

    @FXML
    public void backToDashboardButtonOA(ActionEvent event) {
        SceneSwitcher.switchScene(event, "RideOperatorDashboardView.fxml", "User Dashboard");
    }

    @FXML
    public void logOutButtonOA(ActionEvent event) {
        SceneSwitcher.switchScene(event, "/com/oop/simulationofamusementparksystem_group62/LoginView.fxml", "log out");
    }
}