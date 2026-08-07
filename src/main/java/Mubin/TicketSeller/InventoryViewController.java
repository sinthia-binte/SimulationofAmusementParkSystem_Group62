package Mubin.TicketSeller;


import Mubin.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;


public class InventoryViewController {

    @FXML
    private ComboBox<String> ticketTypeComboBox;

    @FXML
    private DatePicker dateDP;

    @FXML
    private Label availableLabel;

    @FXML
    private Label soldLabel;

    @FXML
    private Label reservedLabel;

    @FXML
    public void initialize() {
    }

    @FXML
    public void viewInventoryButtonOA(ActionEvent event) {
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