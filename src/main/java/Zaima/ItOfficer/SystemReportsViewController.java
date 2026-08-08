package Zaima.ItOfficer;

import javafx.event.ActionEvent;
import javafx.scene.control.*;

public class SystemReportsViewController {
    @javafx.fxml.FXML
    private DatePicker ToDP;
    @javafx.fxml.FXML
    private ComboBox ReportTypeCB;
    @javafx.fxml.FXML
    private Label SystemReportsLabel;
    @javafx.fxml.FXML
    private TableColumn ActivityTC;
    @javafx.fxml.FXML
    private TableColumn DescriptionTC;
    @javafx.fxml.FXML
    private TableColumn UserTC;
    @javafx.fxml.FXML
    private TableColumn DateTC;
    @javafx.fxml.FXML
    private DatePicker FromDP;
    @javafx.fxml.FXML
    public void initialize() {
        SystemReportsLabel.setText("System Reports");

        ReportTypeCB.getItems().addAll(
                "User Activity",
                "System Activity",
                "Security Activity"
        );
    }

    @javafx.fxml.FXML
    public void DownLoadOA(ActionEvent actionEvent) {

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("System Reports");
        alert.setHeaderText("Report Downloaded");
        alert.setContentText(
                "The generated system report has been downloaded successfully."
        );
        alert.showAndWait();
    }

    @javafx.fxml.FXML
    public void GenerateOA(ActionEvent actionEvent) {
        if (ReportTypeCB.getValue() == null) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText("Please select a report type.");
            alert.showAndWait();
        }

        else if (FromDP.getValue() == null) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText("Please select the From date.");
            alert.showAndWait();
        }

        else if (ToDP.getValue() == null) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText("Please select the To date.");
            alert.showAndWait();
        }

        else {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setContentText("System report generated successfully.");
            alert.showAndWait();
        }
    }
}
