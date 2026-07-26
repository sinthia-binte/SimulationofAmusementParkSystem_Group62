package Mubin.TicketSeller;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class SellTicketViewController {
    @javafx.fxml.FXML
    private ComboBox ticketTypeComboBox;
    @javafx.fxml.FXML
    private Label transactionIdLabel;
    @javafx.fxml.FXML
    private Label isTicketAvailableLabel;
    @javafx.fxml.FXML
    private TextField ticketNoTF;
    @javafx.fxml.FXML
    private Label ticketPriceLabel;
    @javafx.fxml.FXML
    private ComboBox ageCategoryComboBox;
    @javafx.fxml.FXML
    private TextField visitorCountTF;

    @javafx.fxml.FXML
    public void processPaymentButtonOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void backToDashboardButtonOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void checkAvailabilityButtonOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void logOutButtonOA(ActionEvent actionEvent) {
    }
}
