package Zaima.FinanceOfficer;

import javafx.event.ActionEvent;
import javafx.scene.control.*;

public class FinancialReportsViewController {
    @javafx.fxml.FXML
    private TableColumn ExpenseTC;
    @javafx.fxml.FXML
    private ComboBox ReportTypeCB;
    @javafx.fxml.FXML
    private DatePicker StartDateDP;
    @javafx.fxml.FXML
    private Label FinancialReportsLabel;
    @javafx.fxml.FXML
    private TableColumn IncomeTC;
    @javafx.fxml.FXML
    private DatePicker EndDateDP;
    @javafx.fxml.FXML
    private TableColumn ProfitTC;

    @javafx.fxml.FXML
    public void initialize() {

        FinancialReportsLabel.setText(
                "Financial Reports"
        );

        ReportTypeCB.getItems().addAll(
                "Income Report",
                "Expense Report",
                "Profit Report"
        );
    }


    @javafx.fxml.FXML
    public void ExportOA(ActionEvent actionEvent) {
        if (ReportTypeCB.getValue() == null) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText("Please select a report type.");
            alert.showAndWait();
        }

        if (StartDateDP.getValue() == null) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText("Please select a start date.");
            alert.showAndWait();
        }

        if (EndDateDP.getValue() == null) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText("Please select an end date.");
            alert.showAndWait();
        }

        if (ReportTypeCB.getValue() != null
                && StartDateDP.getValue() != null
                && EndDateDP.getValue() != null) {

            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setContentText("Financial report exported successfully.");
            alert.showAndWait();
        }

    }

    @javafx.fxml.FXML
    public void GenerateOA(ActionEvent actionEvent) {
        if (ReportTypeCB.getValue() == null) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText("Please select a report type.");
            alert.showAndWait();
        }

        if (StartDateDP.getValue() == null) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText("Please select a start date.");
            alert.showAndWait();
        }

        if (EndDateDP.getValue() == null) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText("Please select an end date.");
            alert.showAndWait();
        }

        if (ReportTypeCB.getValue() != null
                && StartDateDP.getValue() != null
                && EndDateDP.getValue() != null) {

            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setContentText("Financial report generated successfully.");
            alert.showAndWait();
        }
    }
}
