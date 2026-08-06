package Veronica.TourGuide;

import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class NotificationController
{
    @javafx.fxml.FXML
    private TextArea DescriptionTA;
    @javafx.fxml.FXML
    private TextField StatusTF;
    @javafx.fxml.FXML
    private TextField TitleTF;
    @javafx.fxml.FXML
    private ComboBox<Notification> NotificationCB;
    @javafx.fxml.FXML
    private TextField AttractionTF;
    @javafx.fxml.FXML
    private Label ConfirmationLabel;

    @javafx.fxml.FXML
    public void initialize() {

    }

    @javafx.fxml.FXML
    public void viewNotificationOA(Event event) {
    }

    @javafx.fxml.FXML
    public void acknowledgeOA(ActionEvent actionEvent) {
    }
}