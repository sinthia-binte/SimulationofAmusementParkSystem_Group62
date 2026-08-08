package Sinthia.EventCoordinator;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class IncidentViewController {
    @javafx.fxml.FXML
    private TextField incidentIdTF;
    @javafx.fxml.FXML
    private TextField locationTF;
    @javafx.fxml.FXML
    private TableColumn locationTC;
    @javafx.fxml.FXML
    private ComboBox incidentTypeCB;
    @javafx.fxml.FXML
    private TableColumn incidentTypeTC;
    @javafx.fxml.FXML
    private AnchorPane AncorpaneVeiw;
    @javafx.fxml.FXML
    private ComboBox statusCB;
    @javafx.fxml.FXML
    private TableColumn statusTC;
    @javafx.fxml.FXML
    private TableView tableView;
    @javafx.fxml.FXML
    private TableColumn serialNoTC;

    @javafx.fxml.FXML
    public void updateStatusButtonOA(ActionEvent actionEvent) {
    }
}
