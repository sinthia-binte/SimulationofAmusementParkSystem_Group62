package Veronica.TourGuide;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class GuestRegistrationController
{
    @javafx.fxml.FXML
    private TextArea GuestDetailsTA;
    @javafx.fxml.FXML
    private TextField PaymentTF;
    @javafx.fxml.FXML
    private TextField ContactTF;
    @javafx.fxml.FXML
    private TextArea PreviewTA;
    @javafx.fxml.FXML
    private ComboBox<String> TourSessionCB;
    @javafx.fxml.FXML
    private TextField NumberGuestTF;
    @javafx.fxml.FXML
    private TextField GroupNameTF;

    @javafx.fxml.FXML
    public void initialize() {
        TourSessionCB.getItems().addAll("CityTour - Morning","Histroical Tour","Nature Adventure ","Food Tour");
    }

    @javafx.fxml.FXML
    public void submitRegistrationOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void previewRegistrationOA(ActionEvent actionEvent) {
    }
}