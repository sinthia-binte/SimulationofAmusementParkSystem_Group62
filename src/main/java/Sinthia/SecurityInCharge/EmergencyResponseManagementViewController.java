package Sinthia.SecurityInCharge;

import javafx.event.ActionEvent;
import javafx.scene.control.*;

public class EmergencyResponseManagementViewController {
    @javafx.fxml.FXML
    private ComboBox emergencyPlanCB;
    @javafx.fxml.FXML
    private TextArea responseActionTA;
    @javafx.fxml.FXML
    private ComboBox drillTypeCB;
    @javafx.fxml.FXML
    private TableColumn planTC;
    @javafx.fxml.FXML
    private DatePicker drillDateDP;
    @javafx.fxml.FXML
    private ComboBox emergencyTypeCB;
    @javafx.fxml.FXML
    private TableColumn drillDateTC;
    @javafx.fxml.FXML
    private TextField participantsTF;
    @javafx.fxml.FXML
    private TableColumn responseTC;
    @javafx.fxml.FXML
    private TableColumn drillTypeTC;
    @javafx.fxml.FXML
    private TableColumn emergencyTypeTC;
    @javafx.fxml.FXML
    private TableView emergencyTableView;
    @javafx.fxml.FXML
    private TextArea evacuationTA;

    @javafx.fxml.FXML
    public void saveEmergencyButtonOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void updateEmergencyButtonOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void deleteEmergencyButtonOA(ActionEvent actionEvent) {
    }
}
