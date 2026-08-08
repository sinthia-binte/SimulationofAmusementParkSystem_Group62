package Mubin.TicketSeller;

import Mubin.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.ListView;

public class TransactionsViewController {

    @FXML
    private DatePicker transactionFromDateDP;

    @FXML
    private DatePicker transactionToDateDP;

    @FXML
    private ListView<String> transactionListView;

    @FXML
    public void initialize() {

    }

    @FXML
    public void searchTransactionsButtonOA(ActionEvent event) {
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