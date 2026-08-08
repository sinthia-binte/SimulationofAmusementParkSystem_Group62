package Veronica.MaintenanceTechnician;

import Veronica.BinaryFileUtil;
import Veronica.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

import java.util.ArrayList;

public class EquipmentStatusController {

    @FXML
    private TextField CurrentStatusTF;

    @FXML
    private ComboBox<String> RideCB;

    @FXML
    private ComboBox<String> StatusCB;

    @FXML
    private TextField LastInspectionTF;

    @FXML
    private TextField FaultHistoryTF;

    private EquipmentStatus selectedEquipment;

    ArrayList<EquipmentStatus> equipmentList = BinaryFileUtil.readObjects("MaintenanceTask.bin");
    @FXML
    private TextField ReviewTF;
    @FXML
    private TextField NotificationTF;

    @FXML
    public void initialize() {

        StatusCB.getItems().addAll("Active", "Under Maintenance", "Out of Service");
    }

    @FXML
    public void loadEquipmentDetailsOA(ActionEvent event) {

        for (EquipmentStatus equipment : equipmentList) {
            RideCB.getItems().add(equipment.getEquipmentId());
        }
        String equipmentId = RideCB.getValue();

        if (equipmentId == null) {NotificationTF.setText("Please select equipment.");
            return;
        }

        for (EquipmentStatus equipment : equipmentList) {

            if (equipment.getEquipmentId().equals(equipmentId)) {
                selectedEquipment = equipment;
                CurrentStatusTF.setText(equipment.getStatus());
                LastInspectionTF.setText(String.valueOf(equipment.getLastInspectionDate()));
                FaultHistoryTF.setText(equipment.getFaultHistory());
                break;
            }
        }
    }

    @FXML
    public void reviewStatusOA(ActionEvent event) {

        if (selectedEquipment == null) {
            ReviewTF.setText("Please load equipment details first.");
            return;
        }

        if (StatusCB.getValue() == null) {
            ReviewTF.setText("Please select a new status.");
            return;
        }

        ReviewTF.setText("Equipment ID : "
                        + selectedEquipment.getEquipmentId()
                        + "\nCurrent Status : "
                        + CurrentStatusTF.getText()
                        + "\nNew Status : "
                        + StatusCB.getValue()
                        + "\nLast Inspection : "
                        + LastInspectionTF.getText()
                        + "\nFault History : "
                        + FaultHistoryTF.getText());
    }

    @FXML
    public void updateStatusOA(ActionEvent event) {
        if (selectedEquipment == null) {
            NotificationTF.setText("Please load equipment details first.");
            return;
        }

        if (StatusCB.getValue() == null) {
            NotificationTF.setText("Please select a new status.");
            return;
        }

        if (selectedEquipment.getStatus().equals("Critical") && StatusCB.getValue().equals("Active")) {
            NotificationTF.setText("Critical equipment cannot be activated.");

            return;
        }

        EquipmentStatus statusRecord = new EquipmentStatus(

                        selectedEquipment.getEquipmentId(),
                        selectedEquipment.getEquipmentName(),
                        selectedEquipment.getStatus(),
                        StatusCB.getValue(),
                        LastInspectionTF.getText(),
                        FaultHistoryTF.getText(),
                        "Maintenance Technician"
                );

        BinaryFileUtil.appendObject("EquipmentStatus.bin", statusRecord);

        CurrentStatusTF.setText(StatusCB.getValue());

        NotificationTF.setText("Equipment status updated successfully.");
    }

    @FXML
    public void clearFormOA(ActionEvent event) {
        RideCB.getSelectionModel().clearSelection();
        StatusCB.getSelectionModel().clearSelection();
        CurrentStatusTF.clear();
        LastInspectionTF.clear();
        FaultHistoryTF.clear();
        ReviewTF.clear();
        NotificationTF.clear();
        selectedEquipment = null;
    }

    @FXML
    public void backToDashboardOA(ActionEvent event) {

        SceneSwitcher.switchScene(event, "/Veronica/MaintenanceTechnician/MaintenanceTechnicianDashboard.fxml", "Maintenance Technician Dashboard");
    }
}
