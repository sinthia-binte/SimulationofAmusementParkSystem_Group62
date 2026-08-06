package Zaima.ItOfficer;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextArea;

public class systemsecurityviewcontroller {
    @javafx.fxml.FXML
    private TableColumn IPAddressTC;
    @javafx.fxml.FXML
    private TableColumn UserNameTC;
    @javafx.fxml.FXML
    private TableColumn LoginTimeTC;
    @javafx.fxml.FXML
    private TableColumn StatusTC;
    @javafx.fxml.FXML
    private TextArea SecurityAlerts;
    @javafx.fxml.FXML
    private Label SystemSecurityLabel;

    @javafx.fxml.FXML
    public void RefreshOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void BlockUserOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void AllowAccessOA(ActionEvent actionEvent) {
    }
}
