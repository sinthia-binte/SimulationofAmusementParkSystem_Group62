package Veronica.MaintenanceTechnician;

import Veronica.BinaryFileUtil;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

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


    private RideInspection selectedRide;


    @FXML
    public void initialize() {

        ConditionCB.getItems().addAll("Safe", "Under Maintenance", "Critical");
        loadRides();
       // RideCB.setOnAction(e -> loadRideDetails());

    }


    public void loadRides() {

        ArrayList<RideInspection> rides = BinaryFileUtil.readObjects("RideInspection.bin");


        for (RideInspection r : rides) {RideCB.getItems().add(r.getRideName());

        }

    }
    public void loadRideDetails() {

        String name = RideCB.getValue();
        ArrayList<RideInspection> rides = BinaryFileUtil.readObjects("RideInspection.bin");


        for (RideInspection r : rides) {
            if (r.getRideName().equals(name)) {
                selectedRide = r;
                RideNameTF.setText(r.getRideName());
                SafetyHistoryTF.setText(r.getSafetyHistory());
                RideStatusTF.setText(r.getStatus());
                MaintenanceDateTF.setText(String.valueOf(r.getLastMaintenanceDate()));
                break;

            }

        }

    }


    @FXML
    public void reviewInspectionOA(ActionEvent actionEvent) {

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Inspection Review");
        alert.setHeaderText("Inspection Details");
        alert.setContentText(
                "Ride Name: " + RideNameTF.getText()
                        + "\nSafety History: " + SafetyHistoryTF.getText()
                        + "\nLast Maintenance: " + MaintenanceDateTF.getText()
                        + "\nStatus: " + RideStatusTF.getText()
                        + "\nFindings: " + FindingsTA.getText()
                        + "\nCondition: " + ConditionCB.getValue()
                        + "\nNotes: " + NotesTA.getText()
        );
        alert.show();

    }


    @FXML
    public void submitInspectionOA(ActionEvent actionEvent) {


        if (selectedRide == null) {AlertmessageLabel.setText("Select a ride first");
            return;

        }


        if (FindingsTA.getText().isEmpty() || ConditionCB.getValue() == null) {
            AlertmessageLabel.setText("Complete inspection details");
            return;

        }



        RideInspection report = new RideInspection(
                        1001,
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

        BinaryFileUtil.appendObject("RideInspection.bin", report);
        AlertmessageLabel.setText("Report saved ID: " + report.getReportId());

    }


}