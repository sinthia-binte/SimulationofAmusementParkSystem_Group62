package Veronica.MaintenanceTechnician;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

public class EquipmentStatusController
{
    @javafx.fxml.FXML
    private TextField CurrentStatusTF;
    @javafx.fxml.FXML
    private TextField ReviewTF;
    @javafx.fxml.FXML
    private ComboBox<String> RideCB;
    @javafx.fxml.FXML
    private ComboBox<String> StatusCB;
    @javafx.fxml.FXML
    private TextField LastInspectionTF;
    @javafx.fxml.FXML
    private TextField FaultHistoryTF;
    @javafx.fxml.FXML
    private TextField NotificationTF;

    @javafx.fxml.FXML
    public void initialize() {
        RideCB.getItems().addAll("Ride-001", "Ride-002", "Ride-003", "Equipment-001");
        StatusCB.getItems().addAll("Active", "Under Maintenance", "Out of Service");
    }

    @javafx.fxml.FXML
    public void loadEquipmentDetailsOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void clearFormOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void updateStatusOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void reviewStatusOA(ActionEvent actionEvent) {
    }
}