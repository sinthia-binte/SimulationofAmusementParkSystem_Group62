package Veronica.TourGuide;

import Veronica.SceneSwitcher;
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
        NotificationCB.getItems().addAll(new Notification(1,"Roller Coaster","Zone A","Ride closed for maintenance.","10:00 AM",101,"Ride Closure","New"),
                new Notification(2,"Ferris Wheel","Zone B","Opening delayed due to weather.","12:00 PM",102,"Delay Notice","New"),
                new Notification(3,"Water Park","Zone C","Temporary closure for cleaning.","2:00 PM",103,"Attraction Update","New"));

    }

    @javafx.fxml.FXML
    public void viewNotificationOA(Event event) {

        Notification notification = NotificationCB.getValue();
        if (notification != null) {
            TitleTF.setText(notification.getTitle());
            AttractionTF.setText(notification.getName());
            DescriptionTA.setText(notification.getDescription());
            StatusTF.setText(notification.getStatus());

        }
    }

    @javafx.fxml.FXML
    public void acknowledgeOA(ActionEvent actionEvent) {

        Notification notification = NotificationCB.getValue();
        if (notification != null) {
            notification.setStatus("Read");
            StatusTF.setText("Read");
            ConfirmationLabel.setText("Notification acknowledged successfully.");
        }


    }

    @javafx.fxml.FXML
    public void BackToDashboardOA(ActionEvent actionEvent) {

        SceneSwitcher.switchScene(actionEvent, "/Veronica/TourGuide/TourGuideDashBoardView.fxml", "Tour Guide Dashboard");
    }

}
