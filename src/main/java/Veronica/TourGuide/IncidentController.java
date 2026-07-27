package Veronica.TourGuide;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class IncidentController
{
    @javafx.fxml.FXML
    private TextArea ConfirmationTA;
    @javafx.fxml.FXML
    private ComboBox<String> SessionCB;
    @javafx.fxml.FXML
    private TextField GuestNameTF;
    @javafx.fxml.FXML
    private TextArea DescriptionTA;
    @javafx.fxml.FXML
    private TextField TimeTF;
    @javafx.fxml.FXML
    private TextField EvidenceTF;
    @javafx.fxml.FXML
    private TextField LocationTF;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void submitReportOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void reviewReportOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void uploadEvidenceOA(ActionEvent actionEvent) {
    }
}