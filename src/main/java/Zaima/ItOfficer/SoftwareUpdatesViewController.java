package Zaima.ItOfficer;

import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;

public class SoftwareUpdatesViewController {
    @javafx.fxml.FXML
    private TableColumn SizeTC;
    @javafx.fxml.FXML
    private TableColumn VersionTC;
    @javafx.fxml.FXML
    private TableColumn StatusTC;
    @javafx.fxml.FXML
    private Label SoftwareUpdatesLabel;
    @javafx.fxml.FXML
    private TableColumn UpdateNameTC;
    @javafx.fxml.FXML
    public void initialize() {
        SoftwareUpdatesLabel.setText("Software Updates");
    }

    @javafx.fxml.FXML
    public void CheckUpdatesOA(ActionEvent actionEvent) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Software Updates");
        alert.setHeaderText("Updates Checked");
        alert.setContentText(
                "Software update check completed.\n" +
                        "New updates are available."
        );
        alert.showAndWait();
    }

    @javafx.fxml.FXML
    public void InstallUpdatesOA(ActionEvent actionEvent) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Software Updates");
        alert.setHeaderText("Update Installed");
        alert.setContentText(
                "The selected software update has been installed successfully."
        );
        alert.showAndWait();
    }
}
