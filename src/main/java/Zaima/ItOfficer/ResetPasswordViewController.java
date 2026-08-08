package Zaima.ItOfficer;

import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TableColumn;

public class ResetPasswordViewController {
    @javafx.fxml.FXML
    private Label ResetPasswordLabel;
    @javafx.fxml.FXML
    private TableColumn ConfirmPasswordTC;
    @javafx.fxml.FXML
    private TableColumn NewPasswordTC;
    @javafx.fxml.FXML
    private TableColumn UserNameTC;
    @javafx.fxml.FXML
    private TableColumn UserIDTC;
    @javafx.fxml.FXML
    private PasswordField NewPasswordPF;
    @javafx.fxml.FXML
    private PasswordField ConfirmPasswordPF;
    @javafx.fxml.FXML
    private TableColumn EmailTC;

    @javafx.fxml.FXML
    public void CancelOA(ActionEvent actionEvent) {
        NewPasswordPF.clear();
        ConfirmPasswordPF.clear();
    }

    @javafx.fxml.FXML
    public void SaveOA(ActionEvent actionEvent) { String newPassword = NewPasswordPF.getText();
        String confirmPassword = ConfirmPasswordPF.getText();

        if (newPassword.isEmpty() || confirmPassword.isEmpty()) {

            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Password Validation Error");
            alert.setHeaderText(null);
            alert.setContentText("Please enter and confirm the new password.");
            alert.showAndWait();
            return;
        }

        if (newPassword.length() < 8) {

            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Password Validation Error");
            alert.setHeaderText(null);
            alert.setContentText("Password must be at least 8 characters long.");
            alert.showAndWait();
            return;
        }

        if (!newPassword.equals(confirmPassword)) {

            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Password Validation Error");
            alert.setHeaderText(null);
            alert.setContentText("Passwords do not match.");
            alert.showAndWait();
            return;
        }

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Password Reset");
        alert.setHeaderText(null);
        alert.setContentText("Password has been updated successfully.");
        alert.showAndWait();

        NewPasswordPF.clear();
        ConfirmPasswordPF.clear();

    }
}
