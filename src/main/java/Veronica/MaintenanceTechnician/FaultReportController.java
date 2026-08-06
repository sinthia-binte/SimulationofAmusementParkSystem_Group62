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
    private TextField EquipmentNameTF;

    @FXML
    private TextArea EquipmentHistoryTA;

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


    private FaultReport selectedRide;


    @FXML
    public void initialize() {

        SeverityCB.getItems().addAll("Low", "Medium", "High", "Critical");
        loadRides();

        RideCB.setOnAction(e -> loadRideDetails());

    }


    public void loadRides() {

        ArrayList<FaultReport> reports = BinaryFileUtil.readObjects("FaultReport.bin");

        for(FaultReport r : reports) {
            RideCB.getItems().add(r.getRideId());

        }

    }


    public void loadRideDetails() {
        String id = RideCB.getValue();

        ArrayList<FaultReport> reports = BinaryFileUtil.readObjects("FaultReport.bin");


        for(FaultReport r : reports) {

            if(r.getRideId().equals(id)) {
                selectedRide = r;
                EquipmentNameTF.setText(r.getRideName());
                EquipmentHistoryTA.setText("Previous Fault: " + r.getFaultDescription());
                break;

            }

        }

    }


    @FXML
    public void reviewReportOA(ActionEvent actionEvent) {
        ReviewTA.setText("Equipment: "
                        + EquipmentNameTF.getText()
                        + "\nFault Description: "
                        + FaultDescriptionTA.getText()
                        + "\nSeverity: "
                        + SeverityCB.getValue()
                        + "\nObserved Issue: "
                        + ObservedIssueTA.getText()
        );

    }



    @FXML
    public void submitReportOA(ActionEvent actionEvent) {


        if(selectedRide == null) {NotificationTA.setText("Select equipment first");
            return;
        }
        if(FaultDescriptionTA.getText().isEmpty() || SeverityCB.getValue() == null) {
            NotificationTA.setText("Complete fault information");
            return;
        }
        String id = "FR" + (int)(Math.random()*10000);



        FaultReport report = new FaultReport(
                        id,
                        selectedRide.getRideId(),
                        selectedRide.getRideName(),
                        FaultDescriptionTA.getText(),
                        SeverityCB.getValue(),
                        ObservedIssueTA.getText(),
                        "Maintenance Technician"
                );



        BinaryFileUtil.appendObject("FaultReport.bin", report);
        FaultReportIDTF.setText(id);


        NotificationTA.setText("Fault report sent to Supervisor\nSeverity: " + SeverityCB.getValue());

    }



    @FXML
    public void clearFormOA(ActionEvent actionEvent) {
        FaultDescriptionTA.clear();
        ObservedIssueTA.clear();
        ReviewTA.clear();
        NotificationTA.clear();
        FaultReportIDTF.clear();
        SeverityCB.setValue(null);

    }

    @FXML
    public void BackToDashBoardOA(ActionEvent actionEvent) {
        SceneSwitcher.switchScene(
                actionEvent,
                "/Veronica/MaintenanceTechnician/MaintenanceTechnicianDashboard.fxml",
                "Maintenance Technician Dashboard"
        );
    }
}