package Veronica.MaintenanceTechnician;

import Veronica.BinaryFileUtil;
import Veronica.SceneSwitcher;
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

        ConditionCB.getItems().addAll(
                "Safe",
                "Under Maintenance",
                "Critical"
        );

        loadRides();

        RideCB.setOnAction(e -> loadRideDetails());

    }



    private void loadRides() {


        ArrayList<RideInspection> rides =
                BinaryFileUtil.readObjects("Rides.bin");


        for(RideInspection ride : rides){

            RideCB.getItems().add(
                    ride.getRideName()
            );

        }

    }




    private void loadRideDetails() {


        String name = RideCB.getValue();


        ArrayList<RideInspection> rides =
                BinaryFileUtil.readObjects("Rides.bin");


        for(RideInspection ride : rides){


            if(ride.getRideName().equals(name)){


                selectedRide = ride;


                RideNameTF.setText(
                        ride.getRideName()
                );


                RideStatusTF.setText(
                        ride.getStatus()
                );


                SafetyHistoryTF.setText(
                        ride.getSafetyHistory()
                );


                MaintenanceDateTF.setText(
                        String.valueOf(
                                ride.getLastMaintenanceDate()
                        )
                );


                break;

            }

        }

    }





    @FXML
    public void reviewInspectionOA(ActionEvent actionEvent) {


        Alert alert =
                new Alert(Alert.AlertType.INFORMATION);


        alert.setTitle("Inspection Review");

        alert.setHeaderText("Inspection Details");


        alert.setContentText(

                "Ride Name: " + RideNameTF.getText()

                        + "\nStatus: " + RideStatusTF.getText()

                        + "\nSafety History: " + SafetyHistoryTF.getText()

                        + "\nLast Maintenance: " + MaintenanceDateTF.getText()

                        + "\nFindings: " + FindingsTA.getText()

                        + "\nCondition: " + ConditionCB.getValue()

                        + "\nNotes: " + NotesTA.getText()

        );


        alert.showAndWait();

    }





    @FXML
    public void submitInspectionOA(ActionEvent actionEvent) {


        if(selectedRide == null){

            AlertmessageLabel.setText(
                    "Please select a ride."
            );

            return;
        }



        if(FindingsTA.getText().isBlank()
                || ConditionCB.getValue() == null){


            AlertmessageLabel.setText(
                    "Complete inspection information."
            );

            return;

        }



        ArrayList<RideInspection> reports =
                BinaryFileUtil.readObjects(
                        "RideInspection.bin"
                );


        int newReportId =
                reports.size() + 1;




        RideInspection report =
                new RideInspection(

                        newReportId,

                        selectedRide.getRideId(),

                        selectedRide.getRideName(),

                        selectedRide.getSafetyHistory(),

                        selectedRide.getStatus(),

                        FindingsTA.getText(),

                        ConditionCB.getValue(),

                        NotesTA.getText(),

                        "Maintenance Technician",

                        LocalDate.now(),

                        selectedRide.getLastMaintenanceDate()

                );



        BinaryFileUtil.appendObject(
                "RideInspection.bin",
                report
        );


        AlertmessageLabel.setText(
                "Inspection saved. ID: "
                        + newReportId
        );

    }





    @FXML
    public void BACKOA(ActionEvent actionEvent) {


        SceneSwitcher.switchScene(
                actionEvent,
                "/Veronica/MaintenanceTechnician/MaintenanceTechnicianDashboard.fxml",
                "Maintenance Technician Dashboard"
        );

    }

}
