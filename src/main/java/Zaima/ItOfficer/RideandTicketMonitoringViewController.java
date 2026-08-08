package Zaima.ItOfficer;

import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;

public class RideandTicketMonitoringViewController {

        @javafx.fxml.FXML
        private TableView TableTV;

        @javafx.fxml.FXML
        private TableColumn RideTC;

        @javafx.fxml.FXML
        private TableColumn RideStatusTC;

        @javafx.fxml.FXML
        private TableColumn ScannerTC;

        @javafx.fxml.FXML
        private TableColumn ConnectionTC;

        @javafx.fxml.FXML
        private TextArea MonitoringLogsTA;

        @javafx.fxml.FXML
        public void initialize() {
            MonitoringLogsTA.setText("No monitoring problems detected.");
        }

        @javafx.fxml.FXML
        public void RefreshOA(ActionEvent actionEvent) {

            MonitoringLogsTA.setText(
                    "Monitoring Refreshed\n" +
                            "Ride Status: Normal\n" +
                            "Scanner: Working\n" +
                            "Connection: Connected"
            );

            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Ride and Ticket Monitoring");
            alert.setHeaderText("Monitoring Refreshed");
            alert.setContentText("Ride and ticket monitoring information has been refreshed.");
            alert.showAndWait();
        }

        @javafx.fxml.FXML
        public void ViewDetailsOA(ActionEvent actionEvent) {

            MonitoringLogsTA.setText(
                    "Ride Details\n" +
                            "Ride Status: Running\n" +
                            "Scanner: Working\n" +
                            "Connection: Connected"
            );

            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Ride Details");
            alert.setHeaderText("Ride and Ticket Information");
            alert.setContentText(
                    "Ride Status: Normal\n" +
                            "Scanner: Working\n" +
                            "Connection: Connected"
            );
            alert.showAndWait();
        }
    }

