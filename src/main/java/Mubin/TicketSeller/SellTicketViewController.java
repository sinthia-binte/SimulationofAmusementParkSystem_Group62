package Mubin.TicketSeller;

import Mubin.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;




public class SellTicketViewController {


    @FXML
    private TextField ticketNoTF;

    @FXML
    private TextField visitorCountTF;

    @FXML
    private ComboBox<String> ageCategoryComboBox;

    @FXML
    private ComboBox<String> ticketTypeComboBox;

    @FXML
    private Label isTicketAvailableLabel;

    @FXML
    private Label ticketPriceLabel;

    @FXML
    private Label transactionIdLabel;

    @FXML
    public void initialize() {
    }

    @FXML
    public void checkAvailabilityButtonOA(ActionEvent event) {
    }

    @FXML
    public void processPaymentButtonOA(ActionEvent event) {
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