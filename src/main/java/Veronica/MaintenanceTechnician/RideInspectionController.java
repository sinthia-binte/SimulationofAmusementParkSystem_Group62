package Veronica.MaintenanceTechnician;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class RideInspectionController
{
    @javafx.fxml.FXML
    private TextField RideNameTF;
    @javafx.fxml.FXML
    private ComboBox<String> RideCB;
    @javafx.fxml.FXML
    private TextField RideStatusTF;
    @javafx.fxml.FXML
    private TextArea FindingsTA;
    @javafx.fxml.FXML
    private ComboBox<String> ConditionCB;
    @javafx.fxml.FXML
    private TextArea NotesTA;
    @javafx.fxml.FXML
    private TextField MaintenanceDateTF;
    @javafx.fxml.FXML
    private TextField SafetyHistoryTF;
    @javafx.fxml.FXML
    private Label AlertmessageLabel;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void submitInspectionOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void reviewInspectionOA(ActionEvent actionEvent) {
    }

    @Deprecated
    public void loadRideDetailsOA(ActionEvent actionEvent) {
    }
}