package Veronica.MaintenanceTechnician;

import Veronica.BinaryFileUtil;
import Veronica.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.util.ArrayList;

public class EquipmentStatusController {


    @FXML
    private TextField CurrentStatusTF;

    @FXML
    private TextField ReviewTF;

    @FXML
    private ComboBox<String> RideCB;

    @FXML
    private ComboBox<String> StatusCB;

    @FXML
    private TextField LastInspectionTF;

    @FXML
    private TextField FaultHistoryTF;

    @FXML
    private TextField NotificationTF;


    public Equipment selectedEquipment;



    @FXML
    public void initialize() {

        StatusCB.getItems().addAll(
                "Active",
                "Under Maintenance",
                "Out of Service"
        );


        loadEquipment();


        RideCB.setOnAction(e -> loadEquipmentDetails());

    }



    // Event-1: Load available rides/equipment
    private void loadEquipment() {


        ArrayList<Equipment> equipmentList =
                BinaryFileUtil.readObjects("Equipment.bin");


        for(Equipment equipment : equipmentList){

            RideCB.getItems().add(
                    equipment.getEquipmentId()
            );

        }

    }





    // Event-2 & Event-3: Retrieve equipment information
    private void loadEquipmentDetails() {


        String equipmentId =
                RideCB.getValue();


        ArrayList<Equipment> equipmentList =
                BinaryFileUtil.readObjects("Equipment.bin");



        for(Equipment equipment : equipmentList){


            if(equipment.getEquipmentId()
                    .equals(equipmentId)){


                selectedEquipment = equipment;


                CurrentStatusTF.setText(
                        equipment.getStatus()
                );


                LastInspectionTF.setText(
                        String.valueOf(
                                equipment.getLastInspectionDate()
                        )
                );


                FaultHistoryTF.setText(
                        equipment.getFaultHistory()
                );


                break;

            }

        }

    }




    @FXML
    public void loadEquipmentDetailsOA(ActionEvent event){

        loadEquipmentDetails();

    }





    // Event-7: Review before saving
    @FXML
    public void reviewStatusOA(ActionEvent event){


        if(selectedEquipment == null){

            ReviewTF.setText(
                    "Please select equipment first."
            );

            return;

        }



        ReviewTF.setText(

                "Equipment ID: "
                        + selectedEquipment.getEquipmentId()

                        + "\nCurrent Status: "
                        + CurrentStatusTF.getText()

                        + "\nNew Status: "
                        + StatusCB.getValue()

                        + "\nLast Inspection: "
                        + LastInspectionTF.getText()

                        + "\nFault History: "
                        + FaultHistoryTF.getText()

        );

    }





    // Event-5 & Event-6: Validate and save status change
    @FXML
    public void updateStatusOA(ActionEvent event){


        if(selectedEquipment == null){

            NotificationTF.setText(
                    "Select equipment first."
            );

            return;

        }



        if(StatusCB.getValue() == null){

            NotificationTF.setText(
                    "Select a new status."
            );

            return;

        }



        // Validation rule
        if(selectedEquipment.getStatus()
                .equals("Critical")
                &&
                StatusCB.getValue()
                        .equals("Active")){


            NotificationTF.setText(
                    "Critical equipment cannot be activated."
            );

            return;

        }




        EquipmentStatus statusRecord =
                new EquipmentStatus(

                        selectedEquipment.getEquipmentId(),

                        selectedEquipment.getEquipmentName(),

                        selectedEquipment.getStatus(),

                        StatusCB.getValue(),

                        LastInspectionTF.getText(),

                        FaultHistoryTF.getText(),

                        "Maintenance Technician"

                );



        // Event-8 & Event-9: Save update and audit log
        BinaryFileUtil.appendObject(
                "EquipmentStatus.bin",
                statusRecord
        );



        NotificationTF.setText(

                "Status updated successfully."
                        + "\nNew Status: "
                        + StatusCB.getValue()

        );


        CurrentStatusTF.setText(
                StatusCB.getValue()
        );

    }





    @FXML
    public void clearFormOA(ActionEvent event){


        RideCB.getSelectionModel()
                .clearSelection();


        StatusCB.getSelectionModel()
                .clearSelection();


        CurrentStatusTF.clear();

        LastInspectionTF.clear();

        FaultHistoryTF.clear();

        ReviewTF.clear();

        NotificationTF.clear();


        selectedEquipment = null;

    }





    @FXML
    public void backToDashboardOA(ActionEvent event){


        SceneSwitcher.switchScene(
                event,
                "/Veronica/MaintenanceTechnician/MaintenanceTechnicianDashboard.fxml",
                "Maintenance Technician Dashboard"
        );

    }

}
