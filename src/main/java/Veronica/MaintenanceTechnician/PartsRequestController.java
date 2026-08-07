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
    private TextField StatusTF;

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

    ArrayList<PartsRequest> list = BinaryFileUtil.readObjects("Equipment.bin");


    @FXML
    public void initialize() {

    }



    @FXML
    public void loadEquipmentDetailsOA(ActionEvent actionEvent) {


        for(PartsRequest p : list) {
            RideCB.getItems().add(p.getRideId());

        }

        String id = RideCB.getValue();



        for(PartsRequest p : list) {
            if(p.getRideId().equals(id)) {
                selectedRide = p;
                HistoryTF.setText("Maintenance history available");
                StatusTF.setText(p.getStatus());
                break;

            }

        }

    }

    @FXML
    public void reviewRequestOA(ActionEvent actionEvent) {
        ReviewTF.setText("Part Name: " + PartNameTF.getText() + "\nQuantity: " + QuantityTF.getText() + "\nSpecification: " + SpecificationTF.getText());

    }

    @FXML
    public void submitRequestOA(ActionEvent actionEvent) {
        if(selectedRide == null) {
            NotificationTF.setText("Select equipment first.");
            return;

        }

        if(PartNameTF.getText().isBlank() || QuantityTF.getText().isBlank()) {
            NotificationTF.setText("Complete request information.");
            return;

        }
        int quantity;


        try {
            quantity = Integer.parseInt(QuantityTF.getText());


        }
        catch(NumberFormatException e) {
            NotificationTF.setText("Quantity must be a number.");
            return;

        }
        String requestId = RequestIDTF.getText();
        PartsRequest request = new PartsRequest(
                requestId,
                selectedRide.getRideId(),
                selectedRide.getRideName(),
                PartNameTF.getText(),
                quantity,
                SpecificationTF.getText(),
                "Maintenance Technician",
                "Pending");

        BinaryFileUtil.appendObject("PartsRequest.bin", request);
        RequestIDTF.setText(requestId);
        NotificationTF.setText("Request sent to Inventory Supervisor.");

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
