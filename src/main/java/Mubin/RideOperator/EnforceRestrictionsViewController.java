package Mubin.RideOperator;


import Mubin.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;


public class EnforceRestrictionsViewController {

    @FXML
    private TextField guestHeightTF;

    @FXML
    private ComboBox<String> healthDeclarationComboBox;

    @FXML
    private Label complianceResultLabel;

    @FXML
    public void initialize() {
    }

    @FXML
    public void checkEligibilityButtonOA(ActionEvent event) {
    }

    @FXML
    public void allowBoardingButtonOA(ActionEvent event) {
    }

    @FXML
    public void refuseBoardingButtonOA(ActionEvent event) {
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