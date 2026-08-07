package Mubin.TicketSeller;

import Mubin.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;


public class GroupBookingViewController {

    @FXML
    private TextField groupNameTF;

    @FXML
    private TextField contactPersonTF;

    @FXML
    private TextField memberCountTF;

    @FXML
    private DatePicker visitDateDP;

    @FXML
    private Label totalCostLabel;

    @FXML
    public void initialize() {
    }

    @FXML
    public void checkCapacityButtonOA(ActionEvent event) {
    }

    @FXML
    public void confirmBookingButtonOA(ActionEvent event) {
    }

    @FXML
    public void backToDashboardGBS(ActionEvent event) {
        SceneSwitcher.switchScene(event, "TicketSellerDashboardView.fxml", "User Dashboard");
    }
}