package Mubin.TicketSeller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import Mubin.SceneSwitcher;

public class TicketSellerDashboardViewController {


    @FXML
    public void initialize() {
    }

    @FXML
    public void sellTicketButtonOA(ActionEvent event) {
        SceneSwitcher.switchScene(event, "SellTicket.fxml", "Sell Ticket");
    }

    @FXML
    public void updateTicketButtonOA(ActionEvent event) {
        SceneSwitcher.switchScene(event, "UpdateTicket.fxml", "Upgrade Ticket");
    }

    @FXML
    public void applyPromoCodeButtonOA(ActionEvent event) {
        SceneSwitcher.switchScene(event, "ApplyPromoCode.fxml", "Apply Promo Code");
    }

    @FXML
    public void processGroupBookingButtonOA(ActionEvent event) {
        SceneSwitcher.switchScene(event, "ProcessGroupBooking.fxml", "Process Group Booking");
    }

    @FXML
    public void processRefundButtonOA(ActionEvent event) {
        SceneSwitcher.switchScene(event, "ProcessRefund.fxml", "Process Refund");
    }

    @FXML
    public void viewTransactionButtonOA(ActionEvent event) {
        SceneSwitcher.switchScene(event, "ViewTransaction.fxml", "View Transaction");
    }

    @FXML
    public void checkInventoryButtonOA(ActionEvent event) {
        SceneSwitcher.switchScene(event, "CheckInventory.fxml", "Check Inventory");
    }


    @FXML
    public void eodReportButtonOA(ActionEvent event) {
        SceneSwitcher.switchScene(event, "EndOfDayReport.fxml", "End of Day Report");
    }

    @FXML
    public void logoutOA(ActionEvent event) {
        SceneSwitcher.switchScene(event, "/com/oop/simulationofamusementparksystem_group62/LoginView.fxml", "log out");
    }
}