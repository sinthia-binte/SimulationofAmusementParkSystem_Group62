package Mubin.RideOperator;

import Mubin.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;


public class InspectViewController {

    @FXML
    private ComboBox<String> checkedItemComboBox;

    @FXML
    private Label resultComboBox;

    @FXML
    private ComboBox<String> submitResultComboBox;

    @FXML
    public void initialize() {
    }

    @FXML
    public void submitInspectionButtonOA(ActionEvent event) {
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