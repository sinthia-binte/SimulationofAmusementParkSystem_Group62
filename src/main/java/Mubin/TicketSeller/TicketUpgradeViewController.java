package Mubin.TicketSeller;

import Mubin.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class TicketUpgradeViewController {

    @FXML
    private TextField ticketNoTF;

    @FXML
    private ComboBox<String> upgradeOptionComboBox;

    @FXML
    private Label priceDifferenceLabel;

    @FXML
    private Label upgradeConfirmationLabel;

    @FXML
    public void initialize() {
    }

    @FXML
    public void retrieveTicketButtonOA(ActionEvent event) {
    }


    @FXML
    public void adjustPaymentBjuttonOA(ActionEvent event) {
    }


    @FXML
    public void backToDashboardButtonOA(ActionEvent event) {
        SceneSwitcher.switchScene(event, "TicketSellerDashboardView.fxml", "User Dashboard");
    }

    @FXML
    public void logOutButtonOA(ActionEvent event) {
        SceneSwitcher.switchScene(event, "/com/oop/simulationofamusementparksystem_group62/LoginView.fxml", "log out");
    }

}