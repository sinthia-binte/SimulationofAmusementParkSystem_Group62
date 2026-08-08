package Veronica.MaintenanceTechnician;

import Veronica.BinaryFileUtil;
import Veronica.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.time.LocalDate;
import java.util.ArrayList;


public class MaintenanceRecordController {


    @FXML
    private TextField IssuesFixedTF;

    @FXML
    private ComboBox<String> rideCB;

    @FXML
    private TextField WorkDescriptionTF;

    @FXML
    private TextField partsField;

    @FXML
    private Label messageLabel;

    @FXML
    private TextField historyTF;
    private MaintenanceTask selectedTask;

    @FXML
    public void initialize() {

    }
    @FXML
    public void reviewMaintenanceOA(ActionEvent actionEvent) {
        ArrayList<MaintenanceTask> tasks = null;
        for (MaintenanceTask task : tasks) {
            rideCB.getItems().add(task.getEquipmentId());

        }
        String equipmentId = rideCB.getValue();
        tasks = BinaryFileUtil.readObjects("MaintenanceTask.bin");
        for (MaintenanceTask task : tasks) {
            if (task.getEquipmentId().equals(equipmentId)) {
                selectedTask = task;
                WorkDescriptionTF.setText(task.getWorkDone());
                partsField.setText(task.getPartsUsed());
                IssuesFixedTF.setText(task.getCompletionNotes());
                historyTF.setText("Equipment ID: "
                        + task.getEquipmentId()
                        + "\nStatus: "
                        + task.getCurrentStatus()
                        + "\nDate: "
                        + task.getCompletionDate());
                break;

            }

        }


    }

    @FXML
    public void saveMaintenanceOA(ActionEvent actionEvent) {
        if(selectedTask == null){
            messageLabel.setText("Select a maintenance record first.");
            return;

        }

        MaintenanceTask record = new MaintenanceTask(
                selectedTask.getTaskId(),
                selectedTask.getEquipmentId(),
                selectedTask.getTaskDescription(),
                selectedTask.getLocation(),
                "Completed",
                WorkDescriptionTF.getText(),
                partsField.getText(),
                IssuesFixedTF.getText(),
                "Maintenance Technician",
                "Saved",
                LocalDate.now());

        BinaryFileUtil.appendObject("MaintenanceRecord.bin", record);
        messageLabel.setText("Maintenance record saved successfully.");

    }

    @FXML
    public void BackOA(ActionEvent actionEvent) {
        SceneSwitcher.switchScene(actionEvent, "/com/oop/simulationofamusementparksystem_group62/Veronica/MaintenanceTechnician/MaintenanceTechnicianDashboard.fxml", "Maintenance Technician Dashboard");

    }

}
