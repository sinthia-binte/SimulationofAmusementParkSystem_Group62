package Veronica.MaintenanceTechnician;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class MaintenancetDashboardController
{
    @javafx.fxml.FXML
    private Label TechnicianNameLabel;
    @javafx.fxml.FXML
    private Label CompletedTaskLabel;
    @javafx.fxml.FXML
    private Label ProgressTaskLabel;
    @javafx.fxml.FXML
    private TextArea AlertTA;
    @javafx.fxml.FXML
    private Label PendingTaskLabel;
    @javafx.fxml.FXML
    private TextField MaintenanceTechnicianTF;
    @javafx.fxml.FXML
    private TextField TechnicianNameTF;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void openHistoryOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void logoutOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void openReportIssueOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void openAssignedTasksOA(ActionEvent actionEvent) {
    }
}