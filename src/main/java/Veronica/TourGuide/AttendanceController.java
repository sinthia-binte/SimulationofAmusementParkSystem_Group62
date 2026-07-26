package Veronica.TourGuide;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;

public class AttendanceController
{
    @javafx.fxml.FXML
    private TableColumn<Attendance,String> StatusColumn;
    @javafx.fxml.FXML
    private TextArea ConfirmationTA;
    @javafx.fxml.FXML
    private ComboBox<String> StatusCB;
    @javafx.fxml.FXML
    private TableColumn <Attendance,String> GuestNameColumn;
    @javafx.fxml.FXML
    private ComboBox<String> SessionCB;
    @javafx.fxml.FXML
    private TableView<Attendance> AttendanceTable;

    @javafx.fxml.FXML
    public void initialize() {

        SessionCB.getItems().addAll("City History Tour","Nature Adventure");


    }

    @javafx.fxml.FXML
    public void saveAttendanceOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void markAttendanceOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void loadGuestListOA(ActionEvent actionEvent) {
    }
}