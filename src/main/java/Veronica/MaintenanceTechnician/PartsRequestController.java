package Veronica.MaintenanceTechnician;

import Veronica.BinaryFileUtil;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.util.ArrayList;

public class PartsRequestController {

    @FXML
    private ComboBox<String> RideCB;

    @FXML
    private TextField HistoryTF;

    @FXML
    private TextField StarusTF;

    @FXML
    private TextField PartNameTF;

    @FXML
    private TextField QuantityTF;

    @FXML
    private TextField SpecificationTF;

    @FXML
    private TextField ReviewTF;

    @FXML
    private TextField RequestIDTF;

    @FXML
    private TextField NotificationTF;


    private PartsRequest selectedRide;


    @FXML
    public void initialize() {

        loadEquipment();

    }


    public void loadEquipment() {

        ArrayList<PartsRequest> list =
                BinaryFileUtil.readObjects("PartsRequest.bin");


        for(PartsRequest p : list) {

            RideCB.getItems().add(
                    p.getRideId()
            );

        }

    }


    @FXML
    public void loadEquipmentDetailsOA(ActionEvent actionEvent) {

        String id = RideCB.getValue();


        ArrayList<PartsRequest> list =
                BinaryFileUtil.readObjects("PartsRequest.bin");


        for(PartsRequest p : list) {

            if(p.getRideId().equals(id)) {

                selectedRide = p;


                HistoryTF.setText(
                        "Previous maintenance available"
                );


                StarusTF.setText(
                        p.getStatus()
                );


                break;

            }

        }

    }



    @FXML
    public void reviewRequestOA(ActionEvent actionEvent) {

        ReviewTF.setText(
                "Part Name: " + PartNameTF.getText()
                        + "\nQuantity: " + QuantityTF.getText()
                        + "\nSpecification: " + SpecificationTF.getText()
        );

    }



    @FXML
    public void submitRequestOA(ActionEvent actionEvent) {


        if(selectedRide == null) {

            NotificationTF.setText(
                    "Select equipment first"
            );

            return;
        }


        if(PartNameTF.getText().isEmpty()
                || QuantityTF.getText().isEmpty()) {

            NotificationTF.setText(
                    "Complete request information"
            );

            return;

        }


        String requestId =
                "PR" + (int)(Math.random()*10000);



        PartsRequest request =
                new PartsRequest(
                        requestId,
                        selectedRide.getRideId(),
                        selectedRide.getRideName(),
                        PartNameTF.getText(),
                        Integer.parseInt(QuantityTF.getText()),
                        SpecificationTF.getText(),
                        "Maintenance Technician",
                        "Pending"
                );



        BinaryFileUtil.appendObject(
                "PartsRequest.bin",
                request
        );


        RequestIDTF.setText(
                requestId
        );


        NotificationTF.setText(
                "Request sent to Inventory Supervisor"
        );

    }



    @FXML
    public void clearFormOA(ActionEvent actionEvent) {

        PartNameTF.clear();
        QuantityTF.clear();
        SpecificationTF.clear();
        ReviewTF.clear();
        RequestIDTF.clear();
        NotificationTF.clear();

    }

}