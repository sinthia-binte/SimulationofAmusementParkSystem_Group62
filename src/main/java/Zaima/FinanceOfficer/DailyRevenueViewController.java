package Zaima.FinanceOfficer;

import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;

public class DailyRevenueViewController {
    @javafx.fxml.FXML
    private TableColumn FoodIncomeTC;
    @javafx.fxml.FXML
    private Label DailyRevenueLabel;
    @javafx.fxml.FXML
    private DatePicker DP;
    @javafx.fxml.FXML
    private TableColumn MerchandiseTC;
    @javafx.fxml.FXML
    private TableColumn TicketIncomeTC;
    @javafx.fxml.FXML
    private TableColumn TotalRevenueTC;
    @javafx.fxml.FXML
    public void initialize() {

        DailyRevenueLabel.setText("Daily Revenue");
    }
    @javafx.fxml.FXML
    public void LoadOA(ActionEvent actionEvent) {
        if (DP.getValue() == null) {

            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText(
                    "Please select a date."
            );
            alert.showAndWait();

        } else {

            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setContentText(
                    "Revenue information loaded successfully."
            );
            alert.showAndWait();
        }
    }

    @javafx.fxml.FXML
    public void DownloadReportOA(ActionEvent actionEvent) {
        if (DP.getValue() == null) {

            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText(
                    "Please select a date before downloading the report."
            );
            alert.showAndWait();

        } else {

            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setContentText(
                    "Daily revenue report downloaded successfully."
            );
            alert.showAndWait();
        }
    }
}


