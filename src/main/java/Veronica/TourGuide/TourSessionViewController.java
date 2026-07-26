package Veronica.TourGuide;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class TourSessionViewController
{

    @javafx.fxml.FXML
    private TextField MeetingPointTF;
    @javafx.fxml.FXML
    private ComboBox<String> CategoryCB;
    @javafx.fxml.FXML
    private TextField StartTimeTF;
    @javafx.fxml.FXML
    private TextArea PreviewTA;
    @javafx.fxml.FXML
    private TextField TitleTF;
    @javafx.fxml.FXML
    private TextField CapacityTF;
    @javafx.fxml.FXML
    private ComboBox<String> DurationCB;
    @javafx.fxml.FXML
    private TextField PriceTF;
    @javafx.fxml.FXML
    private DatePicker DateDP;
    @javafx.fxml.FXML
    private TextArea DescriptionTF;
    @javafx.fxml.FXML
    private TextField EndTimeTF;
    @javafx.fxml.FXML
    private TextField LocationTF;

    @javafx.fxml.FXML
    public void initialize() {
        CategoryCB.getItems().addAll(
                "Adventure", "Historical",  "Nature", "City", "Food");

        DurationCB.getItems().addAll("1 Hour", "2 Hours", "Half Day", "Full Day");
    }



    @Deprecated
    public void save(ActionEvent actionEvent) {


    }



    @javafx.fxml.FXML
    public void saveTourButtonOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void previewButtonOA(ActionEvent actionEvent) {
    }
}