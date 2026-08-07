package Veronica.MaintenanceTechnician;

import Veronica.BinaryFileUtil;
import Veronica.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.util.ArrayList;

public class FaultReportController {

    @FXML
    private ComboBox<String> RideCB;

    @FXML
    private TextArea FaultDescriptionTA;

    @FXML
    private ComboBox<String> SeverityCB;

    @FXML
    private TextArea ObservedIssueTA;

    @FXML
    private TextArea ReviewTA;

    @FXML
    private TextField FaultReportIDTF;

    @FXML
    private TextArea NotificationTA;

    @FXML
    private TextArea EquipmentHistoryTF;

    @FXML
    private TextField EquipmentNameTF;


    private ArrayList<FaultReport> reports;

    private FaultReport selectedRide;


    @FXML
    public void initialize() {

        SeverityCB.getItems().addAll("Low", "Medium", "High", "Critical");
        reports = BinaryFileUtil.readObjects("MaintenanceTask.bin");
        loadRide();
    }


    private void loadRide() {

        for (FaultReport r : reports) {
            RideCB.getItems().add(r.getRideId());
        }
    }



    @FXML
    public void loadRideDetailsOA(ActionEvent event) {
        String id = RideCB.getValue();
        if (id == null) {
            NotificationTA.setText("Please select equipment.");
            return;
        }


        for (FaultReport r : reports) {
            if (r.getRideId().equals(id)) {
                selectedRide = r;
                EquipmentNameTF.setText(r.getRideName());
                EquipmentHistoryTF.setText("Previous Fault: " + r.getFaultDescription());
                break;
            }
        }
    }



    @FXML
    public void reviewReportOA(ActionEvent event) {

        ReviewTA.setText("Equipment: "
                        + EquipmentNameTF.getText()
                        + "\nFault Description: "
                        + FaultDescriptionTA.getText()
                        + "\nSeverity: "
                        + SeverityCB.getValue()
                        + "\nObserved Issue: "
                        + ObservedIssueTA.getText());
    }

    @FXML
    public void submitReportOA(ActionEvent event) {
        if (selectedRide == null) {NotificationTA.setText("Select equipment first.");
            return;
        }


        if (FaultDescriptionTA.getText().isEmpty() || SeverityCB.getValue() == null) {
            NotificationTA.setText("Complete fault information.");
            return;
        }
        String id = "FR" + (reports.size() + 1);

        FaultReport report =
                new FaultReport(id, selectedRide.getRideId(),
                        selectedRide.getRideName(),
                        FaultDescriptionTA.getText(),
                        SeverityCB.getValue(),
                        ObservedIssueTA.getText(),
                        "Maintenance Technician");

        BinaryFileUtil.appendObject("MaintenanceTask.bin", report);
        FaultReportIDTF.setText(id);
        NotificationTA.setText("Fault report sent to Supervisor\nSeverity: " + SeverityCB.getValue());
    }


    @FXML
    public void clearFormOA(ActionEvent event) {

        RideCB.getSelectionModel().clearSelection();
        SeverityCB.getSelectionModel().clearSelection();
        EquipmentNameTF.clear();
        EquipmentHistoryTF.clear();
        FaultDescriptionTA.clear();
        ObservedIssueTA.clear();
        ReviewTA.clear();
        NotificationTA.clear();
        FaultReportIDTF.clear();
        selectedRide = null;
    }



    @FXML
    public void BackToDashBoardOA(ActionEvent event) {

        SceneSwitcher.switchScene(event, "/Veronica/MaintenanceTechnician/MaintenanceTechnicianDashboard.fxml", "Maintenance Technician Dashboard");
    }
}
