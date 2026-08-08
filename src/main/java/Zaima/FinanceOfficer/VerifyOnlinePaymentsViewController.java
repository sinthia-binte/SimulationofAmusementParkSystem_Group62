package Zaima.FinanceOfficer;

import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextField;

public class VerifyOnlinePaymentsViewController {
    @javafx.fxml.FXML
    private TableColumn BankTC;
    @javafx.fxml.FXML
    private TableColumn AmountTC;
    @javafx.fxml.FXML
    private TableColumn StatusTC;
    @javafx.fxml.FXML
    private Label VerifyOnlinePaymentsLabel;
    @javafx.fxml.FXML
    private TableColumn TransactionIDTC;
    @javafx.fxml.FXML
    private TableColumn CustomerTC;
    @javafx.fxml.FXML
    private TextField ReferenceCodeTF;
    @javafx.fxml.FXML
    public void initialize() {

        VerifyOnlinePaymentsLabel.setText(
                "Verify Online Payments"
        );
    }

    @javafx.fxml.FXML
    public void VerifyOA(ActionEvent actionEvent) {
        if (ReferenceCodeTF.getText().isEmpty()) {

            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText(
                    "Please enter a reference code."
            );
            alert.showAndWait();

        } else {

            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setContentText(
                    "Payment verified successfully."
            );
            alert.showAndWait();
        }
    }

    @javafx.fxml.FXML
    public void RejectOA(ActionEvent actionEvent) {
        if (ReferenceCodeTF.getText().isEmpty()) {

            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText(
                    "Please enter a reference code."
            );
            alert.showAndWait();

        } else {

            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setContentText(
                    "Payment rejected successfully."
            );
            alert.showAndWait();
        }
    }
}
