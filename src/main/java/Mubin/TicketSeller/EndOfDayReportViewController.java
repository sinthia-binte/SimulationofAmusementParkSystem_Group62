package Mubin.TicketSeller;

import Mubin.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;


public class EndOfDayReportViewController {

    @FXML
    private DatePicker dateDP;

    @FXML
    private Label totalRevenueLabel;

    @FXML
    private TextField cashCountTF;

    @FXML
    public void initialize() {
    }

    @FXML
    public void viewRevenueButtonOA(ActionEvent event) {
    }

    @FXML
    public void submitReportButtonOA(ActionEvent event) {
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