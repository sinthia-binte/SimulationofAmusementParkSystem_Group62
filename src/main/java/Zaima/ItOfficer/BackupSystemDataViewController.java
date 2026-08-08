package Zaima.ItOfficer;

import javafx.event.ActionEvent;
import javafx.scene.control.*;

public class BackupSystemDataViewController {
    @javafx.fxml.FXML
    private Label BackupSystemDataLabel;
    @javafx.fxml.FXML
    private ComboBox BackupTypeCB;
    @javafx.fxml.FXML
    private TextField StorageLocationTF;
    @javafx.fxml.FXML
    private TextArea BackupLogTA;

    @javafx.fxml.FXML
    public void initialize() {
        BackupTypeCB.getItems().clear();
        BackupTypeCB.getItems().addAll(
                "Files",
                "Database",
                "Full System Backup"
        );

    }
    @javafx.fxml.FXML
    public void StartBackupOA(ActionEvent actionEvent) {
        String backupType = BackupTypeCB.getValue();
        String storageLocation = StorageLocationTF.getText();

        if (backupType == null || backupType.isEmpty()) {

            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Backup Error");
            alert.setHeaderText(null);
            alert.setContentText("Please select a backup type.");
            alert.showAndWait();
            return;
        }

        if (storageLocation.isEmpty()) {

            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Backup Error");
            alert.setHeaderText(null);
            alert.setContentText("Please enter a storage location.");
            alert.showAndWait();
            return;
        }

        BackupLogTA.setText(
                "Backup Type: " + backupType +
                        "\nStorage Location: " + storageLocation +
                        "\nStatus: Backup completed successfully."
        );

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Backup Complete");
        alert.setHeaderText(null);
        alert.setContentText("Backup completed successfully.");
        alert.showAndWait();
    }
    }

    @javafx.fxml.FXML
    public void BrowseOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void CancelOA(ActionEvent actionEvent) {
        BackupTypeCB.setValue(null);
        StorageLocationTF.clear();
        BackupLogTA.clear();
    }
