package Veronica.MaintenanceTechnician;

import Veronica.BinaryFileUtil;
import Veronica.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.security.KeyStore;
import java.time.LocalDate;
import java.util.ArrayList;


public class RideInspectionController {


    @FXML
    private TextField RideNameTF;

    @FXML
    private ComboBox<String> RideCB;

    @FXML
    private TextField RideStatusTF;

    @FXML
    private TextArea FindingsTA;

    @FXML
    private ComboBox<String> ConditionCB;

    @FXML
    private TextArea NotesTA;

    @FXML
    private TextField MaintenanceDateTF;

    @FXML
    private TextField SafetyHistoryTF;

    @FXML
    private Label AlertmessageLabel;

    private ArrayList<RideInspection> rides;

    private RideInspection selectedRide;
    ArrayList<RideInspection> list = BinaryFileUtil.readObjects("MaintenanceTask.bin");

    @FXML
    public void initialize() {
        ConditionCB.getItems().addAll("Safe", "Under Maintenance", "Critical");
    }

    @Deprecated
    public void loadRideDetailsOA(ActionEvent event) {
        for(RideInspection ride : rides){
            RideCB.getItems().add(ride.getRideName());

        }
        rides = BinaryFileUtil.readObjects("MaintenanceTask.bin");
        String name = RideCB.getValue();
        if(name == null){
            return;

        }
        for(RideInspection ride : rides){
            if(ride.getRideName().equals(name)){
                selectedRide = ride;
                RideNameTF.setText(ride.getRideName());
                RideStatusTF.setText(ride.getStatus());
                SafetyHistoryTF.setText(ride.getSafetyHistory());
                MaintenanceDateTF.setText(String.valueOf(ride.getLastMaintenanceDate()));
                break;
            }}

    }
    @FXML
    public void reviewInspectionOA(ActionEvent event) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Inspection Review");
        alert.setHeaderText("Inspection Details");alert.setContentText(
                "Ride Name: " + RideNameTF.getText()
                        + "\nStatus: "
                        + RideStatusTF.getText()
                        + "\nFindings: "
                        + FindingsTA.getText()
                        + "\nCondition: "
                        + ConditionCB.getValue()
                        + "\nNotes: "
                        + NotesTA.getText());
        alert.show();

    }

    @FXML
    public void submitInspectionOA(ActionEvent event) {
        if(selectedRide == null){
            AlertmessageLabel.setText("Please select ride first.");
            return;
        }
        if(FindingsTA.getText().isEmpty() || ConditionCB.getValue() == null){
            AlertmessageLabel.setText("Complete inspection details.");
            return;

        }
        int id = list.size() + 1;
        RideInspection inspection = new RideInspection(id,
                selectedRide.getRideId(),
                selectedRide.getRideName(),
                selectedRide.getSafetyHistory(),
                selectedRide.getStatus(),
                FindingsTA.getText(),
                ConditionCB.getValue(),
                NotesTA.getText(),
                "Maintenance Technician",
                LocalDate.now(),
                selectedRide.getLastMaintenanceDate());

        BinaryFileUtil.appendObject("RideInspection.bin", inspection);
        AlertmessageLabel.setText("Inspection saved. ID: " + id);

    }

    @FXML
    public void BACKOA(ActionEvent event) {
        SceneSwitcher.switchScene(event, "/com/oop/simulationofamusementparksystem_group62/Veronica/MaintenanceTechnician/MaintenanceTechnicianDashboard.fxml", "Maintenance Technician Dashboard");

    }

}
