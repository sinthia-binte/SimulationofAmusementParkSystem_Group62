package Sinthia.SecurityInCharge;

import javafx.event.ActionEvent;
import javafx.scene.control.*;

public class SecurityThreatManagementViewController {
    @javafx.fxml.FXML
    private TextArea correctiveActionTA;
    @javafx.fxml.FXML
    private ComboBox personnelCB;
    @javafx.fxml.FXML
    private TableColumn personnelTC;
    @javafx.fxml.FXML
    private TableColumn locationTC;
    @javafx.fxml.FXML
    private TableColumn riskAreaTC;
    @javafx.fxml.FXML
    private TextField incidentLocationTF;
    @javafx.fxml.FXML
    private TextField highRiskAreaTF;
    @javafx.fxml.FXML
    private ComboBox incidentTypeCB;
    @javafx.fxml.FXML
    private TableColumn incidentTypeTC;
    @javafx.fxml.FXML
    private TextField frequencyTF;
    @javafx.fxml.FXML
    private TableView threatTableView;
    @javafx.fxml.FXML
    private TableColumn frequencyTC;

    @javafx.fxml.FXML
    public void saveThreatButtonOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void updateThreatButtonOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void deleteThreatButtonOA(ActionEvent actionEvent) {
    }
}
