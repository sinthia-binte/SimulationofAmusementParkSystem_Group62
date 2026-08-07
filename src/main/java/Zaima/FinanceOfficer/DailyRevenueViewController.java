package Zaima.FinanceOfficer;

import javafx.event.ActionEvent;
import javafx.scene.chart.PieChart;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;

public class DailyRevenueViewController {
    @javafx.fxml.FXML
    private TableColumn FoodIncomeTC;
    @javafx.fxml.FXML
    private PieChart PieChart;
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
    public void LoadOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void DownloadReportOA(ActionEvent actionEvent) {
    }
}
