package Veronica.TourGuide;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;

import java.util.ArrayList;


public class AttendanceController {
    @FXML
    private ComboBox<String> SessionCB;
    @FXML
    private ComboBox<String> GuestCB;

    @FXML
    private ComboBox<String> StatusCB;

    @FXML
    private Label ConfirmationLabel;

    @FXML
    private Label ReviewLabel;

    ObservableList<Attendance> attendanceList =
            FXCollections.observableArrayList();

    @FXML
    public void initialize() {
        SessionCB.getItems().addAll("City Tour", "Historical Tour", "Nature Adventure");
        StatusCB.getItems().addAll("Present", "Absent", "Late");

    }
    @FXML
    public void loadGuestListOA(ActionEvent event) {
        GuestCB.getItems().clear();

        GuestCB.getItems().addAll("John", "David", "Sarah");

    }
    @FXML
    public void markAttendanceOA(ActionEvent event) {

        Attendance attendance = new Attendance(SessionCB.getValue(), GuestCB.getValue(), StatusCB.getValue());
        attendanceList.add(attendance);
        ConfirmationLabel.setText("Attendance marked.");

    }
    @FXML
    public void reviewAttendanceOA(ActionEvent event) {
        String data = "";
        for(Attendance a : attendanceList){
            data += a.getGuestName()
                    + " - "
                    + a.getStatus()
                    + "\n";

        }
        ReviewLabel.setText(data);
    }
    @FXML
    public void saveAttendanceOA(ActionEvent event) {
        ArrayList<Attendance> list = new ArrayList<>(attendanceList);
      //  BinaryFileUtil.saveList("attendance.bin", //list);

        ConfirmationLabel.setText("Attendance saved successfully.");

    }

}
