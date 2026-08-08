package Zaima.ItOfficer;

import javafx.event.ActionEvent;
import javafx.scene.control.*;

public class systemperformanceviewcontroller {
    @javafx.fxml.FXML
    private TableView SystemPerformanceTV;
    @javafx.fxml.FXML
    private TableColumn MemoryTC;
    @javafx.fxml.FXML
    private Label SystemPerformanceLabel;
    @javafx.fxml.FXML
    private TextArea ErrorLogsTA;
    @javafx.fxml.FXML
    private TableColumn StatusTC;
    @javafx.fxml.FXML
    private TableColumn ResponseTimeTC;
    @javafx.fxml.FXML
    private TableColumn ServiceTC;
    @javafx.fxml.FXML
    private TableColumn CPUUsageTC;
    @javafx.fxml.FXML
    public void initialize() {
        SystemPerformanceLabel.setText("System Performance");
        ErrorLogsTA.setText("No errors recorded.");
    }

    @javafx.fxml.FXML
    public void ViewLogsOA(ActionEvent actionEvent) {
        ErrorLogsTA.setText(
                "System Performance Check\n" +
                        "CPU Usage: Normal\n" +
                        "Memory Usage: Normal\n" +
                        "Server Status: Running\n" +
                        "Response Time: Normal\n" +
                        "Services: Running"
        );

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("System Performance");
        alert.setHeaderText("System Running Smoothly");
        alert.setContentText("No system performance problems were detected.");
        alert.showAndWait();
    }

    @javafx.fxml.FXML
    public void RefreshOA(ActionEvent actionEvent) {
        ErrorLogsTA.setText(
                "Performance data refreshed.\n" +
                        "CPU Usage: Normal\n" +
                        "Memory Usage: Normal\n" +
                        "Server Status: Running\n" +
                        "Response Time: Normal\n" +
                        "Services: Running"
        );
    }
}


