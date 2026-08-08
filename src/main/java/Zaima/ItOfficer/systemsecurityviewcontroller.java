package Zaima.ItOfficer;

import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
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
    public void initialize() {
        SystemSecurityLabel.setText("System Security");
        SecurityAlerts.setText("No security alerts.");
    }

    @javafx.fxml.FXML
    public void RefreshOA(ActionEvent actionEvent) {
        SecurityAlerts.setText(
                "Security Check Completed\n" +
                        "Login Activity: Normal\n" +
                        "Unauthorized Access: None\n" +
                        "System Status: Secure"
        );

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("System Security");
        alert.setHeaderText("Security Information Refreshed");
        alert.setContentText("The latest security information has been refreshed.");
        alert.showAndWait();
    }

    @javafx.fxml.FXML
    public void BlockUserOA(ActionEvent actionEvent) {
        SecurityAlerts.setText(
                "Security Alert\n" +
                        "Selected user has been blocked.\n" +
                        "Access has been denied."
        );

        Alert alert = new Alert(Alert.AlertType.WARNING);
        alert.setTitle("Security Alert");
        alert.setHeaderText("User Blocked");
        alert.setContentText("The selected user has been blocked.");
        alert.showAndWait();
    }

    @javafx.fxml.FXML
    public void AllowAccessOA(ActionEvent actionEvent) {
        SecurityAlerts.setText(
                "Security Update\n" +
                        "Access has been allowed.\n" +
                        "User can access the system."
        );

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("System Security");
        alert.setHeaderText("Access Allowed");
        alert.setContentText("Access has been allowed for the selected user.");
        alert.showAndWait();
    }
}
