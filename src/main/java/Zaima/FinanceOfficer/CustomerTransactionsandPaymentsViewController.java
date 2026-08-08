package Zaima.FinanceOfficer;

import javafx.event.ActionEvent;
import javafx.scene.control.*;

public class CustomerTransactionsandPaymentsViewController {
    @javafx.fxml.FXML
    private TableColumn PaymentMethodTC;
    @javafx.fxml.FXML
    private TableColumn AmountTC;
    @javafx.fxml.FXML
    private TableColumn StatusTC;
    @javafx.fxml.FXML
    private TextField TicketNumberSearchTF;
    @javafx.fxml.FXML
    private TableColumn TicketNumberTC;
    @javafx.fxml.FXML
    private Label CustomerTransactionsandPaymentsLabel;
    @javafx.fxml.FXML
    private ComboBox PaymentStatusCB;
    @javafx.fxml.FXML
    private TableColumn CustomerTC;
    @javafx.fxml.FXML
    public void initialize() {

        CustomerTransactionsandPaymentsLabel.setText(
                "Customer Transactions and Payments"
        );

        PaymentStatusCB.getItems().addAll(
                "Paid",
                "Pending",
                "Refunded"
        );
    }


    @javafx.fxml.FXML
    public void UpdateStatusOA(ActionEvent actionEvent) {
        if (PaymentStatusCB.getValue() == null) {

            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText("Please select a payment status.");
            alert.showAndWait();

        } else {

            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setContentText("Payment status updated successfully.");
            alert.showAndWait();
        }
    }


    @javafx.fxml.FXML
    public void RefreshOA(ActionEvent actionEvent) {
        TicketNumberSearchTF.clear();
        PaymentStatusCB.setValue(null);

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setContentText("Transaction information refreshed.");
        alert.showAndWait();
    }


    @javafx.fxml.FXML
    public void SearchOA(ActionEvent actionEvent) {
        if (TicketNumberSearchTF.getText().isEmpty()) {

            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText("Please enter a ticket number.");
            alert.showAndWait();

        } else {

            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setContentText("Ticket information found.");
            alert.showAndWait();
        }
    }
    }

