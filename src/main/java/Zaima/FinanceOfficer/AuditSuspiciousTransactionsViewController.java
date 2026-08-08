package Zaima.FinanceOfficer;

import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextArea;

public class AuditSuspiciousTransactionsViewController {
    @javafx.fxml.FXML
    private TextArea ReviewNotesTA;
    @javafx.fxml.FXML
    private TableColumn AmountTC;
    @javafx.fxml.FXML
    private TableColumn StatusTC;
    @javafx.fxml.FXML
    private Label AuditSuspiciousTransactionsLabel;
    @javafx.fxml.FXML
    private TableColumn RiskLevelTC;
    @javafx.fxml.FXML
    private TableColumn TransactionIDTC;
    @javafx.fxml.FXML
    private TableColumn CustomerTC;


    @javafx.fxml.FXML
    public void initialize() {

        AuditSuspiciousTransactionsLabel.setText(
                "Audit Suspicious Transactions"
        );
    }

        @javafx.fxml.FXML
        public void RejectOA (ActionEvent actionEvent) {
            if (ReviewNotesTA.getText().isEmpty()) {

                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setContentText(
                        "Please enter review notes."
                );
                alert.showAndWait();

            } else {

                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setContentText(
                        "Transaction rejected successfully."
                );
                alert.showAndWait();
            }
        }





    @javafx.fxml.FXML
    public void ApproveOA(ActionEvent actionEvent) {
        if (ReviewNotesTA.getText().isEmpty()) {

            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText(
                    "Please enter review notes."
            );
            alert.showAndWait();

        } else {

            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setContentText(
                    "Transaction approved successfully."
            );
            alert.showAndWait();
        }
    }



    @javafx.fxml.FXML
    public void FlagOA(ActionEvent actionEvent) {
        if (ReviewNotesTA.getText().isEmpty()) {

            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText(
                    "Please enter review notes."
            );
            alert.showAndWait();

        } else {

            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setContentText(
                    "Transaction flagged successfully."
            );
            alert.showAndWait();
        }
    }
}
