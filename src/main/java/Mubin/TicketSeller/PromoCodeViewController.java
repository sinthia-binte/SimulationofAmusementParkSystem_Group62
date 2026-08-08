package Mubin.TicketSeller;

import Mubin.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;


public class PromoCodeViewController {


    @FXML
    private TextField promoCodeTF;

    @FXML
    private TextField ticketNoTF;

    @FXML
    private Label discountAppliedLabel;

    @FXML
    private Label newTotalLabel;

    @FXML
    public void initialize() {
    }

    @FXML
    public void validateCodeButtonOA(ActionEvent event) {
    }

    @FXML
    public void completeSaleButtonOA(ActionEvent event) {
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