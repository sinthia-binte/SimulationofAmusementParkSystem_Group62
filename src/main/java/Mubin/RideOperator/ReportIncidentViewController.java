package Mubin.RideOperator;

import Mubin.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;


public class ReportIncidentViewController {

    @FXML
    private ComboBox<String> incidentTypeComboBox;

    @FXML
    private TextField incidentDetailsTF;

    @FXML
    private CheckBox isGuestInvoledCheckBox;

    @FXML
    public void initialize() {
    }

    @FXML
    public void submitIncidentRIS(ActionEvent event) {
    }

    @FXML
    public void backToDashboardRIS(ActionEvent event) {
        SceneSwitcher.switchScene(event, "RideOperatorDashboardView.fxml", "User Dashboard");
    }

    @FXML
    public void logOutButtonOA(ActionEvent event) {
        SceneSwitcher.switchScene(event, "/com/oop/simulationofamusementparksystem_group62/LoginView.fxml", "log out");
    }
}