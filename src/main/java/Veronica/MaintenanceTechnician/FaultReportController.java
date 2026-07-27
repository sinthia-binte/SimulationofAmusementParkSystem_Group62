package Veronica.MaintenanceTechnician;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class FaultReportController
{
    @javafx.fxml.FXML
    private ComboBox RideCB;
    @javafx.fxml.FXML
    private TextField EquipmentNameTF;
    @javafx.fxml.FXML
    private TextArea FaultDescriptionTA;
    @javafx.fxml.FXML
    private ComboBox SeverityCB;
    @javafx.fxml.FXML
    private TextArea ObservedIssueTA;
    @javafx.fxml.FXML
    private TextArea ReviewTA;
    @javafx.fxml.FXML
    private TextField FaultReportIDTF;
    @javafx.fxml.FXML
    private TextArea EquipmentHistoryTA;
    @javafx.fxml.FXML
    private TextArea NotificationTA;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void submitReportOA(ActionEvent actionEvent) {
    }


    @javafx.fxml.FXML
    public void clearFormOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void reviewReportOA(ActionEvent actionEvent) {
    }


    @Deprecated
    public void loadRideDetailsOA(ActionEvent actionEvent) {
    }
}